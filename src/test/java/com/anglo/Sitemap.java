package com.anglo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basepackage.TestBase;

public class Sitemap extends TestBase{



	
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
	 
	 
	 @Test(groups = "To Verify Sitemap Links ")
	 public void Verify_Number_of_sitemaplinks()
	 { 
		 driver.navigate().to("https://www.angloamerican.com/site-services/site-map");
			
			WebElement sitemap = driver.findElement(By.xpath("//div[@id='sitemapcontainer']")); //Sitemap  section 
			List<WebElement> links = sitemap.findElements(By.tagName("a"));
			int no_of_links= links.size();
			System.out.println("Number of Links for SItemap section :"+no_of_links);
			
			for(WebElement we : links) {
		        System.out.println(we.getAttribute("href"));
		        System.out.println(we.getText());
			}
	 }

}
