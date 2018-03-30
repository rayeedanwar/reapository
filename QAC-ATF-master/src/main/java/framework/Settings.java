package main.java.framework;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;

public class Settings {

    private HashMap<String, String> settingsMap = new HashMap<>();

    public String getChromedriverLocation(){
        return getSettingsMap().get("chromedriverlocation");
    }

    public double getTimeout(){
        try{
            return Double.parseDouble(getSettingsMap().get("timeout"));
        } catch (NumberFormatException n){
            throw new RuntimeException("Timeout in settings file is not a number.");
        }
    }

    /**
     * Sleep time needs to be in ms, so multiply timeout by 100. If timeout is 2 seconds, we'll set sleeptime to 200ms
     * @return Sleep time in ms
     */
    public int getSleepTime(){
        return (int)Math.round(getTimeout()*100);
    }

    public int getMaxAttempts(){
        try{
            return Integer.parseInt(getSettingsMap().get("maxattempts"));
        } catch (NumberFormatException n){
            throw new RuntimeException("Max Attempts in settings file is not an integer");
        }
    }

    public BrowserType getBrowserType(){
        return BrowserType.valueOf(getSettingsMap().get("browsertype").toUpperCase());
    }

    public Environment getEnvironment(){
        return new Environment(getSettingsMap().get("environment"));
    }

    public boolean getCloseBrowser(){
        return Boolean.parseBoolean(getSettingsMap().get("closebrowser"));
    }

    public Settings() {
        //Parse settings, load them into a hashmap
        try{
            File settingsFile = new File("config/settings.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(settingsFile);
            doc.normalizeDocument();
            NodeList nodeList = doc.getElementsByTagName("setting");
            for (int temp = 0; temp < nodeList.getLength(); temp++) {
                Node nNode = nodeList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nNode;
                    getSettingsMap().put(element.getAttribute("name"), element.getAttribute("value"));
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Could not parse settings file");
        }
    }

    private HashMap<String, String> getSettingsMap() {
        return settingsMap;
    }
};


