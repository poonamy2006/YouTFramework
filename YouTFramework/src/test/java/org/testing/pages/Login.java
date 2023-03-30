package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	ChromeDriver driver;
	Properties pr;
	
	
	public Login (ChromeDriver driver, Properties pr) {
		
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void SignIn(String Username, String Password) throws InterruptedException {
		Thread.sleep(3000);
		WebElement SignInButton = driver.findElement(By.xpath(pr.getProperty("SignInButton")));
		SignInButton.click();
		
		Thread.sleep(3000);
		WebElement usernametextfield= driver.findElement(By.id(pr.getProperty("EmailAddress")));
		usernametextfield.sendKeys(Username);
		
		Thread.sleep(3000);
		WebElement UserNext= driver.findElement(By.id(pr.getProperty("NextButton")));
		UserNext.click();
		
		Thread.sleep(3000);
		WebElement Passfield= driver.findElement(By.xpath(pr.getProperty("PasswordTextfield")));
		Passfield.sendKeys(Password);
		Thread.sleep(3000);
		WebElement PwdNext= driver.findElement(By.id(pr.getProperty("PasswordNextButton")));
		PwdNext.click();
		
		Thread.sleep(4000);
		
		
		
	}
	
	
	

}
