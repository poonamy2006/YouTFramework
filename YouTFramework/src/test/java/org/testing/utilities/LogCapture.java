package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.w3c.dom.DOMConfiguration;

public class LogCapture {
	
	
	public static void TakeLogs(String Classname, String message) {
		DOMConfigurator.configure("..//YTFramework/layout.xml");
		Logger log= Logger.getLogger(Classname);
		log.info(message);
	}

}
