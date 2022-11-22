package com.anglo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basepackage.TestBase;

public class MainNav extends TestBase{



	
	@BeforeMethod
	public void setup()
	{
		initialization();
	}

	
	
	
	

	@Test(groups = "To Verify AboutUs Links ",priority=1)
	public void VerifyAboutUs_Headerlinks() throws InterruptedException
	{
		
		driver.navigate().to("https://www.angloamerican.com/");
		WebElement Aboutus = driver.findElement(By.id("rd-nav-about-us-level1")); 
		List<WebElement> links = Aboutus.findElements(By.tagName("a"));
		Actions o = new Actions(driver);
		
		o.moveToElement(Aboutus).build().perform();
		         Thread.sleep(1000);
		        
		 		
		 		int no_of_links= links.size();
		 		System.out.println("Number of Links for Aboutus section :"+no_of_links);
		 		
		 		 for(int i=0;i<links.size();i++)
		 	     {
		 	         WebElement E1= links.get(i);
		 	         String url= E1.getAttribute("href");
		 	         verifyLinks(url);
		 	     }
		 	    }
		 		
	
	@Test(groups = "To Verify Products Links ",priority=2)
	public void VerifyProducts_Headerlinks() throws InterruptedException
	{
		
		driver.navigate().to("https://www.angloamerican.com/");
		WebElement Products = driver.findElement(By.id("rd-nav-products-level1")); //Header change xpath
		List<WebElement> links = Products.findElements(By.tagName("a"));
		Actions o = new Actions(driver);
		
		o.moveToElement(Products).build().perform();
		         Thread.sleep(1000);
		        
		 		
		 		int no_of_links= links.size();
		 		System.out.println("Number of Links for Products section :"+no_of_links);
		 		
		 		 for(int i=0;i<links.size();i++)
		 	     {
		 	         WebElement E1= links.get(i);
		 	         String url= E1.getAttribute("href");
		 	         verifyLinks(url);
		 	     }
		 	    }
	
	@Test(groups = "To Verify Sustainability Links ",priority=3)
	public void VerifySustainability_Headerlinks() throws InterruptedException
	{
		
		driver.navigate().to("https://www.angloamerican.com/");
		WebElement Sustainability = driver.findElement(By.id("rd-nav-sustainability-level1")); //Header change xpath
		List<WebElement> links = Sustainability.findElements(By.tagName("a"));
		Actions o = new Actions(driver);
		
		o.moveToElement(Sustainability).build().perform();
		         Thread.sleep(1000);
		        
		 		
		 		int no_of_links= links.size();
		 		System.out.println("Number of Links for Sustainability section :"+no_of_links);
		 		
		 		 for(int i=0;i<links.size();i++)
		 	     {
		 	         WebElement E1= links.get(i);
		 	         String url= E1.getAttribute("href");
		 	         verifyLinks(url);
		 	     }
		 	    }
	@Test(groups = "To Verify Futuresmart Links ",priority=4)
	public void VerifyFuturesmart_Headerlinks() throws InterruptedException
	{
		
		driver.navigate().to("https://www.angloamerican.com/");
		WebElement Futuresmart = driver.findElement(By.id("rd-nav-futuresmart-level1")); //Header change xpath
		List<WebElement> links = Futuresmart.findElements(By.tagName("a"));
		Actions o = new Actions(driver);
		
		o.moveToElement(Futuresmart).build().perform();
		         Thread.sleep(1000);
		        
		 		
		 		int no_of_links= links.size();
		 		System.out.println("Number of Links for Futuresmart section :"+no_of_links);
		 		
		 		 for(int i=0;i<links.size();i++)
		 	     {
		 	         WebElement E1= links.get(i);
		 	         String url= E1.getAttribute("href");
		 	         verifyLinks(url);
		 	     }
		 	    }

	@Test(groups = "To Verify Investors Links ",priority=5)
	public void VerifyInvestors_Headerlinks() throws InterruptedException
	{
		
		driver.navigate().to("https://www.angloamerican.com/");
		WebElement Investors = driver.findElement(By.id("rd-nav-investors-level1")); //Header change xpath
		List<WebElement> links = Investors.findElements(By.tagName("a"));
		Actions o = new Actions(driver);
		
		o.moveToElement(Investors).build().perform();
		         Thread.sleep(1000);
		        
		 		
		 		int no_of_links= links.size();
		 		System.out.println("Number of Links for Investors section :"+no_of_links);
		 		
		 		 for(int i=0;i<links.size();i++)
		 	     {
		 	         WebElement E1= links.get(i);
		 	         String url= E1.getAttribute("href");
		 	         verifyLinks(url);
		 	     }
		 	    }
	@Test(groups = "To Verify Careers Links ",priority=6)
	public void VerifyCareers_Headerlinks() throws InterruptedException
	{
		
		driver.navigate().to("https://www.angloamerican.com/");
		WebElement Careers = driver.findElement(By.id("rd-nav-careers-level1")); //Header change xpath
		List<WebElement> links = Careers.findElements(By.tagName("a"));
		Actions o = new Actions(driver);
		
		o.moveToElement(Careers).build().perform();
		         Thread.sleep(1000);
		        
		 		
		 		int no_of_links= links.size();
		 		System.out.println("Number of Links for Careers section :"+no_of_links);
		 		
		 		 for(int i=0;i<links.size();i++)
		 	     {
		 	         WebElement E1= links.get(i);
		 	         String url= E1.getAttribute("href");
		 	         verifyLinks(url);
		 	     }
		 	    }
	
	
	
	
	
	
	
	
	
	
		 		 public static void verifyLinks(String linkUrl)
			 	 {
			 	     try
			 	     {
			 	         URL url = new URL(linkUrl);

			 	         //Now we will be creating url connection and getting the response code
			 	         HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
			 	         httpURLConnect.setConnectTimeout(5000);
			 	         httpURLConnect.connect();
			 	         if(httpURLConnect.getResponseCode()>=400)
			 	         {
			 	         	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
			 	         }    
			 	    
			 	         //Fetching and Printing the response code obtained
			 	         else{
			 	             System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
			 	         }
			 	     }catch (Exception e) {
			 	   }
	}
		 		@AfterMethod
		 	   	public void teardown()
		 	   	{
		 	   		 driver.quit();
		 	   	}
}
