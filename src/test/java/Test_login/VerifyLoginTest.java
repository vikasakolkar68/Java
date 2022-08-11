package Test_login;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.LoginPom;
import Utility.BaseClass;
import Utility.ExcelDataProvider;
import Utility.Library;

public class VerifyLoginTest extends BaseClass {
	
	@Test
	public void TC_001 () throws Exception {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		//login.getTxt_email().sendKeys("test");
		//login.getTxt_password().sendKeys("12345");
	
		Library.custom_sendKeys(login.getTxt_email(),ExcelDataProvider.getStringData("Sheet1", 0, 0));
		Library.custom_sendKeys(login.getTxt_password(),ExcelDataProvider.getStringData("Sheet1", 0, 1));
	
	}
	
    
    
    
}
