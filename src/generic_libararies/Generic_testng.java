package generic_libararies;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_testng implements Auto_constant
{
	public WebDriver driver;
	@BeforeMethod
	public void open_app() throws FileNotFoundException, IOException
	{
		System.setProperty(gecko_key,gecko_value);
		String website = Property_generic.property("./p.properties", "url");
		//String  = Property_generic.property("./p.properties", "url");
		
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get(website);
		 driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void close_app(ITestResult res) throws IOException
	{
		int status = res.getStatus();
		if(status==2)
		{
		Screen_generic.getphoto(driver);
		}
		//driver.quit();
	}
}
