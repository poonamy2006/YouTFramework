package org.testing.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay {
	
	
	ChromeDriver driver;
	Properties pr;
	
	
	public VideoPlay(ChromeDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
		
	}
	
	
	
	
	
	public void Play() throws InterruptedException {
		List<WebElement> list=driver.findElements(By.id(pr.getProperty("VideoLink")));
		list.get(1).click();
		Thread.sleep(3000);
		
	}
	
	public void VideoLike() throws InterruptedException {
		
		WebElement LikeButton = driver.findElement(By.id(pr.getProperty("VideoLike")));
		Thread.sleep(3000);
		LikeButton.click();
		Thread.sleep(2000);
			
	}
	
public void ChannelSubscribe() throws InterruptedException {
     WebElement SubButton= driver.findElement(By.id(pr.getProperty("SubButton")));
	Thread.sleep(2000);
	SubButton.click();
	Thread.sleep(2000);
			
	}
	
	
public void AddComment() throws InterruptedException {
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(6000);
	WebElement Acom= driver.findElement(By.xpath(pr.getProperty("Addcomment")));
	Acom.click();
	Thread.sleep(3000);
	WebElement Cbox= driver.findElement(By.xpath(pr.getProperty("CommentBox")));
	Cbox.sendKeys("Awesome");
	WebElement CommentButton=driver.findElement(By.xpath(pr.getProperty("CommentButton")));
CommentButton.click();
	Thread.sleep(2000);
		
	}
	

}
