package org.testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testng.annotations.Test;

public class TC4 extends Base{
		
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
		
		List<WebElement> vc=driver.findElements(By.id(pr.getProperty("videotitle")));
		vc.get(3).click();
		
		Thread.sleep(3000);
		
		List<WebElement> like=driver.findElements(By.xpath(pr.getProperty("likebuttonlist")))	;
		like.get(2).click();
		System.out.println("Liked successfully");
		
		WebElement button=driver.findElement(By.xpath(pr.getProperty("profilebutton")));
		button.click();
		Thread.sleep(5000);
		
		
		WebElement signout=driver.findElement(By.xpath(pr.getProperty("signout")));
		signout.click();
		System.out.println("Logout successfully");
		
	
	}
	}


