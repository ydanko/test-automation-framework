package com.wallethub.pages;

import com.wallethub.elements.ButtonElement;
import com.wallethub.utils.ConstantUtils;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private static final By UNIQ_LOCATOR_HOME_PAGE = By.id("homepage");
    private static final String NAME_HOME_PAGE = "HomePage";
    ButtonElement buttonElementLogin = new ButtonElement(By.xpath("//a[@class='login']"), "Button Login");

    public HomePage() {
        super(UNIQ_LOCATOR_HOME_PAGE, NAME_HOME_PAGE);
    }

    public LoginPage clickButtonLogin() {
        buttonElementLogin.waitAndClick();
        return new LoginPage();
    }

    public HomePage openPage() {
        driver.get(ConstantUtils.BASE_URL);
        getCurrentUrl(ConstantUtils.BASE_URL);
        return this;
    }

}
