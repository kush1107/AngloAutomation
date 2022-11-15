package com.anglo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BackToTop {

public WebDriver driver;

	
	@BeforeMethod
	public void setup()
	{
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	

	@Test(groups = "To Verify Back to Top Functionality ")
	public void Verify_BackToTop_present() throws InterruptedException
	{
		driver.navigate().to("https://www.angloamerican.com/");
		
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,600)");
        Thread.sleep(3000);
        
       WebElement back_to_top = driver.findElement(By.xpath("//span[@class='icon-arrow-down']"));
       Assert.assertTrue(back_to_top.isDisplayed());
       
       if(back_to_top.isDisplayed()==true)
       {
    	   back_to_top.click();
    	  String text =  driver.findElement(By.xpath("//h2[normalize-space()='Q3 2022 Production Report']")).getText();
    	  Assert.assertEquals(text, "Q3 2022 Production Report", "Back to Top Functionality is working fine.");
       }
	}
        
       @AfterMethod
   	public void teardown()
   	{
   		 driver.quit();
   	}
	
	


}
