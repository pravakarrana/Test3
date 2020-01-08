package OBB;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Eventmanagementpage {
	
	@FindBy(xpath="//a[@class='toggle-menu']")
	private WebElement Menu;
	
	@FindBy(xpath="//a[@class='menu-item has-submneu']")
	private WebElement ClickEvntmngmt;
	 
	@FindBy(xpath="//a[@class='ChangeArrow menu-hidden-arrow']")
	private WebElement ClickUsers;
	
	
	
	
	 
	public void ClickOnMenu()   {
		 Menu.click();
	}
	public void ClickOnEventManagement()   {
		 ClickEvntmngmt.click();
		 ClickUsers.click();	 
	}
	
	
	
	
	
	

}
