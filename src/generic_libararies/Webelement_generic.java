package generic_libararies;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Webelement_generic 
{
	public String Text(WebElement ele)
	{
		String txt = ele.getText();
		return txt;
	}
	public String Attribute(WebElement ele,String att)
	{
		
		String att1 = ele.getAttribute(att);
		return att1;
	}
	public Point Locations(WebElement ele)
	{
		Point loc = ele.getLocation();
		return loc;
		
	}
	public String cssvalue(WebElement ele,String val)
	{
		String value = ele.getCssValue(val);
		return value;
		
	}
	public void Click1(WebElement ele)
	{
	
		ele.click();
		
	}
	public void Clear(WebElement ele)
	{
	
		ele.clear();
		
	}
	public void Tag(WebElement ele)
	{
	
		String tag = ele.getTagName();
		System.out.println(tag);
		
	}
	public void send(WebElement ele,String sendkey)
	{
	
		ele.sendKeys(sendkey);
		
	}
	public void size(WebElement ele)
	{
	
		Dimension dim = ele.getSize();
		System.out.println(dim);
		
	}
	public boolean isSelect(WebElement ele)
	{
	
		boolean b = ele.isDisplayed();
		return b;
		
	}
	public boolean isEnable(WebElement ele)
	{
	
		boolean e = ele.isEnabled();
		return e;
		
	}
	public boolean isDisplay(WebElement ele)
	{
	
		boolean d = ele.isDisplayed();
		return d;
		
	}
	
	
}
