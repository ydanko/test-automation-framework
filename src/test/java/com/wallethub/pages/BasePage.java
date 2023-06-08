package com.wallethub.pages;

import com.wallethub.driver.Driver;
import com.wallethub.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class BasePage {

    protected WebDriver driver = Driver.initializeDriver();
    private final By uniqLocator;
    private final String name;

    protected BasePage(By locator, String name) {
        this.uniqLocator = locator;
        this.name = name;

    }

    public boolean isPageOpened() {
        return WaitUtils.waitForVisibilityOfElement(uniqLocator).isDisplayed();
    }

    protected BasePage getCurrentUrl(String url) {
        try {
            String currentUrl = driver.getCurrentUrl();
            if (!currentUrl.equals(url)) {
                Assert.fail("Wrong site page!");
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return this;
    }

}
