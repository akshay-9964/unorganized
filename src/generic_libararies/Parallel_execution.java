package generic_libararies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Parallel_execution 
{
	public WebDriver driver;
	static
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
	}
	@Parameters("browser")
	@BeforeMethod
	public void test_parallel(String browser)
	{
		
			if(browser.equals("firefox"))
			{
				driver=new FirefoxDriver();
				driver.get("https://www.flipkart.com");
			}
			else if(browser.equals("chrome"))
			{
				driver=new ChromeDriver();
				driver.get("https://www.flipkart.com");
			}
			else
			{
				driver=new InternetExplorerDriver();
				driver.get("https://www.flipkart.com");
			}
		}
			@AfterMethod
			public void close_app()
			{
				//driver.quit();
			}
	}
	

