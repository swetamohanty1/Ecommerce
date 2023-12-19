package com.Ecommerce.test;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Ecommerce.generic.BaseClass;
import com.Ecommerce.pom.Delete;

public class AddToCartAndDelete extends BaseClass {
	@Test
public void DeleteCart() throws InterruptedException {
		Reporter.log("Delete Product",true);
		Delete d=new Delete(driver);
		d.setAdd();
		d.setCart();
		d.setDelete();
		
		
		
	
}
}
