package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Popup1 {

	 // Variable intilization 
		@FindBy (xpath = "(//input[@type='text'])[2]")
		private WebElement FirstName;
		
		@FindBy (xpath = "//input[@aria-label='Surname']")
		private WebElement Lastname;
		
		@FindBy (xpath = "(//input[@type='radio'])[3]")
		private WebElement Custom;
		
		
		@FindBy (xpath = "//select[@aria-label='Day']")
		private WebElement DateOfBirth;
		
		@FindBy (xpath = "//select[@aria-label='Month']")
		private WebElement MonthOfbirth;
		
		@FindBy (xpath = "//select[@name='birthday_year']")
		private WebElement YearOfbirth;

		 WebDriver driver;
		
		
		public Popup1 (WebDriver driver)
		{
			PageFactory.initElements(driver ,this);
			this.driver=driver;
		} 
		public void FirstName () 
		{
			FirstName.click();
			FirstName.sendKeys("Rushikesh");
		}
		public void Lastname()
		{
			Lastname.click();
			Lastname.sendKeys("Suryawanshi");
		}
		public void custom()
		{
			Actions action = new Actions(driver);
			action.moveToElement(Custom).click().build().perform();
			
		}
		
		public void DateOfBirth()
		{
			Select select = new Select(DateOfBirth);
			select.selectByVisibleText("16");
		}
		public void MonthOfbirth()
		{
			Select select = new Select(MonthOfbirth);
			select.selectByVisibleText("Nov");
		}
		public void YearOfbirth ()
		{
			Select select = new Select(MonthOfbirth);
			select.selectByVisibleText("Nov");
		}
		
}
