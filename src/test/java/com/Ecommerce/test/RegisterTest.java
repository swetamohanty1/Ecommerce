package com.Ecommerce.test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Ecommerce.pom.Register;

public class RegisterTest {
   static {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }
   
   @Test
   public void Validlogin(){
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.get("https://rahulshettyacademy.com/client");
	   Register r=new Register(driver);
	   r.setLogin("sourav", "mallick", "mallickpapan123@gmail.com", "7381418031", "Student", "Papan123", "Papan123");
	   
	   
   }

}
