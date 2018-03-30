package main.java.data;

/**
 * Created by chris on 14/09/16.
 */
public class Demo {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private boolean retired;

    public Demo(String firstName, String lastName, String emailAddress, boolean retired) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.retired = retired;
    }

    public boolean isRetired() {
        return retired;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
