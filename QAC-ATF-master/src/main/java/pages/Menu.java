package main.java.pages;

import main.java.framework.controls.Button;
import org.openqa.selenium.By;

public class Menu {
    private Button openCreateMenuButton;
    private Button createTestCaseButton;

    public Menu(){
        openCreateMenuButton = new Button(By.cssSelector("a[class='menu-item-anchor menu-item-expand']"));
        createTestCaseButton = new Button(By.cssSelector("a[data-click*='OM7HOD-Testapp-Work-TestCase']"));
    }

    public Button getOpenCreateMenuButton() {
        return openCreateMenuButton;
    }

    public Button getCreateTestCaseButton() {
        return createTestCaseButton;
    }

    public void createTestCase(){
        getOpenCreateMenuButton().click();
        getCreateTestCaseButton().click();
    }
}
