/**
 * 
 */
package com.pratian.automation.TestClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.pratian.automation.FileHandling.PropertyManager;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Amrendra
 *
 */
public class BaseTest {
	protected WebDriver driver;

	@BeforeClass
	public void setUp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(PropertyManager.getProperty("url.app"));// accessing the url for testing	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();//Maximize the window
	}



	@AfterClass
	public void tearDown()
	{
		driver.close();//closing the opened driver
	}

}
