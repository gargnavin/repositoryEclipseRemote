package com.orange.HybridProject1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridDemo {
  @Test (enabled = false)
  public void demoSelGrid() throws MalformedURLException, InterruptedException {
	    String URL = "https://myonlineqa.com/";
		String Node = "http://192.168.1.159:4444/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		WebDriver driver = new RemoteWebDriver(new URL(Node), cap);
		driver.navigate().to(URL);
		Thread.sleep(5000);
		driver.quit();
	  
  }
  @Test
  public void demoSelGridMulti() throws MalformedURLException, InterruptedException {
	      DesiredCapabilities dr=null;
	      if(browserType.equals("chrome")){
	      dr=DesiredCapabilities.firefox();
	      dr.setBrowserName("chrome");
	      dr.setPlatform(Platform.WINDOWS);
	   
	      }else{
	          dr=DesiredCapabilities.internetExplorer();
	          dr.setBrowserName("iexplore");
	          dr.setPlatform(Platform.WINDOWS);
	      }
	    String URL = "https://myonlineqa.com/";
		String Node = "http://192.168.1.159:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(Node), dr);
		driver.navigate().to(URL);
		Thread.sleep(5000);
		driver.quit();
	  
  }
}
