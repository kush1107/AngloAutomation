package com.anglo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Basepackage.TestBase;

public class CountryDropdown extends TestBase{



	
	@BeforeMethod
	public void setup()
	{
		initialization();
	}

	@Test(groups = "To Verify CountryDropdown Functionality",priority = 1)
	public void Verify_CountryDropdown_present() 
	{
		 driver.navigate().to("https://www.angloamerican.com/");
		WebElement country_dropdown = driver.findElement(By.xpath("//div[@class='top-group-container']//a[contains(text(),'Our websites')]"));
		if(country_dropdown.isDisplayed()==true)
			{
			country_dropdown.click();
			}
		else 
		{
			System.out.println("Country dropdown functionality is not available.");
		}
		
	
	}
	
	@Test(groups = "To Verify CountryDropdown Functionality",priority = 2)
	public void Verify_CountryDropdown_CountryList()  //To verify country list availble after dropdown click
	{
		 driver.navigate().to("https://www.angloamerican.com/");
		WebElement country_dropdown = driver.findElement(By.xpath("//div[@class='top-group-container']//a[contains(text(),'Our websites')]"));
		if(country_dropdown.isDisplayed()==true)
			{
			country_dropdown.click();
			WebElement CountryList = driver.findElement(By.xpath("//div[@class='top-group-container']//nav[@class='groupSitesContainer']"));
			List<WebElement> links = CountryList.findElements(By.tagName("a"));
			
			int no_of_links= links.size();
			System.out.println("Number of Links for Social Icon section :"+no_of_links);
			for(WebElement we : links) {
		       
		        System.out.println(we.getText());
		    }
			}
		else 
		{
			System.out.println("Country list is not available.");
		}
		
	
	}
	
	 @AfterSuite
	   	public void teardown()
	   	{
	   		 driver.quit();
	   	}
}


