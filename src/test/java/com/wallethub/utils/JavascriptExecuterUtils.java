package com.wallethub.utils;

import com.wallethub.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavascriptExecuterUtils {
    public static void scrollDownToOpenButtonFromAd(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,400)");
    }

    public static String getHiddenText(WebElement element) {
        String hiddenText = (String) ((JavascriptExecutor) Driver.getDriver()).executeScript(
                "return arguments[0].innerHTML;", element);
        return hiddenText;
    }
}
