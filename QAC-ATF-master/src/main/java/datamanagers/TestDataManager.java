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

    public static PersonalInformation getTestCaseOne(){
        return new PersonalInformation("Chris","Topher","stopherchris@live.com",true,true,"London","Someone","03/09/2018","Grad Scheme",1);
    }
}
