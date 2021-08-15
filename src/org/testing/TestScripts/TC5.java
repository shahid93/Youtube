package org.testing.TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC5 {
	ChromeDriver driver;

	@BeforeMethod
	public void before() throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver", "../YTFramework/driver/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		driver =new ChromeDriver(options);
	
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	public void test1() throws InterruptedException 
	{
		 WebElement sign=driver.findElement(By.
		  xpath("//yt-formatted-string[contains(text(),'Sign in')]")); 
		 sign.click();
		  Thread.sleep(3000); 
		  WebElement email=driver.findElement(By.xpath("//input[@id='identifierId']"));
		  email.sendKeys("testshahid11@gmail.com");
		  System.out.println("Email got clicked");
		  Thread.sleep(3000);
		  
		 System.out.println("Entered email"); WebElement
		 next=driver.findElement(By.xpath("//span[text()='Next']")); 
		 next.click();
		  Thread.sleep(5000); 
		  WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		  pass.sendKeys("8130704808"); System.out.println("Entered Password");
		  
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		  WebElement pnext=driver.findElement(By.xpath("//span[text()='Next']")); 
		  pnext.click();
		System.out.println("Logged in");
		Thread.sleep(5000);
		 
		Actions ac=new Actions(driver);
		List<WebElement> vc=driver.findElements(By.id("video-title"));
		vc.get(3).click();
		
		Thread.sleep(5000);
				
		List<WebElement> Sub=driver.findElements(By.xpath("//div[@id='subscribe-button']"));
		Sub.get(2).click();
		System.out.println("Subscribed");
		
		
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


