package com.Ecommerce.test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Ecommerce.generic.BaseClass;
import com.Ecommerce.pom.CartPage;
import com.Ecommerce.pom.CheckOut;
import com.Ecommerce.pom.LoginPage;
import com.Ecommerce.pom.SignOut;

public class Login extends BaseClass{
	@Test
     public void LoginCutomer() throws InterruptedException {
		Reporter.log("LoginCutomer",true);
		
		CartPage c=new CartPage(driver);
		c.getAdCtx().click();
		c.getCtBtx().click();
		c.getBnTbx().click();
	    
		c.setLogin("68964","Sourav");
		
		
		
		
    	 
     }
}
