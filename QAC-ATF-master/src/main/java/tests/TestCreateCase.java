package main.java.tests;

import main.java.data.PersonalInformation;
import main.java.data.User;
import main.java.datamanagers.TestDataManager;
import main.java.datamanagers.UserDataManager;
import main.java.framework.BaseTest;
import main.java.pages.LoginPage;
import main.java.pages.Menu;
import main.java.pages.PersonalInformationScreen;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCreateCase extends BaseTest {
    private User caseWorker;

//  @BeforeClass
//  public void login(){
//      LoginScreen loginScreen = new LoginScreen();
//      caseWorker = UserDataManager.getCaseWorker();
//      loginScreen.login(caseWorker);
//  }

//  @Test
//  public void enterCreateCase(){
//      Menu menu = new Menu();
//      menu.createTestCase();
//  }

//  @Test
//  public void fillInPersonalInformation(){
//      PersonalInformationScreen personalInformationScreen = new PersonalInformationScreen();
//      PersonalInformation personalInformation = TestDataManager.getPersonalInformation();
//      personalInformationScreen.getFirstName().enterText(personalInformation.getFirstName());
//      Assert.assertEquals(personalInformationScreen.getFirstNameLabel().getText(), personalInformationScreen.getFirstNameLabel().getExpectedText());
  }

