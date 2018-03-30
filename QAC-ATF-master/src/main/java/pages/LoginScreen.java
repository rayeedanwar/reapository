package main.java.pages;

import main.java.data.User;
import main.java.framework.controls.Button;
import main.java.framework.controls.TextField;
import org.openqa.selenium.By;

/**
 * Created by chris on 03/09/16.
 */
public class LoginScreen {
    private TextField userPIDField;
    private TextField passwordField;
    private Button loginButton;

    public LoginScreen(){
        userPIDField = new TextField(By.id("txtUserID"));
        passwordField = new TextField(By.id("txtPassword"));
        loginButton = new Button(By.cssSelector("button[class='loginButton']"));

    }

    public TextField getUserPIDField() {
        return userPIDField;
    }

    public TextField getPasswordField() {
        return passwordField;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public void login(User user){
        getUserPIDField().enterText(user.getUserPID());
        getPasswordField().enterText(user.getPassword());
        getLoginButton().click();
    }
}
