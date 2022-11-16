package com.anglo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CountryDropdown {
public WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.angloamerican.com/");
	}

	@Test(groups = "To Verify CountryDropdown Functionality",priority = 1)
	public void Verify_CountryDropdown_present() 
	{
		
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
	
	 @AfterMethod
	   	public void teardown()
	   	{
	   		 driver.quit();
	   	}
}


