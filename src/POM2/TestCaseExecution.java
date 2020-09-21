package POM2;

import org.testng.annotations.Test;

import POM3.Repository;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestCaseExecution 

{
  @Test
  public void f() throws InterruptedException 
  {
	  
	  Repository.logincheck();
	  Thread.sleep(3000);
	  
	  Repository.Adding_watch_to_cart();
	  
	  
	  
  }
  

}
