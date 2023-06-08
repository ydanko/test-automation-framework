package com.wallethub.utils;

import com.wallethub.driver.Driver;
import org.openqa.selenium.By;

public class ActionsUtils {
     public static void moveTooElement(By locator) {
        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(Driver.getDriver());
        actions.moveToElement(Driver.getDriver().findElement(locator));

    }
}

