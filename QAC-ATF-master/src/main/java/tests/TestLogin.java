package main.java.tests;

import main.java.data.PersonalInformation;
import main.java.data.User;
import main.java.datamanagers.TestDataManager;
import main.java.datamanagers.UserDataManager;
import main.java.framework.BaseTest;
import main.java.pages.LoginPage;
import main.java.pages.NavigationMenu;
import main.java.pages.OnBoardingCaseType;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {



    @Test
    public void testLogin(){

        //login
        LoginPage loginScreen = new LoginPage();
        NavigationMenu menu = new NavigationMenu();
        OnBoardingCaseType firstTest = new OnBoardingCaseType();
        PersonalInformation testDeets = TestDataManager.getTestCaseOne();
        User caseWorker = UserDataManager.caseWorker();

        loginScreen.login(caseWorker);

        //new onboarding

        menu.createNewOnboarding();

        firstTest.fillAllCaseDetails(testDeets,25);

        // firstTest.submizzle();




    }
}
