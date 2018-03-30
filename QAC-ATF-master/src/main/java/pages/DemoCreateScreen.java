package main.java.pages;

import main.java.framework.controls.Button;
import main.java.framework.controls.CheckBox;
import main.java.framework.controls.TextField;
import org.openqa.selenium.By;

/**
 * Created by chris on 14/09/16.
 */
public class DemoCreateScreen {
    private TextField firstName;
    private TextField surname;
    private TextField emailAddress;
    private CheckBox retired;
    private Button submitButton;

    public DemoCreateScreen() {
        this.firstName = new TextField(By.id("FirstName"));
        this.surname = new TextField(By.id("Surname"));
        this.emailAddress = new TextField(By.id("EmailAddress"));
        this.retired = new CheckBox(By.id("Retired"));
        this.submitButton = new Button(By.cssSelector("button[title='Complete this assignment']"));
    }

    public TextField getFirstName() {
        return firstName;
    }

    public TextField getSurname() {
        return surname;
    }

    public TextField getEmailAddress() {
        return emailAddress;
    }

    public CheckBox getRetired() {
        return retired;
    }

    public Button getSubmitButton() {
        return submitButton;
    }
}
