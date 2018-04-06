package main.java.pages;

import main.java.data.PersonalInformation;
import main.java.data.User;
import main.java.framework.controls.*;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OnBoardingCaseType {

    //methods defined by Assignments

    private CheckBox remoteEmployee;
    private TextField office;
    private RadioButton orientationPlan;
    private TextField seatNumber;
    private RadioButton equipmentType;
    private Button getNext;


    //Collect Employee Information

    private TextField firstName;
    private TextField lastName;
    private TextField email;
    private CheckBox contractor;
    private TextField manager;
    private TextField startDate;
    private Button Submit;
    private Button Cancel;
    private Button Save;
    private Button advanceCase;


    //Office Equipment

    public OnBoardingCaseType() {
        this.remoteEmployee = new CheckBox(By.cssSelector("input[id='Remote']"));
        this.office = new TextField(By.cssSelector("input[id='Office']"));
        this.orientationPlan = new RadioButton((By.id("")));
        this.seatNumber = new TextField((By.id("")));
        this.equipmentType = new RadioButton(By.id(""));
        this.firstName = new TextField((By.id("FirstName")));
        this.lastName = new TextField((By.id("LastName")));
        this.email = new TextField((By.name("$PpyWorkPage$pEmployee$pEmail")));
        this.contractor = new CheckBox((By.cssSelector("input[id='Contractor']")));
        this.manager = new TextField((By.cssSelector("input[id='Manager']")));
        this.startDate = new TextField((By.id("StartDate")));
        this.Submit = new Button((By.cssSelector("button[title='Complete this assignment']")));
        this.Cancel = new Button((By.id("")));
        this.Save = new Button((By.id("")));
        this.advanceCase = new Button(By.cssSelector("button[data-click*='pyActivity=FinishAssignment']"));
        this.getNext = new Button(By.cssSelector("button[data-click*='getNextWorkItem']"));


    }

    public void fillAllCaseDetails(PersonalInformation testCase1, int numberOfIncompleteForms) {

        collectEmployeeInformation(testCase1);
        submizzle();
        identifyHomeOffice(testCase1);
        submizzle();


        // select orientation plan

        for(int i=0; i<numberOfIncompleteForms; i++) {

            //needed to have getNext clicked on these increments - couldn't finalise
            if (i==4 || i==11 || i==15) {
                getNext.click();
            } else {advanceCase();}


        }



       // remoteEmployee.click(testCase1.isRemoteEmployee());

       // orientationPlan.enterText(testCase1.getOrientationPlan();
//        seatNumber.enterText(String.valueOf(testCase1.getSeatNumber()));




    }

    public void collectEmployeeInformation(PersonalInformation testCase1) {

        firstName.enterText(testCase1.getFirstName());
        lastName.enterText(testCase1.getLastName());
        email.enterText(testCase1.getEmail());
        contractor.click(testCase1.isContractor());
        manager.enterText(testCase1.getManager());
        startDate.enterText(testCase1.getStartDate());
    }

    public void identifyHomeOffice(PersonalInformation testCase1) {

        office.enterText(testCase1.getOffice());
        remoteEmployee.click(testCase1.isRemoteEmployee());

    }

    public void advanceCase() {

        advanceCase.click();

    }

    public void submizzle() {


        Submit.click();

    }



}
