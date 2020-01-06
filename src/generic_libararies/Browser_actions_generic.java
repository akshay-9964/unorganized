package generic_libararies;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class Browser_actions_generic
{
	public void navigate_forward(WebDriver driver)
	{
		driver.navigate().forward();
	}
	public void navigate_back(WebDriver driver)
	{
		driver.navigate().back();
	}
	public void navigate_refresh(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void minimize() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
	}
	public void resize(WebDriver driver,int x,int y)
	{
		Dimension d=new Dimension(x,y);
		driver.manage().window().setSize(d);
	}
	public void Drag_browse(WebDriver driver,int x,int y)
	{
		Point p=new Point(x,y);
		driver.manage().window().setPosition(p);
	}
	public void delete_cookies(WebDriver driver)
	{
		driver.manage().deleteAllCookies();
		
	}
}
