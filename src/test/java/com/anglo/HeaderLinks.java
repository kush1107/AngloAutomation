package com.anglo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderLinks {
	
public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		 driver = new ChromeDriver();
	}
	

	@Test(groups = "To Verify Header Links ")
	public void Verify_Main_Headerlinks() throws InterruptedException
	{
		
		driver.navigate().to("https://www.angloamerican.com/");
		
		WebElement header1 = driver.findElement(By.xpath("//div[@id='MainMenu']")); //Header Section
		List<WebElement> links = header1.findElements(By.tagName("a"));
		int no_of_links= links.size();
		System.out.println("Number of Links for Main header section :"+no_of_links);
		
		for(WebElement we : links) {
			System.out.println(we.getAttribute("href"));
			
	        
	        
	        
	    }
		
	}
	@AfterMethod
	public void teardown()
	{
		 driver.quit();
	}
}
