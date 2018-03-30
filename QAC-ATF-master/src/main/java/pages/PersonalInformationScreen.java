package main.java.pages;

import main.java.framework.controls.Label;
import main.java.framework.controls.TextField;
import org.openqa.selenium.By;

public class PersonalInformationScreen {

    private TextField firstName;
    private Label firstNameLabel;

    public PersonalInformationScreen(){
        this.firstName = new TextField(By.id("FirstName"));
        this.firstNameLabel = new Label(By.cssSelector("label[for='FirstName']"), "First Name");
    }

    public TextField getFirstName() {
        return firstName;
    }

    public Label getFirstNameLabel() {
        return firstNameLabel;
    }
}
