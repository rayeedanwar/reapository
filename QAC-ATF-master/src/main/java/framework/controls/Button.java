package main.java.framework.controls;

import org.openqa.selenium.By;

/**
 * Created by chris on 03/09/16.
 */
public class Button extends Control {
    public Button(By selector){
        this.setSelector(selector);
    }

}
