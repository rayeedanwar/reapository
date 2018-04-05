package main.java.pages;

import main.java.data.User;
import main.java.framework.controls.Button;
import main.java.framework.controls.TextField;
import org.openqa.selenium.By;

/**
 * Created by chris on 03/09/16.
 */
public class LoginPage {
    private TextField username;
    private TextField password;
    private Button loginButton;

    public LoginPage(){

        username = new TextField(By.cssSelector("input[id='txtUserID']")); // seeing if css selector works when By.id will too
        password = new TextField(By.cssSelector("input[id='txtPassword']"));
        loginButton = new Button(By.id("sub"));

    }



    public TextField getPasswordWE() {
        return password;
    }

    public TextField getUsernameWE() {
        return username;
        }

    public Button getLoginButton() {
        return loginButton;
    }

    public void login(User user){
        getUsernameWE().enterText(user.getUserName());
        getPasswordWE().enterText(user.getPassword());
        getLoginButton().click();
    }
}
