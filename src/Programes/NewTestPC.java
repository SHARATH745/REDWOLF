package Programes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTestPC {
	
	public WebDriver driver;
	public Actions action;
	
	
	
	
  @Test
  public void f() {
	  
	  action = new Actions(driver);
	  
	  
	  
	  WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
	  action.moveToElement(ele1).perform();
	  
	  driver.findElement(By.linkText("Windows")).click();
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
	  
	  
	  String moveto_parentwindow = driver.getWindowHandle();
	  
	  
	  
	  for(String winhandle : driver.getWindowHandles())
	  {  
	  driver.switchTo().window(winhandle);
	  }
	  
	  driver.findElement(By.linkText("//*[@id=\"navbar\"]/a[4]")).click();
	  driver.close();
	  
	  driver.switchTo().window(moveto_parentwindow);
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\sharath\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
