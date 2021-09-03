package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;

public class Login extends Base {
	
	ChromeDriver driver;
	Properties pr;

	public Login(ChromeDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void signin(String userName ,String password) throws InterruptedException {
		
		 
		Thread.sleep(3000);
		WebElement sign=driver.findElement(By.xpath(pr.getProperty("Signinbutton")));
		sign.click();
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.xpath(pr.getProperty("emailid")));
		email.sendKeys(userName);
		System.out.println("Email got clicked");
	
	
		System.out.println("Entered email");
		WebElement next=driver.findElement(By.xpath(pr.getProperty("nextbutton")));
		next.click();
		Thread.sleep(5000);
		
		WebElement pass=driver.findElement(By.xpath(pr.getProperty("password")));
		pass.sendKeys(password);
		Thread.sleep(5000);
		System.out.println("Entered Password");
		
		WebElement pnext=driver.findElement(By.xpath(pr.getProperty("nextbutton2")));
		pnext.click();
		Thread.sleep(5000);
	}

}
