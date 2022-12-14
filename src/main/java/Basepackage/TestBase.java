package Basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("D:\\AngloAmerican\\AngloAutomation\\src\\main\\java\\config.properties");
		prop.load(ip);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("Chrome")){
			
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("Firefox")){
			
			driver = new FirefoxDriver(); 
		}
		else if(browserName.equals("Edge")){
			
			driver = new EdgeDriver(); 
		}
		
		else
		{
			System.out.println("Browser is not available");
		}
		
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(prop.getProperty("url"));
		
	}

}
