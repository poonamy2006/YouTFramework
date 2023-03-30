package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
	
ChromeDriver driver;
Properties pr;
	
	
public Home (ChromeDriver driver, Properties pr) {	
this.driver=driver;
this.pr=pr;
	}

	
public void ClickTrending() throws InterruptedException {
WebElement Trandlink = driver.findElement(By.xpath(pr.getProperty("Trendinglink")));	
Thread.sleep(3000);
Trandlink.click();
	}

	
	public void WatchLater() throws InterruptedException {
		
	WebElement WatchLaterLink=	driver.findElement(By.xpath(pr.getProperty("WatchLater")));	
	  Thread.sleep(3000);
	WatchLaterLink.click();
	}
	
   public void History() throws InterruptedException {
	  WebElement HistoryLink = driver.findElement(By.xpath(pr.getProperty("HistoryLink")));
	  Thread.sleep(3000);
	  HistoryLink.click();
	}
   
   public void Subscriptions() throws InterruptedException {
	 WebElement SubscriptionsLink=  driver.findElement(By.xpath(pr.getProperty("SubscriptionsLink")));
	 Thread.sleep(3000);
	 SubscriptionsLink.click();
  	}
   
   
   public void Library() throws InterruptedException {
		 WebElement LibraryLink=  driver.findElement(By.xpath(pr.getProperty("Library")));
		 Thread.sleep(3000);
		 LibraryLink.click();
	  	}
   
   
   
   
}

