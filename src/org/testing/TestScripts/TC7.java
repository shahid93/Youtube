package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Utilities.LogsCapture;
import org.testng.annotations.Test;

public class TC7 extends Base {
		
	@Test
	public void test1() throws InterruptedException 
	{

		Login login=new Login(driver, pr);
    	
		login.signin("testshahid11@gmail.com", "8130704808");
		
		
		WebElement Watchlater=driver.findElement(By.xpath(pr.getProperty("watchlater")));
		Watchlater.click();
		Thread.sleep(2000);
		System.out.println("clicked on watch later");
		
		Logout logout=new Logout(driver,pr);		
		logout.signout();
		LogsCapture.takeLogs("TC1","Logout successfully");
		
		
	
	}
		
}