package com.anglo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CountryDropdown {
public WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}

	@Test(groups = "To Verify CountryDropdown Functionality ")
	public void Verify_CountryDropdown_present() 
	{
		System.out.println("QA Test");
		System.out.println("QA Test");
		System.out.println("QA Test");
		System.out.println("QA Test");
	}
}


