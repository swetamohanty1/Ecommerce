package com.Ecommerce.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
	 WebDriver driver;
	
	@FindBy(xpath="(//button[text()=' Add To Cart'])[2]")
	private WebElement adCtx;
	
	@FindBy(xpath="//button[@routerlink='/dashboard/cart']")
	private WebElement ctBtx;
	
	@FindBy(xpath="//*[text()='Buy Now']")
	private WebElement bnTbx;
	
    @FindBy(xpath="(//*[@class='input ddl'])[1]")
    private WebElement Expdt;
    
    @FindBy(xpath="(//*[@class='input ddl'])[2]")
    private WebElement Expdtt;
	
    @FindBy(xpath="(//*[@class='input txt'])[1]")
    private WebElement cvv;
    
    @FindBy(xpath="(//*[@class='input txt'])[2]")
    private WebElement noc;
    
    @FindBy(xpath="//input[@placeholder='Select Country']")
    private WebElement cntry;
    
    @FindBy(xpath="//*[@class='btn btn-danger']")
    private WebElement dlt;
    
    
    
    
	/*@FindBy(xpath="(//button[@class='ta-item list-group-item ng-star-inserted'])[2]")
    private WebElement select;*/
   
    
   /*@FindBy(xpath="//*[text()='Place Order ']")
    private WebElement plcbtn;*/
    
    
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getAdCtx() {
		return adCtx;
	}


	public WebElement getCtBtx() throws InterruptedException {
		Thread.sleep(10000);
		return ctBtx;
	}


	public WebElement getBnTbx() {
		return bnTbx;
	}
	
	public void setLogin(String cv,String nc) throws InterruptedException
	{
		Select s=new Select(Expdt);
		s.selectByIndex(2);
		
		Select s1=new Select(Expdtt);
	    s1.selectByIndex(4);
	    
	    cvv.sendKeys(cv);
	    noc.sendKeys(nc);
	    cntry.click();
	    dlt.click();
	   /* select.sendKeys(selectcntryy);
	    select.click();*/
	   /* plcbtn.click();*/
	    
	    
	    
	  
	}
	
	
	
	
	

}
		
		
	




	
	
	
	


