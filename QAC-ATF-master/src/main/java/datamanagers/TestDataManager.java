package main.java.datamanagers;

import main.java.data.Demo;
import main.java.data.PersonalInformation;

/**
 * Created by chris on 14/09/16.
 */
public class TestDataManager {
    public static Demo getDemoData(){
        return new Demo("Bill", "Bailey", "bill@blackbooks.co.uk", false);
    }

    public static PersonalInformation getPersonalInformation(){
        return new PersonalInformation("Chris");
    }
}
