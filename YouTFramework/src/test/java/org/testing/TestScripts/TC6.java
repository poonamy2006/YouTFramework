package org.testing.TestScripts;

import org.testng.annotations.*;



import org.testing.Base.Base;
import org.testing.pages.Login;
import org.testing.pages.VideoPlay;
import org.testing.utilities.LogCapture;

import org.testng.annotations.Test;

public class TC6 extends Base {
	
		@Test
			public void testcase6() throws InterruptedException {
			Login log=new Login(driver, pr);
			log.SignIn("testingusertest46@gmail.com", "Shruti@2510");
			Thread.sleep(5000);
			VideoPlay vp= new VideoPlay(driver,pr);
			LogCapture.TakeLogs("TC6", "Video Play Successful");
			vp.Play();
			Thread.sleep(3000);	
			vp.AddComment();
			LogCapture.TakeLogs("TC6", "Video Comment Added.");
			
		}
}


			
			
			
			
			
			
			
			
			

			
			
		
				
			
	
	
		
	
	
	
	

	

