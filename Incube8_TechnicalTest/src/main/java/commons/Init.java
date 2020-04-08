package commons;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init extends PropertyReader {

	public static WebDriver driver;

//This Method opens theh driver instance
	public static WebDriver openBrowser() throws IOException
	{
		String path=getObject("path");
		System. setProperty("webdriver.chrome.driver",path); 

		//Used Singleton Design Pattern to verify that the driver instance is unique so that multiple browsers will not open

		if(driver==null)
		{
			driver=new ChromeDriver();
		}
		return driver;


	}
	
	//This method launches the application 

	public static void launchApp() throws IOException
	{
		driver.manage().window().maximize();
		String url=getObject("url");
		driver.get(url);

	}


}