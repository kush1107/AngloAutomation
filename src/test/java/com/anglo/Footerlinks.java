package com.anglo;

import org.testng.annotations.Test;

import Basepackage.TestBase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Footerlinks extends TestBase{



	
	@BeforeMethod
	public void setup()
	{
		initialization();
	}
	

	@Test(groups = "To Verify Footer Links ")
	public void VerifySocialIcons_Footerlinks() throws InterruptedException
	{
		
		driver.navigate().to("https://www.angloamerican.com/");
		
		WebElement footer1 = driver.findElement(By.xpath("//*[@id=\"MainForm\"]/footer/section[2]/div/div/article[3]")); //Social Icons Section
		List<WebElement> links = footer1.findElements(By.tagName("a"));
		int no_of_links= links.size();
		System.out.println("Number of Links for Social Icon section :"+no_of_links);
		
		for(WebElement we : links) {
	        System.out.println(we.getAttribute("href"));
	        System.out.println(we.getText());
	    }
		
	}
	
	@Test(groups = "To Verify Footer Links ")
	public void VerifyOur_websites_Footerlinks() throws InterruptedException
	{
		
		driver.navigate().to("https://www.angloamerican.com/");
		
		WebElement footer1 = driver.findElement(By.xpath("//*[@id=\"MainForm\"]/footer/section[2]/div/div/article[1]")); //Our Website Section change for other section 
		List<WebElement> links = footer1.findElements(By.tagName("a"));
		int no_of_links= links.size();
		System.out.println("Number of Links for Our website section :"+no_of_links);
		
		for(WebElement we : links) {
	        System.out.println(we.getAttribute("href"));
	        System.out.println(we.getText());
		}
			
	}
		
		@Test(groups = "To Verify Footer Links ")
		public void VerifyWebsiteSpeciific_Footerlinks() throws InterruptedException
		{
			
			driver.navigate().to("https://www.angloamerican.com/");
			
			WebElement footer1 = driver.findElement(By.xpath("//section[@class='foot-bottom-wrapper']//div[@class='container-fluid']")); // Website Specific Section change for other section 
			List<WebElement> links = footer1.findElements(By.tagName("a"));
			int no_of_links= links.size();
			System.out.println("Number of Links for Website Specific links section :"+no_of_links);
			
			for(WebElement we : links) {
		        System.out.println(we.getAttribute("href"));
		        System.out.println(we.getText());
				
			}
		
	}
		 @AfterMethod
		   	public void teardown()
		   	{
		   		 driver.quit();
		   	}
}
	

