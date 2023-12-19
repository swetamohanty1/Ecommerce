package com.Ecommerce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class Register {
	@FindBy(xpath="//*[text()='Register here']")
	private WebElement Reg;

	@FindBy(id="firstName")
	private WebElement FstNm;
	
	@FindBy(id="lastName")
	private WebElement LstNm;
	
	@FindBy(id="userEmail")
	private WebElement Em;
	
	@FindBy(id="userMobile")
	private WebElement phn;
	
	@FindBy(xpath="//*[@formcontrolname='occupation']")
	private WebElement Ocp;
	
	@FindBy(xpath="//*[@value='Male']")
	private WebElement male;
	
	

	
	@FindBy(id="userPassword")
	private WebElement Pw;
	
	@FindBy(id="confirmPassword")
	private WebElement Cpw;
	
	@FindBy(xpath="//*[@type='checkbox']")
	private WebElement chkbx;
	
	@FindBy(name="login")
	private WebElement regstr;
	
	
	public  Register(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void setLogin(String fn,String ln,String em, String mn,String ocp, String pw, String cpw)
	{
	Reg.click();
	FstNm.sendKeys(fn);
	LstNm.sendKeys(ln);
	Em.sendKeys(em);
	phn.sendKeys(mn);
	chkbx.click();
	
	 
	
	Select s=new Select(Ocp);
	s.selectByVisibleText(ocp);
	
	Pw.sendKeys(pw);
	Cpw.sendKeys(cpw);
	male.click();
	regstr.click();
	
	
	}
	
}
