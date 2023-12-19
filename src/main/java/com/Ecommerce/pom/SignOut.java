package com.Ecommerce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOut {
	WebDriver driver;
	
	@FindBy(xpath=" //*[text()=' Sign Out ']")
	private WebElement snout;

	
	public void SignOutt(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void setLogout() {
		snout.click();
	}
}
