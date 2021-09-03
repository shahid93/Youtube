package org.testing.TestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Utilities.LogsCapture;
import org.testing.Utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC5 extends Base{
	Base c=new Base();
    
			
		@Test
		public void test1() throws InterruptedException, IOException 
		{

			Login login=new Login(driver, pr);
	    	
			login.signin("testshahid11@gmail.com", "8130704808");
		    LogsCapture.takeLogs("TC1","Logged in successfully");
		 
		
		List<WebElement> vc=driver.findElements(By.id(pr.getProperty("videotitle")));//videotitle:video-title
		vc.get(3).click();
		
		Thread.sleep(5000);
				
		List<WebElement> Sub=driver.findElements(By.xpath(pr.getProperty("subscibebutton")));
		Sub.get(2).click();
		ScreenshotCapture ss=new ScreenshotCapture();
		ss.takeScreenshot(driver, "../YTFramework/screenshots/subscribed.png");
		LogsCapture.takeLogs("TC1","Subscribed");
		
		Logout logout=new Logout(driver,pr);		
		logout.signout();
		LogsCapture.takeLogs("TC1","Logout successfully");
		
	
	}
	
	
	
}


