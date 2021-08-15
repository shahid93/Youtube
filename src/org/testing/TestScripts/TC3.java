package org.testing.TestScripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testing.Base.Base;
import org.testng.annotations.Test;

public class TC3 extends Base {

	
	@Test
	public void test1() throws InterruptedException 
	{
	

		WebElement sign=driver.findElement(By.xpath(pr.getProperty("Signinbutton")));
		sign.click();
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.xpath(pr.getProperty("emailid")));
		email.sendKeys("testshahid11@gmail.com");
		System.out.println("Email got clicked");
	
	
		System.out.println("Entered email");
		WebElement next=driver.findElement(By.xpath(pr.getProperty("nextbutton")));
		next.click();
		Thread.sleep(5000);
		
		WebElement pass=driver.findElement(By.xpath(pr.getProperty("password")));
		pass.sendKeys("8130704808");
		Thread.sleep(5000);
		System.out.println("Entered Password");
		
		WebElement pnext=driver.findElement(By.xpath(pr.getProperty("nextbutton2")));
		pnext.click();
		System.out.println("Logged in");
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement Subcriptions=driver.findElement(By.xpath(pr.getProperty("subscriptions")));
		Subcriptions.click();
		Thread.sleep(2000);
		System.out.println("Clicked on subscriptions");
		
		WebElement button=driver.findElement(By.xpath(pr.getProperty("profilebutton")));
		button.click();
		Thread.sleep(5000);
	
	
		
		WebElement signout=driver.findElement(By.xpath(pr.getProperty("signout")));
		signout.click();
		System.out.println("Logout successfully");
		
	
	}
		
}
