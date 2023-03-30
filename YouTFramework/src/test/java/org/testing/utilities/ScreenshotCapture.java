package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenshotCapture {
	
	public static void TakeScreenshot(ChromeDriver driver, String FileName) throws IOException, InterruptedException {
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		
	
        FileUtils.copyFile(srcFile, new File(FileName));

		}

}
