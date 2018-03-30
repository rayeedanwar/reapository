package main.java.tests;

import main.java.data.User;
import main.java.datamanagers.UserDataManager;
import main.java.framework.BaseTest;
import main.java.pages.LoginScreen;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {
    @Test
    public void testLogin(){
        LoginScreen loginScreen = new LoginScreen();
        User adminUser = UserDataManager.getAcademyDev();
        loginScreen.login(adminUser);
    }
}
