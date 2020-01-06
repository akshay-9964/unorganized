package generic_libararies;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action_generic
{
	Actions act;
	
	public Action_generic(WebDriver driver,WebElement ele)
	{
		act=new Actions(driver);
	}
	public void mousehower(WebElement ele)
	{
		act.moveToElement(ele).perform();
	}
	public void RightClick(WebElement ele)
	{
		
		act.contextClick(ele).perform();
	}
	public void Double(WebElement ele)
	{
		
		act.doubleClick(ele).perform();;
	
	}
	public void Drag(WebElement ele,WebElement ele1)
	{
		
		act.dragAndDrop(ele, ele1).perform();
	}
	public void New_tab(WebElement ele) throws AWTException
	{
		
		act.contextClick(ele).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}
	public void New_Window(WebElement ele) throws AWTException
	{
		
		act.contextClick(ele).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
	}
	public void New_Private(WebElement ele) throws AWTException
	{
		
		act.contextClick(ele).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
	}
	
}
