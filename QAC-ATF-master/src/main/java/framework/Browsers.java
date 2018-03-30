package main.java.framework;

import java.util.HashMap;

/**
 * Created by chris on 03/09/16.
 */
public class Browsers {
    private static HashMap<Long,Browser> browserHashMap;

    public static Browser getBrowser(Long threadID){
        try{
            return browserHashMap.get(threadID);
        } catch (NullPointerException e){
            return null;
        }
    }

    public static void addBrowser(Long threadID, Browser browser){
        if(browserHashMap == null){
            browserHashMap = new HashMap<>();
        }
        browserHashMap.put(threadID, browser);
    }


}
