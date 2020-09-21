package Programes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class NewTest002 {
	
	public WebDriver driver;

  @Test
  public void alert() throws InterruptedException {
	  
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
	  Thread.sleep(3000);
	  String str = driver.switchTo().alert().getText();
	  Thread.sleep(3000);
	  System.out.println(str);
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharath\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  driver.manage().window().maximize();
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
