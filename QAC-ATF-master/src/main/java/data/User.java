package main.java.data;

/**
 * Created by chris on 03/09/16.
 */
public class User {
    private String userPID;
    private String password;
    private String userName;

    public String getUserPID() {
        return userPID;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public User(String userPID, String password, String userName) {
        this.userPID = userPID;
        this.password = password;
        this.userName = userName;
    }
}
