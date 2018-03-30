package main.java.framework.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

/**
 * Created by chris on 03/09/16.
 */
public class TextField extends Control {

    public TextField(By selector){
        super();
        this.setSelector(selector);
    }

    public void enterText(String text){
        enterCharSequence(text);
    }

    public void enterCharSequence(CharSequence cs){
        int iterationCounter = 0;
        while(iterationCounter < getBrowser().getSettings().getMaxAttempts()){
            try{
                WebElement textField = getElementWhenReady(getSelector());
                textField.clear();
                textField.sendKeys(cs);
                break;
            } catch (StaleElementReferenceException e){
                getBrowser().log("Caught StaleElementReferenceException in enterText");
                getBrowser().sleep(getBrowser().getSettings().getSleepTime());
            }
        }
    }
}
