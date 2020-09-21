package POM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Repository1 {
	
	public static WebDriver driver;
	
	
  @Test
  public static void login() {
	
	  	
	  	
	    driver.findElement(Locators.loginbutton).click();
	    driver.findElement(Locators.email).sendKeys(TestData.email);
		driver.findElement(Locators.Password).sendKeys(TestData.Password);
		driver.findElement(Locators.loginbutton).click();
	  
  }
  @BeforeTest
  public static void beforeTest() {
	  
			System.setProperty("webdriver.chrome.driver", "\"C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\sharath\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe\"");
			    driver = new ChromeDriver();
				driver.get(TestData.url);
				driver.manage().window().maximize(); 
  
  }

  @AfterTest
  public void afterTest() {
  }

}
