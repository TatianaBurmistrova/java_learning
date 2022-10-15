package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.BrowserType;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

  protected static final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);
  protected boolean acceptNextAlert = true;

  @BeforeSuite(alwaysRun = true)
  public void setUp() throws Exception {
    app.init();
  }

  @AfterSuite(alwaysRun = true)
  public void tearDown() throws Exception {
    app.stop();
  }

  public String closeAlertAndGetItsText() {
    try {
      Alert alert = app.myAlert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
