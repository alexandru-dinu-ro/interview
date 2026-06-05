package org.example.interview.pages;

import static org.example.interview.infra.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

  private final WebDriver driver = getDriver();

  public void loadWebpage(String url) {
    System.out.println("Load webpage: " + url);
    driver.get(url);
  }

  public String getWebpageUrl() {
    String url = driver.getCurrentUrl();
    System.out.println("getWebpageUrl() returned: " + url);
    return url;
  }

  public String getWebpageTitle() {
    String result = driver.getTitle();
    System.out.println("getWebpageTitle() returned: " + result);
    return result;
  }

  //TODO: Fix this method
  protected String getText(By locator) {
    String result = "result";
    System.out.println("getText(By locator) returned: " + result);
    return result;
  }

  //TODO: Fix this method
  protected String getAttribute(By locator, String attribute) {
    String result = "result";
    System.out.println("etAttribute(By locator, String attribute) returned: " + result);
    return result;
  }
}
