package com.orange.HybridProject1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class HeadLessTest {
    @Test
	public void headLess() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver_win32_93\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		//WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");								
       	
       System.out.println("Page title is: " + driver.getTitle());		
       driver.quit();	
		

	}

}
