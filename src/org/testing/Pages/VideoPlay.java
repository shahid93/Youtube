package org.testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay {
	ChromeDriver driver;
	Properties pr;
	
	
	public VideoPlay(ChromeDriver driver,Properties pr) {
				
		this.driver= driver;
		this.pr=pr;
			
	}
	
	public void clickvideo(int Index) throws InterruptedException {

		List<WebElement> vc = driver.findElements(By.id(pr.getProperty("videotitle")));
		vc.get(Index).click();
		Thread.sleep(2000);
	}

}
