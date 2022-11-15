import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dummy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.angloamerican.com/");
		
		
		WebElement Aboutus = driver.findElement(By.id("rd-nav-about-us-level1")); 
		List<WebElement> links = Aboutus.findElements(By.tagName("a"));
		Actions o = new Actions(driver);
		
		o.moveToElement(Aboutus).build().perform();
		         Thread.sleep(1000);
		        
		 		
		 		int no_of_links= links.size();
		 		System.out.println("Number of Links for Social Icon section :"+no_of_links);
		 		
		 		 for(int i=0;i<links.size();i++)
		 	     {
		 	         WebElement E1= links.get(i);
		 	         String url= E1.getAttribute("href");
		 	         verifyLinks(url);
		 	     }
		 	     
		 	     driver.quit();
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

}
