package com.wallethub.steps;

import com.wallethub.pages.HomePage;

public class LoginUserSteps {

    public static HomePage getStepsUserLogin() {
        return new HomePage()
                .clickButtonLogin()
                .fillAndEnterLogin();

    }
}
