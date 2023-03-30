package org.testing.TestScripts;


import org.testng.annotations.*;
import org.testing.Base.Base;
import org.testing.pages.Home;
import org.testing.pages.Login;
import org.testing.utilities.LogCapture;
import org.testng.annotations.Test;

public class TC7 extends Base {
				
			@Test
			public void ClickWatchLater() throws InterruptedException {
			
				Login log= new Login(driver, pr);
				Thread.sleep(4000);
				log.SignIn("testingusertest46@gmail.com", "Shruti@2510");
				Thread.sleep(4000);
				Home h= new Home(driver, pr);
				h.WatchLater();
				LogCapture.TakeLogs("TC7", "Watch Later click Successful");
			}
	
	
}
	
	
	
	

	

