package generic_libararies;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Webdriver_genric 
{
	public void close1(WebDriver driver)
	{
		driver.close();
	}
	public void quit1(WebDriver driver)
	{
		driver.quit();
	}
	public String Url1(WebDriver driver)
	{
		String url = driver.getCurrentUrl();
		return url;
		
	}
	public void page_source(WebDriver driver)
	{
		String source = driver.getPageSource();
		System.out.println(source);
	}
	public void page_title(WebDriver driver)
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	public void Get(WebDriver driver,String g)
	{
		driver.get(g);
		
	}
	public void handles(WebDriver driver)
	{
		
		String id = driver.getWindowHandle();
		System.out.println(id);
	}
	public void all_handles(WebDriver driver,int i)
	{
		
		Set<String> all_id = driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(all_id);
		  String s = l.get(i);
		  driver.switchTo().window(s);
		
//		for(String we:all_id)
//		{
//			l.add(we);
//		}
//		for(String t:l)
//		{
//			System.out.println(t);
//		}
//		
		
	}
	public void Switch_tab(WebDriver driver,int i)
	{
		Set<String> all_id = driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(all_id);
//		for(String we:all_id)
//		{
//			l.add(we);
//			
//			
//		}
				String sw = l.get(i);
				driver.switchTo().window(sw);
				
	}
	
		
	

}
