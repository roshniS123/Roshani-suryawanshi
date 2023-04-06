package Testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Forgottpassward;
import Pages.Loginpage;

public class TestngForgottpassward {
     
	WebDriver driver;
	Loginpage loginpage;
	Forgottpassward forgottpassward;
	
		
	@BeforeClass
	public void Openthechrome() {
		System.out.println("Before class");
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions ops = new ChromeOptions();
	        ops.addArguments("--remote-allow-origins=*");
	        
			driver = new ChromeDriver(ops);
	}
	@BeforeMethod 
	public void Gotoforgottpassward() {
		driver.get("https://www.facebook.com/");
		System.out.println("Before method");
		loginpage = new Loginpage (driver);
		loginpage.Forgottpassward();
		
		
	}
	@Test
	public void Verifyforgottpassward() {
		System.out.println("TestClass1");
		//Forgottpassward forgottpassward = new Forgottpassward(driver);
		String actualMsg =  forgottpassward.getTextMessage();
		String expectedresultMess = "Please enter your email address or mobile number to search for your account.";
		if (actualMsg.equals(expectedresultMess));
		{
			System.out.println("PASSED");
		}
		
		{
			System.out.println("FAILED");
		}
	}
	
	@Test
	public void test2() {
		System.out.println("TestCLass2");
		Forgottpassward forgottpassward = new Forgottpassward(driver);
		forgottpassward.Canclebutton();
		String expectedUrl = "";
		String expectedTitle = "";
		String actualUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		if(expectedUrl.equals(actualUrl) && expectedTitle.equals(actualTitle))
		{
			System.out.println("PASSED");
		}
		else 
		{
			System.out.println("FAILED");
		}
	}
	@Test
	public void Test3() {
		System.out.println("TestClass3");
		Forgottpassward forgottpassward = new Forgottpassward(driver);
		forgottpassward.ClickOnsearchbutton();
		String expectedErrorTitle = "";
		String expectedErrorMess = "";
		String actualErrorTitle = forgottpassward.getTextMessage();
		String actualErrorMess = forgottpassward.getTextMessage();
		if (expectedErrorTitle.equals(actualErrorTitle) && expectedErrorMess.equals(actualErrorMess))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
	}
	
	
	@AfterMethod
	public void LogutFromApplication() {
		System.out.println("After Method");
	}
	@AfterClass 
	public void ClosedBrowser () {
		System.out.println("After Class");
		driver.quit();
	}
}
