package com.loginfunctionality;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.DataProvider;

@Test
public class VerifyLoginPage {
	
	
	
	public void VerifyLoginCredentials(String TestScenerios,String Email_id,String Password) 
	
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys(Email_id);
		driver.findElement(By.id("input-password")).sendKeys(Password);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		if(TestScenerios.equals("Both_correct"))
		{
			WebElement Account_text = driver.findElement(By.xpath("//h2[normalize-space()='My Account']"));
			Assert.assertTrue(Account_text.isDisplayed(),"Login Failed");
		}
		
		else if (TestScenerios.equals("Both_incorrect"))
		{
			WebElement error_text = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
			Assert.assertEquals(error_text.getText(), "Warning: No match for E-Mail Address and/or Password.");
		}
		
		else if (TestScenerios.equals("Password_incorrect"))
		{
			WebElement error_text = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
			Assert.assertEquals(error_text.getText(), "Warning: No match for E-Mail Address and/or Password.");
		}
		
		else 
		{
			WebElement error_text = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
			Assert.assertEquals(error_text.getText(), "Warning: No match for E-Mail Address and/or Password.");
		}
	}
	
	@DataProvider(name="credentials")
	public Object [][] getData()
	{
		return new Object[][]
				
				{
			        {"Both_correct","automationhub1107@gmail.com","Kush@123"},
			        {"Both_incorrect","automationhub@gmail.com","Kush@"},
			        {"Password_incorrect","automationhub1107@gmail.com","Kush@22323"},
			        {"Email_incorrect","automationhub1@gmail.com","Kush@123"},
				};
		
	}
	
}
