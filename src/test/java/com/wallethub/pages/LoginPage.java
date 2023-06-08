package com.wallethub.pages;

import com.wallethub.elements.ButtonElement;
import com.wallethub.elements.TextFieldElement;
import com.wallethub.entity.UserInfo;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private static final By UNIQ_LOCATOR_LOGIN_PAGE = By.id("join-login");
    private static final String NAME_LOGIN_PAGE = "Login";
    TextFieldElement inputEmail = new TextFieldElement(By.id("email"), "InputUserEmail");
    TextFieldElement inputLogin = new TextFieldElement(By.id("password"), "InputUserLogin");
    ButtonElement buttonElementSubmit = new ButtonElement(By.xpath("//button[contains(@class,'reg-tabs-bt touch-element-cl')]"), "Button Submit");

    public LoginPage() {
        super(UNIQ_LOCATOR_LOGIN_PAGE, NAME_LOGIN_PAGE);
    }

    public HomePage fillAndEnterLogin() {
        inputEmail.sendText(UserInfo.USER_NAME_EMAIL);
        inputLogin.sendText(UserInfo.PASSWORD);
        buttonElementSubmit.waitAndClick();
        return new HomePage();

    }

}
