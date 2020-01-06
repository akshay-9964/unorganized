package unorganized_pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic_libararies.Drop_generic;

public class Payment 
{
	
	
	@FindBy(xpath="//input[@name='ccard_number']")
	private WebElement card;
	
	@FindBy(xpath="//input[@name='cname_on_card']")
	private WebElement name_card;
	
	@FindBy(xpath="//input[@id='ccvv_number']")
	private WebElement cvv;
	
	@FindBy(xpath="//select[@id='cexpiry_date_month']")
	private WebElement expiry_month;
	
	@FindBy(xpath="//select[@id='cexpiry_date_year']")
	private WebElement expiry_year;
	
	@FindBy(xpath="//input[@id='pay_button']")
	private WebElement pay_but;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submit_button;
	
	public Payment (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void pay_amount(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('ccard_number').value='4012 0010 3714 1112'");
	}
	public void detail(String name,String cv,WebDriver driver) throws InterruptedException
	{
		name_card.sendKeys(name);
		
		cvv.sendKeys(cv);
		
		Drop_generic dp=new Drop_generic(expiry_month);
		
		dp.selectIndex(5);
		
		Drop_generic dp1=new Drop_generic(expiry_year);
		
		dp1.selectIndex(1);
		
		pay_but.click();
		
		Thread.sleep(6000);
		
		submit_button.click();
		
		Thread.sleep(7000);
		
		}

}
