package Testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Pages.Forgottpassward;
import Pages.Loginpage;

public class Diffrentbrowser {
	WebDriver  driver;
	Loginpage loginpage;
	Forgottpassward fogottpassward;
	
	@Parameters ("browser")
	@BeforeTest
	
	public void openbrowser(String browserName) {
		System.out.println("BeforeTest");
	
	if(browserName.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions ops = new ChromeOptions();
	        ops.addArguments("--remote-allow-origins=*");
	        
			driver = new ChromeDriver(ops);
	}
	if (browserName.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Roshni\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		// ChromeOptions  = new ChromeOptions();
	       // ops.addArguments("--remote-allow-origins=*");   
			driver =  new FirefoxDriver();
	}
	//if (browserName.equals("Opera"))
	//{
	//	System.setProperty("webdriver.opera.driver", "C:\\Users\\Roshni\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
	//	 ChromeOptions ops = new ChromeOptions();
	  //      ops.addArguments("--remote-allow-origins=*");
	        
		//	driver =  new OperaDriver();

	}
	}

