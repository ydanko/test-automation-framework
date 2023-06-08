package com.wallethub.tests;

import com.wallethub.driver.Driver;
import com.wallethub.listeners.LogListener;
import com.wallethub.pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import static com.wallethub.utils.JsonReaderUtils.fileToMapConfig;

@Listeners(LogListener.class)
public class BaseTest {

    @BeforeSuite
    public static void readConfigData() {
        fileToMapConfig();
    }

    @BeforeMethod
    public void openHomePage() {
        new HomePage().openPage();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        Driver.closeDriver();
    }
}
