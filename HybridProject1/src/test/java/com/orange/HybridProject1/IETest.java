package com.orange.HybridProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class IETest {
  @Test
  public void ieTestMethod() {
	    WebDriver driver = new InternetExplorerDriver();
	    //System.setProperty("webdriver.ie.driver", "C:\\Users\\navin\\Downloads\\DRIVERS\\IEDriverServer_x64_3.150.2\\IEDriverServer.exe");
		driver.get("https://myonlineqa.com/");
		driver.quit();
  }
}
