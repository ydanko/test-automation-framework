package com.wallethub.tests;

import com.wallethub.data_providers.DataProviderProfileCompany;
import com.wallethub.pages.ProfileCompanyPage;
import com.wallethub.pages_utils.ProfileCompanyUtils;
import com.wallethub.steps.LoginUserSteps;
import com.wallethub.steps.ProfileCompanyUserSteps;
import com.wallethub.utils.BrowserUtils;
import com.wallethub.utils.ConstantUtils;
import com.wallethub.utils.RandomTextUtils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProfileCompanyTest extends BaseTest {

    @Test(dataProvider = "Provider of Star Rating And Value Policy", dataProviderClass = DataProviderProfileCompany.class)
    public void testReviewingAndRatingCompany(String numberStars, String valuePolicy) {
        SoftAssert softAssert = new SoftAssert();
        ProfileCompanyPage profileCompanyPage = new ProfileCompanyPage();

        LoginUserSteps.getStepsUserLogin();
        BrowserUtils.openPage(ConstantUtils.PROFILE_COMPANY_URL);
        ProfileCompanyUserSteps.getStepsUserRatingAndReviewingCompany(numberStars, valuePolicy);
        BrowserUtils.openPage(ConstantUtils.PROFILE_COMPANY_URL);

        Boolean compareActualAndExpectedResultNumberStars = ProfileCompanyUtils.compareFirstWords(profileCompanyPage.getTextLabelStarRating(), numberStars);
        Boolean compareActualAndExpectedResultValuePolicy = ProfileCompanyUtils.compareLastWords(profileCompanyPage.getTextCategoryProduct(), valuePolicy);
        String actualResultTextReview = profileCompanyPage.getTextReview();
        String expectedResultTextReview = RandomTextUtils.RANDOM_WORDS;
        softAssert.assertTrue(compareActualAndExpectedResultNumberStars, " Comparison by the number of stars in the rating");
        softAssert.assertEquals(actualResultTextReview, expectedResultTextReview, "Comparing the text of a company review");
        softAssert.assertTrue(compareActualAndExpectedResultValuePolicy, "Comparing the value of Policy");

    }
}
