package main.java.framework.controls;

import org.openqa.selenium.By;

public class Label extends Control {
    private String expectedText;

    public Label(By selector, String expectedText){
        this.setSelector(selector);
        this.expectedText = expectedText;
    }

    public String getExpectedText() {
        return expectedText;
    }
}
