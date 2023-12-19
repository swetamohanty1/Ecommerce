 package com.Ecommerce.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Ecommerce.pom.LoginPage;
import com.Ecommerce.pom.SignOut;

public class BaseClass {
	static {
		   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   }
    	
     public static WebDriver driver;
     @BeforeClass
     public void OpenBrowser()
     {
    	 Reporter.log("Open Browser",true);
    	 driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	 
    	 
    	 
     }
     
     @AfterClass
     public void ClosedBrowser() {
	
    	 Reporter.log("closed",true);
    	 driver.close();
     }
     
     
     @BeforeMethod
     public void Login() throws IOException
     {
    	 FileLib f=new FileLib();
    	   String url = f.getProperty("Url");
    	   String un=f.getProperty("Username");
    	   String pw=f.getProperty("Password");
    	   driver.get(url);//open the url
    	   
    	   
    	 LoginPage l=new LoginPage(driver) ;
    	 l.setLogin(un,pw);
    	 
    	
     } 
    
     @AfterMethod
     public void Logout() {
    	 Reporter.log("Account Logout",true);
    	 driver.findElement(By.xpath("//*[text()=' Sign Out ']")).click();
     }
     
     
     
     
    	  
     
}
