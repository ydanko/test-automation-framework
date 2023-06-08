package com.wallethub.elements;

import com.wallethub.driver.Driver;
import com.wallethub.utils.ActionsUtils;
import com.wallethub.utils.JavascriptExecuterUtils;
import com.wallethub.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseElement {
    By locator;
    String name;
    public BaseElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }
    public By getLocator() {
        return locator;
    }

    public String getName() {
        return name;
    }
    public void waitAndClick() {
        waitAndFindElement(locator).click();
    }
      public void moveToElement() {
        ActionsUtils.moveTooElement(locator);
    }
    public String waitAndGetText() {
        return waitAndFindElement(locator).getText();
    }

    public String getHiddenText() {
        return JavascriptExecuterUtils.getHiddenText(Driver.getDriver().findElement(locator));
    }

    public String waitAndGetAttribute() {
        return waitAndFindElement(locator).getAttribute("innerHTML");
    }

    public boolean waitAndIsDisplayed() {
        return waitAndFindElement(locator).isDisplayed();
    }
    public WebElement waitAndFindElement(By locator) {
        WaitUtils.waitForVisibilityOfElement(locator);
        return Driver.getDriver().findElement(locator);
    }
}
