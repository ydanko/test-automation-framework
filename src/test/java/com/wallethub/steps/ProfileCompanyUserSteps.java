package com.wallethub.steps;

import com.wallethub.pages.ProfileCompanyPage;
import com.wallethub.utils.RandomTextUtils;

public class ProfileCompanyUserSteps {
    public static ProfileCompanyPage getStepsUserRatingAndReviewingCompany(String numberStars,String valuePolicy) {
        return new ProfileCompanyPage()
                .clickElementStarRating(numberStars)
                .clickButtonPolicyDropdown()
                .clickElementHealthInsurance(valuePolicy)
                .inputTextReview(RandomTextUtils.RANDOM_WORDS)
                .clickButtonSubmit();
    }
}


