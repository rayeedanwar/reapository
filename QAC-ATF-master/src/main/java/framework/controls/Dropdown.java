package main.java.framework.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;

public class Dropdown extends Control{
    private HashMap<String, DropdownOption> optionList;

    public Dropdown(By selector) {
        this.setSelector(selector);
        this.optionList = new HashMap<>();
    }

    public void addDropdownOption(String optionName, DropdownOption option){
        optionList.put(optionName, option);
    }

    public void selectFromDropdown(String optionName){
        DropdownOption optionToSelect = optionList.get(optionName);
        int iterationCounter = 0;
        while(iterationCounter < getBrowser().getSettings().getMaxAttempts()){
            try{
                Select dropdown = new Select(getElementWhenReady(this.getSelector()));
                dropdown.selectByValue(optionToSelect.getValue());
            } catch (StaleElementReferenceException e){
                getBrowser().log("Caught StaleElementReferenceException in selectFromDropdown");
            }
        }
    }
}
