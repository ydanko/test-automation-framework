package com.wallethub.elements;

import org.openqa.selenium.By;

public class TextFieldElement extends BaseElement {
    public TextFieldElement(By locator, String name) {
        super(locator, name);
    }
    public void sendText(String text){
        waitAndFindElement(locator).sendKeys(text);
    }

}
