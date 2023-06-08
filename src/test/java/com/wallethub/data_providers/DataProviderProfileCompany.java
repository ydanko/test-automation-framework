package com.wallethub.data_providers;
import com.wallethub.utils.ConstantUtils;
import org.testng.annotations.DataProvider;
public class DataProviderProfileCompany {
    @DataProvider(name = "Provider of Star Rating And Value Policy")
    public static Object[][] provideStarRatingAndValuePolicy() {
        return new Object[][]{
                {ConstantUtils.ONE_STAR_RATING, ConstantUtils.VALUE_POLICY},
                {ConstantUtils.TWO_STAR_RATING, ConstantUtils.VALUE_POLICY},
                {ConstantUtils.THREE_STAR_RATING, ConstantUtils.VALUE_POLICY},
                {ConstantUtils.FOUR_STAR_RATING, ConstantUtils.VALUE_POLICY},
                {ConstantUtils.FIVE_STAR_RATING, ConstantUtils.VALUE_POLICY},
        };
    }
}
