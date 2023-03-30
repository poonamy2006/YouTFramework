package org.testing.TestScripts;

import org.testng.annotations.*;
import org.testing.Base.Base;
import org.testing.pages.Login;
import org.testing.pages.VideoPlay;
import org.testing.utilities.LogCapture;

import org.testng.annotations.Test;

public class TC4 extends Base{
	
	
			
			@Test
			public void Testcase4() throws InterruptedException {
			Login log=new Login(driver, pr);
			log.SignIn("testingusertest46@gmail.com", "Shruti@2510");
			Thread.sleep(5000);
			VideoPlay vp= new VideoPlay(driver,pr);
			vp.Play();
			LogCapture.TakeLogs("TC4", "Video Play Successful");
			vp.VideoLike();
				
			LogCapture.TakeLogs("TC4", "Video Like Successful");
			
			
			
				
				
				
				
			}
			
	
				
			}
	
	
		
	
	
	
	

	

