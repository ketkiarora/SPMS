package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			
//			System.setProperty("webdriver.chrome.silentOutput", true);
			ChromeDriver driver= new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver,20);
			
			driver.get("http://10.241.64.114:8080/mind-bms-web/");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Login to SPMS")).click();
			driver.findElement(By.cssSelector("#j_username_txt")).sendKeys("rajesh.arora");
			driver.findElement(By.id("j_password_txt")).sendKeys("12345678");
			driver.findElement(By.xpath("(//*[contains(@type,'submit')])[2]")).click();	
			
			//driver.switchTo().f
	
	}
}
