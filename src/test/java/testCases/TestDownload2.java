package testCases;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDownload2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
 //   baseUrl = "https://www.blazedemo.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testDownlaod() throws Exception {
    // Label: Test
    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1366,657 | ]]
    driver.get("http://172.29.57.252:8082/test-sun-spms/user/bms/home");
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=angular-multi-select[name="businessId"], div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(2)]]
    driver.findElement(By.id("introOrgLevel0")).click();
    driver.findElement(By.id("introOrgProcessing")).click();
    driver.findElement(By.cssSelector("#introBatchMode > a.select2-choice.ui-select-match > span.select2-chosen > span.ng-binding.ng-scope")).click();
    driver.findElement(By.id("introOrgProcessing")).click();
    driver.findElement(By.cssSelector("#introBatchMode > a.select2-choice.ui-select-match > span.select2-chosen > span.ng-binding.ng-scope")).click();
    driver.findElement(By.id("ui-select-choices-row-34-0")).click();
    driver.findElement(By.cssSelector("i.fa.fa-search")).click();
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=angular-multi-select[name="batchList"], div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(2)]]
    driver.findElement(By.id("introOrgLevel0DownloadAll")).click();
    driver.findElement(By.cssSelector("#downloadPopup > div.modal-dialog.approve-model-height.modal-sm > div.modal-content > div.modal-footer > button.btn.bg-pink.bottom-space")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
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


