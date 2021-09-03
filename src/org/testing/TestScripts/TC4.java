package org.testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.VideoPlay;
import org.testing.Utilities.LogsCapture;
import org.testng.annotations.Test;

public class TC4 extends Base{
		
	@Test
	public void test1() throws InterruptedException 
	{
	

		Login login=new Login(driver, pr);
    	
		login.signin("testshahid11@gmail.com", "8130704808");
	    LogsCapture.takeLogs("TC1","Logged in successfully");
		
	    VideoPlay v=new VideoPlay(driver,pr);
	    v.clickvideo(3);
		
		Thread.sleep(3000);
		
		List<WebElement> like=driver.findElements(By.xpath(pr.getProperty("likebuttonlist")))	;
		like.get(2).click();
		LogsCapture.takeLogs("TC1","Liked successfully");
		
		 Logout logout=new Logout(driver,pr);		
		logout.signout();
		LogsCapture.takeLogs("TC1","Logout successfully");
		
	
	}
	}


