package org.testing.TestScripts;

import java.io.IOException;
import org.testing.Base.Base;
import org.testing.assertions.Assertion;
import org.testing.pages.Home;
import org.testing.pages.Login;
import org.testing.utilities.CalculateCurrentDateandTime;
import org.testing.utilities.LogCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.*;

import org.testng.annotations.Test;


public class TC1 extends Base {
	
		   @Test
			public void ClickTrending() throws InterruptedException, IOException {
				Login log= new Login(driver, pr);
				Thread.sleep(4000);
				
		        log.SignIn("testingusertest46@gmail.com", "Shruti@2510");
				LogCapture.TakeLogs("TC1", "Login Successful");
				Thread.sleep(4000);
				
				String ExpectedURL="https://www.youtube.com/";
				
			
			   Assert.assertTrue(Assertion.Assertion1( ExpectedURL,driver.getCurrentUrl()));
			   	 
			   Thread.sleep(4000);
			   String d= CalculateCurrentDateandTime.CalculateDateTime();
			   String FileName= "C://Screenshots//YTFramework/" + d.replace(":", "-") +".png";
		       Thread.sleep(4000);
		       ScreenshotCapture.TakeScreenshot(driver, FileName);
				Thread.sleep(4000);
				
				Home h= new Home(driver, pr);
				Thread.sleep(4000);
				h.ClickTrending();
				Thread.sleep(4000);
				LogCapture.TakeLogs("TC1", "Trending click Successful");
				
			}			
				}
	
	
		
	
	
	
	

	

