package org.testing.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
	
	public static void DropdownselectionBasedUponIndex(WebElement element,int index) {
		
		Select se = new Select(element);
		se.selectByIndex(index);
		
	}
	
	public static void DropdownselectionBasedUponVisualText(WebElement element, String Textvalue) {
		Select se = new Select(element);
		se.selectByVisibleText(Textvalue);
		}
	
	public static void DropdownselectionBasedUponValue(WebElement element, String Text) {
	Select se = new Select(element);
	se.selectByValue(Text);
		
		
	}
	
	
}
