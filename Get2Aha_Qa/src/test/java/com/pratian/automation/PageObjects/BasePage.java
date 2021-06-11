/**
 * 
 */
package com.pratian.automation.PageObjects;

import org.openqa.selenium.WebDriver;

/**
 * @author Amrendra
 *
 */
public class BasePage {
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver = driver;// calling web driver
	}

}
