package main.java.framework;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

/**
 * Created by chris on 03/09/16.
 */

public class Browser {
    private WebDriver driver;
    private Settings settings;

    public Browser(){
        setSettings(new Settings());
        if(Browsers.getBrowser(Thread.currentThread().getId())==null){
            setupDriver(getSettings().getBrowserType());
            Browsers.addBrowser(Thread.currentThread().getId(), this);
        }
    }

    public void setupDriver(BrowserType browserType){
        File chromeDriver = new File(settings.getChromedriverLocation());
        if(browserType == BrowserType.HEADLESS){
            ChromeDriverService chromeDriverServiceHeadless = new ChromeDriverService.Builder()
                    .usingDriverExecutable(chromeDriver)
                    .usingAnyFreePort().withEnvironment(ImmutableMap.of("DISPLAY", ":1")).build();
            try{
                chromeDriverServiceHeadless.start();
            } catch (IOException e){
                log(e.getMessage());
            }
            driver = new ChromeDriver(chromeDriverServiceHeadless);
        } else if (browserType == BrowserType.HEADED){
            ChromeDriverService chromeDriverServiceHeaded = new ChromeDriverService.Builder().
                    usingDriverExecutable(chromeDriver).build();
            driver = new ChromeDriver(chromeDriverServiceHeaded);
        }

    }

    public WebDriver getDriver(){
        return driver;
    }

    public void log(String message){
        System.out.println(message);
    }

    public void sleep(int timeout){
        try{
            Thread.sleep(timeout);
        } catch (InterruptedException e){
            log("Caught InterruptedException while trying to sleep");
        }
    }

    public void loadEnvironment(){
        getDriver().get(getSettings().getEnvironment().getURL());
    }

    public Settings getSettings() {
        return settings;
    }

    private void setSettings(Settings settings) {
        this.settings = settings;
    }
}
