package org.testing.TestScripts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Utilities.LogsCapture;
import org.testing.Utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC2 extends Base {
	

	@Test
	public void test1() throws InterruptedException, IOException 
	{
	

		Login login=new Login(driver, pr);
	    	
		login.signin("testshahid11@gmail.com", "8130704808");
	   
	    
	  
   	   
		WebElement History=driver.findElement(By.xpath(pr.getProperty("history")));
		History.click();
		Thread.sleep(2000);
		ScreenshotCapture ss=new ScreenshotCapture();
		ss.takeScreenshot(driver, "../YTFramework/screenshots/history.png");
		
		 LogsCapture.takeLogs("TC1","clicked on History");
		
		Logout logout=new Logout(driver,pr);		
		logout.signout();
		LogsCapture.takeLogs("TC1","Logout successfully");
	
	}
	
}
