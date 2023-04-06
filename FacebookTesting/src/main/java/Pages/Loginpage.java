package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	
	 // Variable intilization 
	@FindBy (xpath = "//input[@type='text']")
	private WebElement UserID;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement Passward;
	
	@FindBy (xpath = "//button[@name='login']")
	private WebElement ClickOnLoginbutton;
	
	@FindBy (xpath = "//div[@class='_9ai5']")
	private WebElement Clickonclosebutton;
	
	@FindBy (xpath = "//div[@class='_6ltj']")
	private WebElement Forgottpassward;
	
	@FindBy (xpath = "//a[text()='Cancel']")
	private WebElement Canclebutton;
	
	@FindBy (xpath = "//a[text()='Create new account']")
	private WebElement CreateNewAcc;
	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver ,this);
	}
	public void UserID() 
	{
		UserID.click();
		UserID.sendKeys("velocity@1234");
	}
	public void Passward()
	{
		Passward.click();
		Passward.sendKeys("12345678");
	}
	public void ClickOnLoginbutton()
	{
		ClickOnLoginbutton.click();	
	}
	
	public void Clickonclosebutton()
	{
		Clickonclosebutton.click();	
	}
	
	public void Forgottpassward()
	{
		Forgottpassward.click();	
	}
	public void Canclebutton ()
	{
	  Canclebutton.click();	
	}
	//public void CreateNewAcc ()
	//{
		//CreateNewAcc.click();	
	//}

}




