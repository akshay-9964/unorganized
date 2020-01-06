package test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import generic_libararies.Generic_testng;
import unorganized_pom.Application_form;
import unorganized_pom.Payment;

public class Test_kar extends Generic_testng
{
	@Test
	public void fill() throws AWTException, InterruptedException
	{
		
	Application_form ap=new Application_form(driver);
	
	ap.open_form();
	
	ap.fill_form("demo mar", "test", "#bagalkote","572116", "8792217253", "935371750443","bagalkote");
	
	Payment  p=new Payment(driver);
	
	Thread.sleep(3000);
	
	p.pay_amount(driver);
	
	
	p.detail("test", "123",driver);
	
	
	
	
	}
	
	
	
}
