package OBB;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordpage {
	
	@FindBy(xpath="//a[contains(text(),'Name')]//..//..//..//tr[2]//td[2]//a")
	private WebElement searchuser;
	
	
	 
	public void ClickOnAddUsers()   {
		searchuser.click();
	} 


}
