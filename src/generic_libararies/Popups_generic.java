package generic_libararies;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popups_generic
{
	public void Alert_pop_ac(WebDriver driver)
	{
		Alert a=driver.switchTo().alert();
		String txt = a.getText();
		System.out.println(txt);
		a.accept();
	}
	public void Alert_pop_dis(WebDriver driver)
	{
		Alert a=driver.switchTo().alert();
		a.dismiss();
	}
	public void File_upload(WebElement ele,String path)
	{
		ele.sendKeys(path);
		
	}
	public void File_download_Save() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void File_download_open() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void File_download_cancel() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}
}
