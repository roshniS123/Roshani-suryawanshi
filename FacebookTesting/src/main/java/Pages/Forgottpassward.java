package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgottpassward {

	 // Variable intilization 
		@FindBy (xpath = "//a[@class='_97w4']")
		private WebElement Clickonforgottpassward;
		
		@FindBy (xpath = "//table//div")
		private WebElement textMessage;
		
		@FindBy (xpath = "(//input[@name='email'])[2]")
		private WebElement emailphonenumber;
		
		@FindBy (xpath = "//a[text()='Cancel']")
		private WebElement Canclebutton;
		
		@FindBy (xpath = "//button[text()='Search']")
		private WebElement searchbutton;
		
		
		
		public Forgottpassward(WebDriver driver)
		{
			PageFactory.initElements(driver ,this);
		}
	
		public void Clickonforgottpassward()
		{
			Clickonforgottpassward.click();
		}
		public String getTextMessage() 
		{
		    String	text = textMessage.getText();
			return text;
		   
		}

		public void Emailphonenumber()
		{
		    emailphonenumber.sendKeys("Velocity123@gmail.com");
		}
		public void Canclebutton()
		{
		    Canclebutton.click();
		}
		public void ClickOnsearchbutton()
		{
		 	searchbutton.click();
		}
}