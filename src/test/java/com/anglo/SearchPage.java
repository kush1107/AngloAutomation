package com.anglo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchPage {
	public WebDriver driver;

	
	@BeforeMethod
	public void setup()
	{
		 driver = new ChromeDriver();
	}
	

	@Test(groups = "To Verify Search Page ")
	public void Verify_UnknownText_input() throws InterruptedException
	{
		
		
		driver.navigate().to("https://www.angloamerican.com/");
		driver.findElement(By.xpath("//a[@class='searchOPEN']//span[@class='icon-search-icon']")).click();
		Thread.sleep(2000);
		WebElement searchelement = driver.findElement(By.xpath("//input[@id='searchTextbox']"));
		searchelement.sendKeys("dshjhj");
		
		searchelement.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.xpath("//span[normalize-space()='No results found']")).getText(),"No results found");
	}
	
	@Test(groups = "To Verify Search Page ")
	public void Verify_DummyText_input() throws InterruptedException
	{
		
		String text = "lorem";
		driver.navigate().to("https://www.angloamerican.com/");
		driver.findElement(By.xpath("//a[@class='searchOPEN']//span[@class='icon-search-icon']")).click();
		Thread.sleep(2000);
		WebElement searchelement = driver.findElement(By.xpath("//input[@id='searchTextbox']"));
		searchelement.sendKeys("lorem");
		
		searchelement.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
		Assert.assertFalse(list.size() > 0, "Text  found!");
	}
	
	@Test(groups = "To Verify Search Page ")
	public void Verify_ShareFunctionality()
	{
		driver.navigate().to("https://www.angloamerican.com/site-services/search-results#queryType=Exact&keywordtracking=1&q=dsd&sort=score");
		WebElement sharefn = driver.findElement(By.xpath("//div[@class='share-options']"));
		Assert.assertTrue(sharefn.isDisplayed());
		
	}
	 @AfterMethod
	   	public void teardown()
	   	{
	   		 driver.quit();
	   	}
}
