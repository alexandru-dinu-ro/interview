package org.example.interview;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {

  @BeforeSuite(alwaysRun = true, description = "Setup: test suite")
  public void beforeSuite() {
  }

  @BeforeClass(alwaysRun = true, description = "Setup: test class")
  public void beforeClass() {
  }

  @BeforeMethod(alwaysRun = true, description = "Setup: test method")
  public void beforeMethod() {
  }

  @AfterMethod(alwaysRun = true, description = "Teardown: test method")
  public void afterMethod() {
  }

  @AfterClass(alwaysRun = true, description = "Teardown: test class")
  public void afterClass() {
  }

  @AfterSuite(alwaysRun = true, description = "Teardown: test suite")
  public void afterSuite() {
  }
}
