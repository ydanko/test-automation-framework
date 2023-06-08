package com.wallethub.driver;

import com.wallethub.browsers.WebDriverFactory;
import com.wallethub.listeners.WebEventListener;
import com.wallethub.utils.JsonReaderUtils;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Driver {
    private static final ThreadLocal<WebDriver> THREAD_LOCAL_DRIVER = new ThreadLocal<WebDriver>();
    private static WebDriver driver;

    public static WebDriver initializeDriver() {
        if (driver == null) {
            driver = WebDriverFactory.pickBrowsers(DriverManagerType.valueOf(JsonReaderUtils.getValueByKey("browser_name").toUpperCase()));
            EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
            eventFiringWebDriver.register(new WebEventListener());
            THREAD_LOCAL_DRIVER.set(eventFiringWebDriver);
        }
        return getDriver();
    }
    public static synchronized WebDriver getDriver() {
        return THREAD_LOCAL_DRIVER.get();
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;

    }
}
