package org.testing.Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class Base {
	ChromeDriver driver;
	
	
	
	@BeforeMethod
	public void init() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "../YTFramework/driver/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();   // To disable permission notification (1)
		options.addArguments("disable-notifications"); //(2)
		driver =new ChromeDriver(options); 				//(3)
	
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
}
