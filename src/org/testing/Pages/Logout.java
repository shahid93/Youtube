package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;

public class Logout extends Base {
	ChromeDriver driver;
	Properties pr;
	
	
	public Logout(ChromeDriver driver, Properties pr) {
		this.driver= driver;
		this.pr=pr;
			
	}
		
	public void signout() throws InterruptedException {
		
		WebElement button=driver.findElement(By.xpath(pr.getProperty("profilebutton")));
		button.click();
		Thread.sleep(5000);
				
		WebElement signout=driver.findElement(By.xpath(pr.getProperty("signout")));
		signout.click();
		System.out.println("Logout successfully");
		
	}

}
