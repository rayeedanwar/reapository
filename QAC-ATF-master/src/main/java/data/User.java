package main.java.data;

/**
 * Created by chris on 03/09/16.
 */
public class User {

    private String userName;
    private String password;

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public User(String userName, String password) {
        this.password = password;
        this.userName = userName;
    }
}
