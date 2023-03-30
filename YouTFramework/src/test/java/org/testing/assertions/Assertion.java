package org.testing.assertions;

import org.testng.Assert;

public class Assertion {
	
	
	
	public static Boolean Assertion1(String ExpectedUrl, String ActualURL) {
		if(ExpectedUrl.equals(ActualURL)) {
			
			return true;
		}
		else {
			
			
			return false;
		}
		
	}

}
