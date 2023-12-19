package com.Ecommerce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="userEmail")
	private WebElement unTbx;
	
	
	@FindBy(id="userPassword")
	private WebElement pwTbx;
	
	
	@FindBy(id="login")
	private WebElement lgBtn;

	
	public LoginPage(WebDriver driver)//constructor
	{
		PageFactory.initElements(driver,this);//initialization
		
	}
	
	public void setLogin(String un,String pw)
	{
		unTbx.sendKeys(un);
		pwTbx.sendKeys(pw);      //utilization
		lgBtn.click();
	}
}
