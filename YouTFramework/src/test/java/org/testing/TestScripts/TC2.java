package org.testing.TestScripts;


import org.testing.Base.Base;
import org.testing.pages.Home;
import org.testing.pages.Login;
import org.testing.utilities.LogCapture;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TC2 extends Base {
	
			
			@Test
			public void ClickHistory() throws InterruptedException {
			
				Login log = new Login(driver, pr);
				log.SignIn("testingusertest46@gmail.com", "Shruti@2510");
				Thread.sleep(4000);
				
				Home h= new Home(driver, pr);
				h.History();
				LogCapture.TakeLogs("TC2", "Click history Successful");
				
				
				
				
			}
	
}
		
	
	
	
	

	

