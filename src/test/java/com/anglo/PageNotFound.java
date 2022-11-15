package com.anglo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PageNotFound {
	
	public WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		 driver = new ChromeDriver();
	}
	

	@Test(priority = 2,groups = "To Verify Page Not Found Page " )
	public void VerifyCompanyName() 
	{
		
		driver.navigate().to("https://www.angloamerican.com/404");
		WebElement company_name = driver.findElement(By.xpath("//div[@id='MainWrapper']//p[1]")); //Comapny name - xpath
		String text = company_name.getText();
		AssertJUnit.assertEquals(text, "You've come to a page of the Anglo American website that doesn't currently exist.");
		
		
	}

	@Test(priority = 1,groups = "To Verify Page Not Found Page " )
	public void VerifyPageTitle() 
	{
		
		driver.navigate().to("https://www.angloamerican.com/404");
		
		String text = driver.getTitle();
		AssertJUnit.assertEquals(text, "Page not found | Anglo American");
		
		
	}
	
	@Test(priority = 5,groups = "To Verify Page Not Found Page " )
	public void Verify_PageTimer() 
	{
		
		driver.navigate().to("https://www.angloamerican.com/404");
		
		WebElement page_timer = driver.findElement(By.xpath("//span[@class='counter']"));  //Timer xpath
		Assert.assertTrue(page_timer.isDisplayed());
		
	}
	
	@Test(priority = 3,groups = "To Verify Page Not Found Page " )
	public void Verify_Homepagelink() 
	{
		
		driver.navigate().to("https://www.angloamerican.com/404");
		
		WebElement Homepage_link = driver.findElement(By.linkText("home page"));  //Timer xpath
		Assert.assertTrue(Homepage_link.isDisplayed()); 
		
		
	}
	
	@Test(priority = 4,groups = "To Verify Page Not Found Page " )
	public void Verify_Sitemaplink() 
	{
		
		driver.navigate().to("https://www.angloamerican.com/404");
		
		WebElement sitemap_link = driver.findElement(By.linkText("site map"));  //Timer xpath
		Assert.assertTrue(sitemap_link.isDisplayed());  
		
		
	}
	

	@AfterMethod
	public void teardown()
	{
		 driver.quit();
	}
	
	
}