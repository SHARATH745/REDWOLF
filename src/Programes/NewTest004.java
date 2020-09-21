package Programes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest004 {
	
	public WebDriver driver;
	public Actions action;
	
	
  @Test
  public void mouseover() {
	  
	action = new Actions(driver);
	  
	WebElement ele1 = driver.findElement(By.id("ctl00_HyperLinkLogin"));
	action.moveToElement(ele1).perform();
	
	
	WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[16]/ul/li[2]/a"));
	action.moveToElement(ele2).perform();
	
	
	driver.findElement(By.linkText("Member Login")).click();
	
	  
  }
  @BeforeTest
  public void beforeTest() {
	  

	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sharath\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	    
  }

  @AfterTest
  public void afterTest() {
  }

}
