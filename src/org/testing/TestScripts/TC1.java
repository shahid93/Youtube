package org.testing.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.Base;
import org.testng.annotations.*;

public class TC1 extends Base  {
	ChromeDriver driver;
	TC1 b=new TC1();
		
	
	@BeforeMethod
	public void m() throws InterruptedException {
	
		b.init();
	}
		
		@Test
		public void test1() throws InterruptedException, IOException 
		{
			
			WebElement sign=driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Sign in')]"));
			sign.click();
			Thread.sleep(3000);
			WebElement email=driver.findElement(By.xpath("//input[@id='identifierId']"));
			email.sendKeys("testshahid11@gmail.com");
			System.out.println("Email got clicked");
		
		
			System.out.println("Entered email");
			WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
			next.click();
			Thread.sleep(2000);
			WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
			pass.sendKeys("8130704808");
			System.out.println("Entered Password");
			WebElement pnext=driver.findElement(By.xpath("//span[text()='Next']"));
			pnext.click();
			System.out.println("Logged in");
			Thread.sleep(5000);
	   	   
			WebElement explore=driver.findElement(By.xpath("//a[@href='/feed/explore']"));
			explore.click();
			Thread.sleep(2000);
			System.out.println("clicked on explore");
	   
			WebElement trending=driver.findElement(By.xpath("//a[@href='/feed/trending?bp=6gQJRkVleHBsb3Jl']"));
			trending.click();
			Thread.sleep(2000);
			System.out.println("clicked on trending");
	   
			WebElement button=driver.findElement(By.xpath("//button[@id='avatar-btn']"));
			button.click();
			Thread.sleep(2000);
		
		
			
			WebElement signout=driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']"));
			signout.click();
			System.out.println("Logout successfully");
	   
		}
		@AfterMethod
		public void after()
		{
			driver.close();
			
		}
		
	
}
