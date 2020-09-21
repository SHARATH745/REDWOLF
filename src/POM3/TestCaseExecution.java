package POM3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestCaseExecution extends Repository{
	
	
  @Test
  
  public void loginchecking() throws InterruptedException
  {
	  
	  Repository.logincheck();
	  Thread.sleep(3000);
	  
	  Repository.Adding_watch_to_cart();
	  
  }
  

}
