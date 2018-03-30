package main.java.datamanagers;

import main.java.data.User;

/**
 * Created by chris on 03/09/16.
 */
public class UserDataManager {
    public static User getAdminUser(){
        return new User("administrator@pega.com", "install", "Bob");
    }

    public static User getDemoCoUser(){
        return new User("User@DemoCo.com", "rules", "User");
    }

    public static User getQACUser(){
        return new User("User@QAC", "rules", "User");
    }

    public static User getAcademyDev(){
        return new User("SA@TGB", "rules", "");
    }

    public static User getCaseWorker(){
        return new User("user.testapp", "rules", "");
    }
}
