package main.java.datamanagers;

import main.java.data.User;

/**
 * Created by chris on 03/09/16.
 */
public class UserDataManager {
    public static User getAdminUser(){
        return new User("administrator@pega.com", "install");
    }

    public static User getDemoCoUser(){
        return new User("User@DemoCo.com", "rules");
    }

    public static User caseWorker(){
        return new User("User.RanwarQA", "rules");
    }

    public static User getAcademyDev(){
        return new User("SA@TGB", "rules");
    }

    public static User getCaseWorker(){
        return new User("User.Testapp", "rules");
    }
}
