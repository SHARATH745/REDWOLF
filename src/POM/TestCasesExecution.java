package POM;

import org.testng.annotations.Test;

public class TestCasesExecution extends Repository1 {
	
	@Test
	
	public void verifylogin() throws InterruptedException {
		
	Repository1.login();
	Thread.sleep(3000);

}
}
