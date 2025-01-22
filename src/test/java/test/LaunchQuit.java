package test;


import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class LaunchQuit extends Listner_logic
{
	@Parameters("browser")
	
	@BeforeMethod
	public void launch(String browsername) throws InterruptedException
	{
		if(browsername.equals("chrome"))
		{
	    driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		if(browsername.equals("edge"))
		{
	    driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		}
		if(browsername.equals("firefox"))
		{
	    driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
				
	}
	@AfterMethod
	public void quit() throws InterruptedException
	{
		driver.close();
		
	}

}
