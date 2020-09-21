package Programes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTestPC4 {
	
	public WebDriver driver;
	public Actions action;
	
  @Test
  public void f() {
	  
	action = new Actions(driver);
	  
				List<WebElement> allvalues = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getOptions();
				System.out.println(allvalues.get(3).getText());
				
				
				for (int i = 0; i < allvalues.size(); i++) {
					
					System.out.println(allvalues.get(i).getText());
					
				}
				
			
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\sharath\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
