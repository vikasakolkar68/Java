package Utility;

import org.openqa.selenium.WebElement;

public class Library {
	
	public static void custom_sendKeys(WebElement element,String value) {
		try {
		element.sendKeys(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
