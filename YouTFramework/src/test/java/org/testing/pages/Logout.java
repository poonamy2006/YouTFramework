package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
	
	ChromeDriver driver;
	Properties pr;
	
	
public Logout (ChromeDriver driver, Properties pr) {
		
		this.driver=driver;
		this.pr=pr;
	}


public void Signout() throws InterruptedException {
	
	WebElement Usernamebutton = driver.findElement(By.id(pr.getProperty("UsernameIcon")));
	Usernamebutton.click();
	Thread.sleep(4000);
	WebElement signoutbutton= driver.findElement(By.xpath(pr.getProperty("SignoutButton")));
	signoutbutton.click();
	
	
}
}
