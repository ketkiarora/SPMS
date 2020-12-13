package testCases;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDownload {
  

  public static void main(String[] args) {
	  WebDriverManager.chromedriver().setup();
		
  	
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	  driver = new ChromeDriver();
	  //   baseUrl = "https://www.blazedemo.com/";
	   //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     testDownlaod( driver);
	     tearDown(driver);
	     
} 
 
  public static void testDownlaod(WebDriver driver) {
    // Label: Test
	  driver.findElement(By.id("j_username_txt")).sendKeys("rajesh.arora");
		driver.findElement(By.id("j_password_txt")).sendKeys("12345678");
		driver.findElement(By.xpath("(//*[contains(@type,'submit')])[2]")).click();
	    Select select= new Select(driver.findElement(By.xpath("(//select[@ng-model='applicationProccess.selected'])[2]")));
      select.selectByIndex(0);
      driver.findElement(By.xpath("//button[contains(@ng-click,'getStarted')]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1366,657 | ]]
    driver.get("http://10.241.64.114:8080/mind-bms-web/");
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


  public static void tearDown(WebDriver driver)  {
    driver.quit();
    StringBuffer verificationErrors = new StringBuffer();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

}