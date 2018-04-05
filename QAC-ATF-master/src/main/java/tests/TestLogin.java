package main.java.tests;

import main.java.data.User;
import main.java.datamanagers.UserDataManager;
import main.java.framework.BaseTest;
import main.java.pages.LoginPage;
import main.java.pages.NavigationMenu;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {
    @Test
    public void testLogin(){
        LoginPage loginScreen = new LoginPage();
        User caseWorker = UserDataManager.caseWorker();
        loginScreen.login(caseWorker);
        NavigationMenu menu = new NavigationMenu();
        menu.createNewOnboarding();

        //  menu.openCases();
    }
}
