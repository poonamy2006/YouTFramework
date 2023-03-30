package org.testing.utilities;


import java.text.SimpleDateFormat;

import java.util.Date;

public class CalculateCurrentDateandTime {
	

public  static String CalculateDateTime() throws InterruptedException {
	SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy-HHmm");  
    Date date = new Date();  
    return formatter.format(date).toString() ;
}
	
}