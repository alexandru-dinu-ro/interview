package org.example.interview.infra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public abstract class DriverFactory {

  private DriverFactory() {
  }

  public static WebDriver getDriver() {
    return switch (GeneralConfig.BROWSER_TYPE) {
      case CHROME -> new ChromeDriver();
      case EDGE -> new EdgeDriver();
      case FIREFOX -> new FirefoxDriver();
      case SAFARI -> new SafariDriver();
    };
  }
}
