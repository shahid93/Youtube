package org.testing.TestScripts;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Utilities.LogsCapture;
import org.testing.Utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC3 extends Base {

	
	@Test
	public void test1() throws InterruptedException, IOException 
	{
	
		Login login=new Login(driver, pr);
	    	
		login.signin("testshahid11@gmail.com", "8130704808");
	    LogsCapture.takeLogs("TC1","Logged in successfully");
	    
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement Subcriptions=driver.findElement(By.xpath(pr.getProperty("subscriptions")));
		Subcriptions.click();
		
		Thread.sleep(2000);
		
		ScreenshotCapture ss=new ScreenshotCapture();
	    ss.takeScreenshot(driver, "../YTFramework/screenshots/login.png");
	    
	    LogsCapture.takeLogs("TC1","Clicked on subscriptions");
		
	    Logout logout=new Logout(driver,pr);		
		logout.signout();
		LogsCapture.takeLogs("TC1","Logout successfully");
		
	
	}
		
}
