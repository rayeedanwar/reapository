package main.java.framework.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

/**
 * Created by chris on 14/09/16.
 */
public class CheckBox extends Control {
    public CheckBox(By by){
        this.setSelector(by);
    }

    public void click(boolean isTrue){
        if(isTrue){
            int iterationCounter = 0;
            while(iterationCounter < getBrowser().getSettings().getMaxAttempts()){
                try{
                    getElementWhenReady(getSelector()).click();
                    break;
                } catch (StaleElementReferenceException e){
                    getBrowser().log("Caught StaleElementReferenceException in click method");
                }
            }
        }
    }
}
