package generic;

	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;

	public class CommonConfigurations  implements IAutoConstant {
		static
		{
			System.setProperty(Firefox_key, Firefox_value);
			
		}
		CommonUtils cu=new CommonUtils();
		public WebDriver driver;
		@BeforeClass
		public void launchBrowser()
		{
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		
			
		}
		@BeforeMethod
		public void configureBm() throws IOException
		
		{
			
			String url=cu.getDataFromProperties("amazonurl");
			driver.get(url);
			
			
			
		}
		@AfterTest
		public void closeBrowser()
		{
			driver.close();
		}

	}

	


