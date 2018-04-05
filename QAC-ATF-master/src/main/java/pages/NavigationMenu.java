package main.java.pages;

import main.java.framework.controls.Button;
import org.openqa.selenium.By;

public class NavigationMenu {
    private Button openMenuButton;
    private Button createTestCaseButton;
    private Button onboardingButton;
    private Button myWorkButton;
    private Button myTeamsButton;
    private Button casesButton;
    private Button tagsButton;
    private Button mostRecentButton;

    public NavigationMenu() {
        this.openMenuButton = new Button(By.id("appview-nav-toggle-one"));
        this.createTestCaseButton = new Button(By.id("menu-item-$PpyNavigation1522942138374$ppyElements$l1"));
        this.onboardingButton = new Button(By.xpath("//*[@class='menu-item-title']//*[text()='Onboarding']"));
        this.myWorkButton = new Button(By.xpath("//*[@class='menu-item-title']//*[text()='My Work']")); // seeing how (/if?) xpath works
        this.myTeamsButton = new Button(By.cssSelector("li[title='My Teams']"));
        this.casesButton = new Button(By.cssSelector("a[data-ctl data click*='pyCMCases7']"));
        this.tagsButton = new Button(By.cssSelector("li[title='Show tags list']"));
        this.mostRecentButton = new Button(By.cssSelector(""));
    }


    public void openMyWork() {
        openMenuButton.click();
        getMyWorkButton().click();
    }

    public void createNewOnboarding() {
        openMenuButton.click();
        getCreateTestCaseButton().click();
        onboardingButton.click();

    }

    public void openMyTeams() {
        myTeamsButton.click();

    }

    public void openCases() {
        casesButton.click();

    }
    //  public void clickMyWork(){
    //      openMenuButton.click();
    //      getMyWorkButton().click();
    //  }
    //  public void clickMyWork(){
    //      getMyWorkButton().click();
//}




    public Button getOpenMenuButton() {

        return openMenuButton;
    }

    public Button getCreateTestCaseButton() {
        return createTestCaseButton;
    }

    public Button getMyWorkButton() {
        return myWorkButton;
    }

    public Button getMyTeamsButton() {
        return myTeamsButton;
    }

    public Button getCasesButton() {
        return casesButton;
    }

    public Button getTagsButton() {
        return tagsButton;
    }

    public Button getMostRecentButton() {
        return mostRecentButton;
    }


}
