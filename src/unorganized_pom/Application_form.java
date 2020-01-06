package unorganized_pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_libararies.Drop_generic;

public class Application_form 
{
	@FindBy(xpath="(//a)[3]")
	private WebElement scheme;
	
	@FindBy(xpath="//a[.='Application Form']")
	private WebElement form;
	
	@FindBy(xpath="//input[@name='full_name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@name='guardian_name']")
	private WebElement gu_name;
	
	@FindBy(xpath="//select[@name='permanent_district']")
	private WebElement dist_dropdown;
	
	@FindBy(xpath="//select[@name='permanent_taluk']")
	private WebElement taluk_dropdown;
	
	@FindBy(xpath="//select[@name='permanent_gram_panchayat']")
	private WebElement panchayat_dropdown;
	
	@FindBy(xpath="//input[@name='permanent_address']")
	private WebElement pm_address;
	
	@FindBy(xpath="//input[@name='permanent_pincode']")
	private WebElement pm_pincode;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement checkbox;
	
	@FindBy(xpath="//input[@name='mobile_number']")
	private WebElement mb_no;
	
	@FindBy(xpath="//input[@value='Male']")
	private WebElement male;
	
	@FindBy(xpath="//input[@type='date']")
	private WebElement date;
	
//	@FindBy(xpath="//input[@name='age']")
//	private WebElement age;
	
	
	@FindBy(xpath="//input[@name='aadhar_card_number']")
	private WebElement ad_no;
	
	@FindBy(xpath="//select[@name='sector_number']")
	private WebElement sect_dropdown;
	
	@FindBy(xpath="(//input[@name='self_employed'])[1]")
	private WebElement self_employ_check;
	
	@FindBy(xpath="//input[@name='self_income']")
	private WebElement self_income;
	
	@FindBy(xpath="//input[@name='bank_account']")
	private WebElement bank_account;
	
	@FindBy(xpath="//input[@name='bank_ifsc']")
	private WebElement bank_ifsc;
	
	@FindBy(xpath="//input[@name='bank_name']")
	private WebElement bank_name;
	
	@FindBy(xpath="//input[@name='profile_file']")
	private WebElement upload1;
	
	@FindBy(xpath="//input[@name='aadhar_file']")
	private WebElement upload2;
	
	@FindBy(xpath="//input[@name='application_place']")
	private WebElement place;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit_button;
	
	public Application_form(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void open_form()
	{
		scheme.click();
		
		form.click();
	}
	public void fill_form(String un,String gua_name,String add,String pin,String mb,String ad,String place1) throws AWTException, InterruptedException
	{
		name.sendKeys(un);
		
		gu_name.sendKeys(gua_name);
		
		Drop_generic dp=new Drop_generic(dist_dropdown);
		
		dp.selectIndex(1);
		
		Drop_generic dp2=new Drop_generic(taluk_dropdown);
		
		dp2.selectIndex(2);
		
		Drop_generic dp1=new Drop_generic(panchayat_dropdown);
		
		dp1.selectIndex(3);
		
		pm_address.sendKeys(add);
		
		pm_pincode.sendKeys(pin);
		
		
		checkbox.click();
		
		mb_no.sendKeys(mb);
		
		
		male.click();
		
		date.click();
		
		
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_0);
		r.keyPress(KeyEvent.VK_8);
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_8);
		
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_9);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_9);
		r.keyPress(KeyEvent.VK_4);
		
		r.keyRelease(KeyEvent.VK_0);
		r.keyRelease(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_8);
		
		r.keyRelease(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_9);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_9);
		r.keyRelease(KeyEvent.VK_4);
		
		//age.sendKeys("25");
		
		ad_no.sendKeys(ad);
		
		Drop_generic dp3=new Drop_generic(sect_dropdown);
		
		dp3.selectIndex(2);
		
		self_employ_check.click();
		
		self_income.sendKeys("500");
		
		bank_account.sendKeys("3947101561844");
		
		bank_ifsc.sendKeys("cnrb039471");
		
		bank_name.sendKeys("canarabank");
		
		upload1.sendKeys("C:\\Users\\Akshay\\Downloads\\Screenshot_2019-12-16-14-26-02-601_my.com.iris.ams.live.jpg");
		
		upload2.sendKeys("C:\\Users\\Akshay\\Downloads\\Screenshot_2019-12-16-14-26-02-601_my.com.iris.ams.live.jpg");
		
		place.sendKeys(place1);
		
		submit_button.click();
		
	}
}
