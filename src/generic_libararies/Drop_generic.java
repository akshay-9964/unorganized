package generic_libararies;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Drop_generic 
{
	Select s;
	public Drop_generic(WebElement ele)
	{
		s=new Select(ele);
	}
	public void selectIndex(int i)
	{
		
		s.selectByIndex(i);
		
	}
	
	public void selectValue(String val)
	{
		
		s.selectByValue(val);
		
	}
	public void selectText(String text)
	{
		
		s.selectByVisibleText(text);
		
	}
	public void Deselect()
	{
		
		s.deselectAll();
		
	}
	public void DeselectBy(int j)
	{
		
		s.deselectByIndex(j);
		
	}
	public void deselectValue_de(String val1)
	{
		
		s.deselectByValue(val1);
		
	}
	public void selectText_de(String text1)
	{
		
		s.deselectByVisibleText(text1);
		
	}
	public boolean Multiple()
	{
		
		boolean b = s.isMultiple();
		return b;
	
		
	}
	public void Options()
	{
		
		List<WebElement> options = s.getOptions();
		for(WebElement we:options)
		{
			String txt = we.getText();
			System.out.println(txt);
		}
		
	}
	public int Option_size()
	{
		
		List<WebElement> len = s.getOptions();
		int count = len.size();
		return count;
		
	}
}
