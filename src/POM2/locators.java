package POM2;

import org.openqa.selenium.By;

	public class locators 
	{
	public static By login = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a");
	public static By email = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	public static By password = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	public static By login1 = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");
	
	//
	public static By men = By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[3]/span");
	public static By fossil = By.linkText("Fossil");
	public static By select_watch = By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[3]/div/a/div[1]/div/div/div/img");
	public static By add_to_cart = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
	
	}
