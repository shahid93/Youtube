package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public ChromeDriver driver;
	public Properties pr;
	
	@BeforeMethod
	public void init() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "../YTFramework/driver/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();   // To disable permission notification (1)
		options.addArguments("disable-notifications"); //(2)
		driver =new ChromeDriver(options); 				//(3)
	
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		File f=new File("D:\\Online class\\YTFramework\\Object.properties");
		FileInputStream fi=new FileInputStream(f);
		pr=new Properties();
		pr.load(fi);
	}
	
	@AfterMethod
	public void close() {
		
		{
			driver.close();
			
		}
	}
}
