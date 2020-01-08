package OBB;

 import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

 
public class LoginPage  {
	
 	
	@FindBy(xpath="//input[@id='txtLogin']")
	private WebElement user_name;
	
	@FindBy(xpath="//div[@class='fullwidth btn-login-hld']/a[@id='btnProceed']")
	private WebElement proceed;
	
	@FindBy(xpath="//input[@id='txtPass']")
	private WebElement pass_word;
	
	@FindBy(xpath="//input[@value='Sign in']")
	private WebElement submit;
	
	
	
	
	
	public void EnterUsername(String username){
		user_name.sendKeys(username);
	}
	
	public void clickOnProceed()   {
		proceed.click();
	}
	
	public void EnterPassword(String password){
		pass_word.sendKeys(password);
	 
	}
	
	public void clickOnSubmit()   {
		submit.click();
	}
	
	
    

}
