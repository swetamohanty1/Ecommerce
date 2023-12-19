package com.Ecommerce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete {
	WebDriver driver;
	
		@FindBy(xpath="(//button[text()=' Add To Cart'])[2]")
		private WebElement addCtx;
		
		@FindBy(xpath="//button[@routerlink='/dashboard/cart']")
		private WebElement cttBtx;
		
		@FindBy(xpath="//*[@class='btn btn-danger']")
	    private WebElement dlt;
		
		
		public Delete(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	public void setAdd()
	{
		addCtx.click();
	}
	public void setCart() throws InterruptedException {
		Thread.sleep(1000);
		cttBtx.click();
		
	}
	
	public void setDelete(){
		dlt.click();
	}
	
}
