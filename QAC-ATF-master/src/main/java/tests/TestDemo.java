package main.java.tests;

import main.java.data.Demo;
import main.java.datamanagers.TestDataManager;
import main.java.datamanagers.UserDataManager;
import main.java.framework.BaseTest;
import main.java.pages.DemoCreateScreen;
import main.java.pages.LoginScreen;
import main.java.framework.controls.Button;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by chris on 03/09/16.
 */

public class TestDemo extends BaseTest {

    @BeforeClass
    public void testDemo(){
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.login(UserDataManager.getQACUser());
        Button createButton = new Button(By.cssSelector("div[data-click*='pzStartProcessMenu']"));
        getBrowser().sleep(5000);
        createButton.click();
        Button createDemo = new Button(By.cssSelector("a[data-click*='QAC-CDDemoApp-Work-Demo'][data-click*='pyStartCase']"));
        createDemo.click();
    }

    @Test
    public void createDemoCase(){
        DemoCreateScreen createScreen = new DemoCreateScreen();
        Demo demoData = TestDataManager.getDemoData();
        createScreen.getFirstName().enterText(demoData.getFirstName());
        createScreen.getSurname().enterText(demoData.getLastName());
        createScreen.getEmailAddress().enterText(demoData.getEmailAddress());
        createScreen.getRetired().click(demoData.isRetired());
        getBrowser().sleep(getBrowser().getSettings().getSleepTime());
        createScreen.getSubmitButton().click();
        getBrowser().sleep(getBrowser().getSettings().getSleepTime());
        getBrowser().log("Passed");
    }
}
