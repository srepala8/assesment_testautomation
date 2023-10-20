package com.absa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.absa.utils.WebEventListener;



public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public static EventFiringWebDriver e_driver;
	
	public static WebEventListener eventListener;
	
	public TestBase()
	{
		try
			{
			prop= new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\srepa\\eclipse-workspace\\AutomationTestAssesment\\src\\main\\java\\com\\absa\\config\\Config.properties");
			System.out.println("file path:"+fis.toString());
			prop.load(fis);
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			catch(NullPointerException e)
			{
				e.printStackTrace();
			}
			//System.out.println(prop.getProperty("browser"));
		}
	
	
	
	public static void initialization( )
	{
	String browserName = prop.getProperty("browser");
	if(browserName.equalsIgnoreCase("chrome"))
	{
		
	driver= new ChromeDriver();
	}
	else
	if(browserName.equalsIgnoreCase("firefox"))
	{
	
	driver= new FirefoxDriver();
	
	}else if(browserName.equals("IE"))
	 {
		 driver=new InternetExplorerDriver();
    }else {
   	 driver=new EdgeDriver();
    }
	
	e_driver = new EventFiringWebDriver(driver);
	// Now create object of EventListerHandler to register it with EventFiringWebDriver
	
	WebEventListener eventListener = new WebEventListener();
	e_driver.register(eventListener);
	driver = e_driver;
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	

	driver.get(prop.getProperty("url")); 
	}
}


