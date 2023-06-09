package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Base {
	
	
public ChromeDriver driver;
public Properties pr;
	
@BeforeMethod
public void BrowserLaunch() throws InterruptedException, IOException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	options.addArguments("--remote-allow-origins=*");
	File f = new File("..//YouTFramework/object.properties");
	FileReader fr= new FileReader(f);
	pr=new Properties();
	pr.load(fr);

System.setProperty("webdriver.chrome.driver", "..//YouTFramework/chromedriver.exe");
driver =new ChromeDriver(options);
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();

}


@AfterMethod
public void BrowserClose() {
driver.close();
}
		


}
