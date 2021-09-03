package org.testing.TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testing.Assertions.Assertion_1;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Utilities.LogsCapture;
import org.testing.Utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1 extends Base{

	
	
	
   	     @Test
		public void test1() throws InterruptedException, IOException 
		{
   	    	 String expected_url ="https://www.youtube.com/";
   	    	Login login=new Login(driver, pr);
   	    	
			login.signin("testshahid11@gmail.com", "8130704808");
		    LogsCapture.takeLogs("TC1","Logged in successfully");
		    ScreenshotCapture ss=new ScreenshotCapture();
		    ss.takeScreenshot(driver, "../YTFramework/screenshots/login.png");
		    
		    // Assert.assertEquals(driver.getCurrentUrl(), expected_url); //hard assertion
		    Assertion_1.assertion(driver.getCurrentUrl(),  expected_url); //soft assertion
	    	 						
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			WebElement explore=driver.findElement(By.xpath(pr.getProperty("explore")));
			explore.click();
			LogsCapture.takeLogs("TC1","Clicked on explore");
			Thread.sleep(5000);
				   
			WebElement trending=driver.findElement(By.xpath(pr.getProperty("trending")));
			trending.click();
			LogsCapture.takeLogs("TC1","Clicked on trending");
			Thread.sleep(5000);
			
			Logout logout=new Logout(driver,pr);		
			logout.signout();
			LogsCapture.takeLogs("TC1","Logout successfully");
			ss.takeScreenshot(driver, "../YTFramework/screenshots/logout.png");
			
			
			
			
		}
		
}
