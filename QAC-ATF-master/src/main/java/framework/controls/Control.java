package main.java.framework.controls;

import main.java.framework.Browser;
import main.java.framework.Browsers;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by chris on 03/09/16.
 */
public abstract class Control {
    private By selector;
    private Browser browser;

    public Control(){
        browser = Browsers.getBrowser(Thread.currentThread().getId());
    }

    protected Browser getBrowser(){
        return browser;
    }

    public By getSelector() {
        return selector;
    }

    public void setSelector(By selector) {
        this.selector = selector;
    }

    /**
     * The main method for interacting with generic WebElements. Attempts to obtain element by looping and checking for element presence in the DOM
     * @param by The selector for the element
     * @return The WebElement object for the required element
     * @throws NoSuchElementException
     */
    public WebElement getElementWhenReady(By by) throws NoSuchElementException { //Waits for the element to become available, throws exception when not found
        int iterationCounter = 0;
        (new WebDriverWait(getBrowser().getDriver(), Math.round(getBrowser().getSettings().getTimeout()))).until(ExpectedConditions.presenceOfElementLocated(by));
        while(iterationCounter < getBrowser().getSettings().getMaxAttempts()){
            try{
                return getBrowser().getDriver().findElement(by);
            } catch (NoSuchElementException e){
                getBrowser().log("Caught NoSuchElementException in getElementWhenReady");
                iterationCounter++;
                getBrowser().sleep(getBrowser().getSettings().getSleepTime());
            } catch (StaleElementReferenceException f){
                getBrowser().log("Caught StaleElementReferenceException in getElementWhenReady");
                iterationCounter++;
                getBrowser().sleep(getBrowser().getSettings().getSleepTime());
            }
        }
        throw new NoSuchElementException("Element could not be interacted with");
    }

    public void click(){
        int iterationCounter = 0;
        while(iterationCounter < getBrowser().getSettings().getMaxAttempts()){
            try{
                getElementWhenReady(getSelector()).click();
                break;
            } catch (StaleElementReferenceException e){
                getBrowser().log("Caught StaleElementReferenceException in click method");
                getBrowser().sleep(getBrowser().getSettings().getSleepTime());
            } catch (WebDriverException f){
                if (f.getMessage().contains("Other element would receive the click")){
                    getBrowser().log("Prevented other element receiving click");
                    getBrowser().sleep(getBrowser().getSettings().getSleepTime());
                }
            }
        }
    }

    public String getText(){
        int iterationCounter = 0;
        while (iterationCounter < getBrowser().getSettings().getMaxAttempts()){
            try{
                return getElementWhenReady(getSelector()).getText();
            } catch (StaleElementReferenceException e){
                getBrowser().log("Caught StaleElementReferenceException in getText method");
                getBrowser().sleep(getBrowser().getSettings().getSleepTime());
            }
        }
        return null;
    }
}
