package com.orange.HybridProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New2Test {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\navin\\Downloads\\chromedriver_win32_93\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://myonlineqa.com/");
		
		driver.quit();
  }
}
