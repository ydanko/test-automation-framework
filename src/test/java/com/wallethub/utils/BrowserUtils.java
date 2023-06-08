package com.wallethub.utils;

import com.wallethub.driver.Driver;

public class BrowserUtils {
      public static void openPage(String url) {
        Driver.getDriver().get(url);

    }
}


