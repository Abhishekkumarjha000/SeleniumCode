package com.jenkins.demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class test { 	
	@Test

	public void testng() {
	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	
		 	 	
		
		

	}

}
