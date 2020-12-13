package testCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestReportNames {
	public static void main(String[] args) throws Exception {
		 WebDriverManager.chromedriver().setup();
			
    	
			ChromeDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver,30).ignoring(StaleElementReferenceException.class);
			
			driver.get("http://10.241.64.114:8080/mind-bms-web/");
			driver.manage().window().maximize();
		//	driver.findElement(By.linkText("Login to SPMS")).click();
			driver.findElement(By.id("j_username_txt")).sendKeys("rajesh.arora");
			driver.findElement(By.id("j_password_txt")).sendKeys("12345678");
			driver.findElement(By.xpath("(//*[contains(@type,'submit')])[2]")).click();
		    Select select= new Select(driver.findElementByXPath("(//select[@ng-model='applicationProccess.selected'])[2]"));
	        select.selectByIndex(1);
	        driver.findElement(By.xpath("//button[contains(@ng-click,'getStarted')]")).click();
	        
	      
	        
	       WebElement businessStream= driver.findElement(By.xpath("(//*[@id='2']/div[1])[3]"));
	       wait.until(ExpectedConditions.elementToBeClickable(businessStream)).click();
	       WebElement region= driver.findElement(By.xpath("//*[@id='introBusinessStreamsFilter']/angular-multi-select/div[2]/div[3]/div[2]/div[2]"));
	       wait.until(ExpectedConditions.elementToBeClickable(region)).click();
	       driver.findElement(By.xpath("//button[@id='introOrgLevel0']")).click();
	       driver.findElement(By.xpath("(//a[@name='unitProfitLoss'])[1]")).click();
	       driver.findElementByXPath("(//div[@class='ams-button-text ng-binding'])[33]").click();
	       Thread.sleep(5000);
	       driver.findElementByXPath("(//input[contains(@placeholder,'Search...')])[39]").sendKeys("GB-NA-SUN BRANDED-ONCOLOGY");
	       WebElement orgLevel1= driver.findElement(By.xpath("//*[@id='introReportOrgLevelFilter']/angular-multi-select/div[2]/div[3]/div[1]/div[2]"));
	       Thread.sleep(5000);
	       wait.until(ExpectedConditions.elementToBeClickable(orgLevel1)).click();
	       Thread.sleep(5000);
		   WebElement outside= driver.findElement(By.xpath("(//div[@class='panel-body no-padding'])[4]"));
		   wait.until(ExpectedConditions.elementToBeClickable(outside)).click();
		
		 
		
		
		
	}
	

}
