package com.anglo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basepackage.TestBase;

public class SocialLinks extends TestBase{



	
	@BeforeMethod
	public void setup()
	{
		initialization();
	}
	
	 @AfterMethod
	   	public void teardown()
	   	{
	   		 driver.quit();
	   	}
	 
	 
	 @Test(groups = "To Verify Social Media Links & Printing title of page.")
	 public void VerifySocialLinks()
	 {  
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			WebElement sitemap = driver.findElement(By.xpath("//div[@class='stay-in-touch']//ul")); //Sitemap  section 
			List<WebElement> links = sitemap.findElements(By.tagName("a"));
			int no_of_links= links.size();
			System.out.println("Number of Links for Sitemap section :"+no_of_links);
			
			for(WebElement we : links) {
				
				we.click();
				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs2.get(1));
			    System.out.println(driver.getTitle());
			    driver.close();
			    driver.switchTo().window(tabs2.get(0));
		        
		       
			}
	 }
	 

}
