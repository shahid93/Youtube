package org.testing.TestScripts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Utilities.LogsCapture;
import org.testng.annotations.Test;

public class TC8 extends Base{
	Base c=new Base();
    	

	
	@Test
	public void test1() throws InterruptedException 
	{
	
		Login login=new Login(driver, pr);
    	
		login.signin("testshahid11@gmail.com", "8130704808");
		
		
		WebElement library=driver.findElement(By.xpath(pr.getProperty("library"))); 
		library.click();
		Thread.sleep(2000);
		System.out.println("clicked on library");
		
		Logout logout=new Logout(driver,pr);		
		logout.signout();
		LogsCapture.takeLogs("TC1","Logout successfully");
   
		
		
	
	}
	
	
}