package com.wallethub.utils;

import com.wallethub.driver.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
    public static WebElement waitForVisibilityOfElement(By webElementLocator) {
        return new WebDriverWait(Driver.getDriver(), ConstantUtils.WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.visibilityOfElementLocated(webElementLocator));
    }
    public boolean waitForElementToBeNotVisible(By webElementLocator) {
        boolean isElementNotVisible = false;
        try {
            isElementNotVisible = new WebDriverWait(Driver.getDriver(), ConstantUtils.WAIT_TIMEOUT_SECONDS)
                    .until(ExpectedConditions.invisibilityOfElementLocated(webElementLocator));
        } catch (TimeoutException e) {
            isElementNotVisible = true;
        }
        return isElementNotVisible;
    }

    public static Alert waitAlertIsPresent(Alert alert) {
        return new WebDriverWait(Driver.getDriver(), ConstantUtils.WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.alertIsPresent());
    }
    public static WebElement waitForElementToBeClickable(By webElementLocator) {
        return new WebDriverWait(Driver.getDriver(), ConstantUtils.WAIT_TIMEOUT_SECONDS).until(
                ExpectedConditions.elementToBeClickable(webElementLocator));
    }
}
