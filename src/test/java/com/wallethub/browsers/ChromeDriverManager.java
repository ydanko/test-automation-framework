package com.wallethub.browsers;

import com.wallethub.utils.JsonReaderUtils;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager {

    private static final ChromeOptions CHROME_OPTIONS = new ChromeOptions();
    public static WebDriver createChrome() {

        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        setChromeOptions();
        return new ChromeDriver(CHROME_OPTIONS);
    }

    private static void setChromeOptions() {

        if (Boolean.parseBoolean(JsonReaderUtils.getValueByKey("incognito_mode"))) {
            CHROME_OPTIONS.addArguments("--incognito");
        }
        if (Boolean.parseBoolean(JsonReaderUtils.getValueByKey("full_screen"))) {
            CHROME_OPTIONS.addArguments("--start-maximized");
        }
    }
}
