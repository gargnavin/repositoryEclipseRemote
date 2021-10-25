package com.orange.HybridProject1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {

	@Test
	public void sample()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver_win32_93\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://myonlineqa.com/");
		
		driver.quit();

	}

}
