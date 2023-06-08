package com.wallethub.pages;

import com.wallethub.elements.BaseElement;
import com.wallethub.elements.ButtonElement;
import com.wallethub.elements.TextFieldElement;
import org.openqa.selenium.By;

public class ProfileCompanyPage extends BasePage {
    private static final By UNIQ_LOCATOR_PROFILE_COMPANY_PAGE = By.xpath("//div[@class='profile-header-module profile-comp-header']");
    private static final String NAME_PROFILE_COMPANY_PAGE = "Profile Company";
    ButtonElement buttonElementPolicyDropdown = new ButtonElement(By.xpath("//div[@class='dropdown second']//span[@class='dropdown-placeholder']"), "Button Policy Dropdown");
    BaseElement baseElementTextReview = new BaseElement(By.xpath("//section[@class='rvtab-content']/article[1]//div[contains(@class,'rvtab-ci-content')]"), "Text Review");
    TextFieldElement inputText = new TextFieldElement(By.xpath("//*[@placeholder='Write your review...']"), "Input text review");
    ButtonElement buttonElementSubmit = new ButtonElement(By.xpath("//div[contains(text(),' Submit ')]"), "Button Submit");
    BaseElement baseElementCategoryProduct = new BaseElement(By.xpath("//section[@class='rvtab-content']/article[1]//div[@class='rvtab-ci-category']//span"), "Category Product");
    BaseElement baseElementLabelStarRating = new BaseElement(By.xpath("//section[@class='rvtab-content']/article[1]//div[@class='a11y-hidden-label']"), "Star Rating");

    public ProfileCompanyPage() {
        super(UNIQ_LOCATOR_PROFILE_COMPANY_PAGE, NAME_PROFILE_COMPANY_PAGE);
    }

    public String getTextReview() {
        return baseElementTextReview.waitAndGetText();

    }
    public String getTextCategoryProduct() {
        return baseElementCategoryProduct.waitAndGetText();

    }
    public String getTextLabelStarRating() {
        return baseElementLabelStarRating.getHiddenText();

    }
    public ProfileCompanyPage clickElementStarRating(String numberStars) {
        BaseElement baseElementStarRating = new BaseElement(By.xpath("//div[contains(@class,'review-action ')]//div[@class='rating-box-wrapper']/*[@aria-label='" + numberStars + " star rating']"), "Star rating ");
        baseElementStarRating.waitAndClick();
        return this;

    }
    public ProfileCompanyPage clickButtonPolicyDropdown() {
        buttonElementPolicyDropdown.waitAndClick();
        return this;

    }

    public ProfileCompanyPage clickElementHealthInsurance(String valuePolicy) {
        BaseElement baseElementHealthInsurance = new BaseElement(By.xpath("//ul/li[text()='" + valuePolicy + "']"), "Element Health Insurance ");
        baseElementHealthInsurance.waitAndClick();
        return this;

    }
    public ProfileCompanyPage inputTextReview(String text) {
        inputText.sendText(text);
        return this;

    }
    public ProfileCompanyPage clickButtonSubmit() {
        buttonElementSubmit.waitAndClick();
        return this;

    }

}
