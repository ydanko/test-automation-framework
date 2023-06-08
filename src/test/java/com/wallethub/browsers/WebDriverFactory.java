package com.wallethub.browsers;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManagerException;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {

  public static WebDriver pickBrowsers(DriverManagerType type) {
    switch (type) {
      case FIREFOX:
        return FirefoxDriverManager.createFirefox();
      case CHROME:
        return ChromeDriverManager.createChrome();
      default:
        throw new WebDriverManagerException("IUnexpected browser");
    }
  }
}
