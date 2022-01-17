package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest extends BaseClass {
	
	
	@Test
	public void loginTest() throws IOException{
		driver.get(baseURL);
		logger.info("URL Opened");
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("username added");
		lp.setPassword(password);
		logger.info("paassword added");
		lp.clickSubmit();
		
		if(driver.getTitle().equals("ABC")){
			Assert.assertTrue(true);
		}else{
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
}
