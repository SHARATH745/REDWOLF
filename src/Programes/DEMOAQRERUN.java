package Programes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DEMOAQRERUN {
	
public WebDriver driver;
	
	
	public void openurl() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
			
	}
	

	public void studentregistratioform() {
		
		driver.findElement(By.id("firstName")).sendKeys("sharath");
		driver.findElement(By.id("lastName")).sendKeys("veldurthi");
		driver.findElement(By.id("userEmail")).sendKeys("veldurthisharath@gmial.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9701745745");
		driver.findElement(By.id("dateOfBirthInput")).click();
		new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).selectByVisibleText("June");
		new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByVisibleText("1996");
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[5]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]")).sendKeys("Maths");
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
		driver.findElement(By.id("uploadPicture")).sendKeys("\"C:\\Users\\sharath\\Desktop\\PHOTO.jpg\"");
		driver.findElement(By.id("currentAddress")).sendKeys("7-1-257, Dwaraka nagar, Khammam - 507002.");
		new Select(driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"))).selectByVisibleText("Uttar Pradesh");
		new Select(driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]"))).selectByVisibleText("Lucknow");
		driver.findElement(By.id("submit")).click();
		
		
			
	}
	
	
	

	public static void main(String[] args) {
		
		
		DEMOAQRERUN R = new DEMOAQRERUN();
		
		R.openurl();
		R.studentregistratioform();
		
		

	}

}
