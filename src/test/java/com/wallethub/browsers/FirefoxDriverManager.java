package com.wallethub.browsers;

import com.wallethub.utils.JsonReaderUtils;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverManager {
    private static final FirefoxOptions FIREFOX_OPTIONS = new FirefoxOptions();

    public static WebDriver createFirefox() {
        WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        setFirefoxOptions();
        return new FirefoxDriver(FIREFOX_OPTIONS);
    }

    private static void setFirefoxOptions() {

        if (Boolean.parseBoolean(JsonReaderUtils.getValueByKey("incognito_mode"))) {
            FIREFOX_OPTIONS.addArguments("-private");
        }
        if (Boolean.parseBoolean(JsonReaderUtils.getValueByKey("full_screen"))) {
            FIREFOX_OPTIONS.addArguments("--window-size=1280,1280");
        }
    }
}
