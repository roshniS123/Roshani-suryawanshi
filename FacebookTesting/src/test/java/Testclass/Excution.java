package Testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pages.Forgottpassward;
import Pages.Loginpage;

public class Excution {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions ops = new ChromeOptions();
	        ops.addArguments("--remote-allow-origins=*");
	        
			WebDriver driver = new ChromeDriver(ops);
	        
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			Loginpage loginpage = new Loginpage(driver);
			loginpage.UserID();
			Thread.sleep(3000);
			loginpage.Passward();
			Thread.sleep(3000);
			loginpage.ClickOnLoginbutton();
			Thread.sleep(3000);
			loginpage.Clickonclosebutton();
			Thread.sleep(3000);
			loginpage.Forgottpassward();
			Thread.sleep(3000);
			//loginpage.Canclebutton();
		//	Thread.sleep(3000);
			Forgottpassward forgotpassward = new Forgottpassward(driver);
			forgotpassward.Canclebutton();
}
}