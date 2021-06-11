/**
 * 
 */
package com.pratian.automation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Amrendra
 *
 */
public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-login/div/div/div[1]/div/div[2]/form/div[1]/input")
	public WebElement username;
	
	@FindBy(xpath="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-login/div/div/div[1]/div/div[2]/form/div[2]/strong/input")
	public WebElement password;
	
	@FindBy(xpath="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-login/div/div/div[1]/div/div[2]/form/div[3]/button")
	public WebElement loginbtn;
	
	public void provideusername(String uname) {
		this.username.clear();
		this.username.sendKeys(uname);
	}
	public void providepassword(String pswrd) {
		this.password.clear();
		this.password.sendKeys(pswrd);
	}
	public void clickLogin() {
		this.loginbtn.click();
	}

}
