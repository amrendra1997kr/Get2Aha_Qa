/**
 * 
 */
package com.pratian.automation.TestClass;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pratian.automation.PageObjects.HomePage;
import com.pratian.automation.Utils.ExcelUtility;

/**
 * @author Amrendra
 *
 */
public class TestLogin extends BaseTest{

	@Test(dataProvider="login")
	public void login(String user,String pwd) throws Exception {
		HomePage hp = new HomePage(driver);
		Assert.assertTrue(hp.username.isDisplayed());
		hp.provideusername(user);
		Assert.assertTrue(hp.password.isDisplayed());
		hp.providepassword(pwd);
		Thread.sleep(4000);
		hp.clickLogin();
		Thread.sleep(4000);
	}
	
	@DataProvider(name="login")
	public Object[][] getData(){
		Object data[][] = ExcelUtility.getTestData("login");
		return data;
	}
}
