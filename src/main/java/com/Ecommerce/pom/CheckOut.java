package com.Ecommerce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CheckOut {
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Select Country']")
    private WebElement cntry;
    
	@FindBy(xpath="(//button[@class='ta-item list-group-item ng-star-inserted'])[2]")
    private WebElement select;
	
    @FindBy(xpath="//*[text()='Place Order ']")
    private WebElement plcbtn;
    
    
    
    public void selectCountry() throws InterruptedException {
    	cntry.click();
    	select.sendKeys(" India");
    }
}
