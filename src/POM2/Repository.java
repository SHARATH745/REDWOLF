package POM2;

import org.testng.annotations.Test;

import POM3.TestData;
import POM3.locators;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Repository {
	

	public static WebDriver driver;
	public static Actions action;
	
	
@Test(priority = 1)
	  public static void logincheck() {
		  
		  action = new Actions(driver);
		  
		  WebElement ele = driver.findElement(locators.login);
		  action.moveToElement(ele).perform();
		  driver.findElement(locators.email).sendKeys(TestData.email);
		  driver.findElement(locators.password).sendKeys(TestData.password);
		  driver.findElement(locators.login1).click();
	  }


@Test(priority = 2)
public static void Adding_watch_to_cart() throws InterruptedException {
	  

	 WebElement ele1 = driver.findElement(locators.men);
	 action.moveToElement(ele1).perform();
	 Thread.sleep(3000);
	 driver.findElement(locators.fossil).click();
	 Thread.sleep(3000);
	 driver.findElement(locators.select_watch).click();
	 Thread.sleep(3000);
	 driver.findElement(locators.add_to_cart).click();
	
	  
}
	  
@BeforeTest
public static void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver",("C:\\\\\\\\Users\\\\\\\\sharath\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe"));
	  driver = new ChromeDriver();
	  driver.get(TestData.url);
	  driver.manage().window().maximize();
}

  @AfterTest
  public void afterTest() {
  }

}
