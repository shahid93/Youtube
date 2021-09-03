package org.testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.VideoPlay;
import org.testing.Utilities.LogsCapture;
import org.testng.annotations.Test;

public class TC6 extends Base{
	
 	
	@Test
	public void test1() throws InterruptedException {
		

		Login login=new Login(driver, pr);
    	
		login.signin("testshahid11@gmail.com", "8130704808");

		 VideoPlay v=new VideoPlay(driver,pr);
		  v.clickvideo(3);
				
		Actions d = new Actions(driver);
		Thread.sleep(10000);
		d.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		
		WebElement commentbox = driver.findElement(By.xpath(pr.getProperty("commentboxfield")));
		commentbox.click();
		System.out.println("Clicked comment box");
		Thread.sleep(3000);
		
		WebElement comment = driver.findElement(By.xpath(pr.getProperty("commenttextfield")));
		comment.sendKeys("cool");
		Thread.sleep(1000);
		
		WebElement commentb=driver.findElement(By.xpath(pr.getProperty("commentbutton")));
		commentb.click();
		System.out.println("Commented");
		Thread.sleep(3000);

		Logout logout=new Logout(driver,pr);		
		logout.signout(); 
		LogsCapture.takeLogs("TC1","Logout successfully");
		 

	}
	
	

}
