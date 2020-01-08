package OBB;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

 import Gen.Baseclass1;

public class UsersPage extends Baseclass1 {
	
	//WEBELEMENT LOCATORS
	 
	@FindBy(xpath="//input[contains(@id,'FirstName')]")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[contains(@id,'LastName')]")
	private WebElement LastName;
	
	@FindBy(xpath="//input[contains(@id,'txtEmail')]")
	private WebElement EmailId;
	
	@FindBy(xpath="//input[contains(@name,'Position')]")
	private WebElement Position;
	
	@FindBy(xpath="//input[contains(@name,'Organization')]")
	private WebElement Organisation;
	 
	@FindBy(xpath="//input[contains(@name,'Save')]")
 	private WebElement save_user_ManualUser;
	 
	@FindBy(xpath="//input[contains(@name,'ContentPlaceHolder1$txtUserName')]")
	private WebElement checkuser;
	 
	@FindBy(xpath="//a[contains(text(),'Name')]//..//..//..//tr[2]//td[2]//a")
	private WebElement searchuser;
	
	@FindBy(xpath="//input[@value='Save']")
 	private WebElement save_user_BulkUpload;	

	@FindBy(xpath="//div[contains(text(),'Uploaded Successfully.')]")
 	private WebElement sucess_msg;
	
	@FindBy(xpath="//input[contains(@id,'btnBack')]")
	private WebElement BackToUser;
	
	@FindBy(xpath="//img[contains(@id,'imgUserImage')]")
	private WebElement VarifyImg;


	
	//METHODS OR FUNCTIONS
	 
	  
	public void Fillformfirstname(String fistname)   { 
		FirstName.sendKeys(fistname);
	}	
    public void Fillformlastname(String lastname)   { 
    	LastName.sendKeys(lastname);
    }		
    public void Fillformemail(String email)   { 
    	EmailId.sendKeys(email);	 
	}
    public void FillformPosition(String email)   { 
    	Position.sendKeys(email);	 
	}
    public void FillformOrganisation(String email)   { 
    	Organisation.sendKeys(email);	 
	}
    public void ClickOnSave()   {
    	save_user_ManualUser.click();
	} 
    public void NavigateToCheckOnUser(String user)   {
    	checkuser.sendKeys(user);
    	checkuser.sendKeys(Keys.ENTER);
	}
    public void varifyuser() throws InterruptedException   {
    	boolean element=searchuser.isDisplayed();
     	Assert.assertEquals(true, element);
       	Reporter.log(element + " User varified sucessfully");
       	//Thread.sleep(5000);
	}
    public void ClickOnUser()   {
    	WebDriverWait waitforelement=new WebDriverWait(driver, 20);
    	waitforelement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Name')]//..//..//..//tr[2]//td[2]//a")));
    	searchuser.click();
	} 
    public void ClickOnSaveBulkupload() throws Throwable   {
    	save_user_BulkUpload.click();
    	Thread.sleep(3000);
	} 
    public void verifymsg() throws Throwable   { 
       String actualmsg=sucess_msg.getText();
       System.out.println("Bulk " + actualmsg + "In CMS");
       Thread.sleep(2000);
       String Expectedmsg="Uploaded Successfully.";        
       Assert.assertEquals(actualmsg, Expectedmsg);          
 	}
    public void NaviagteBack()   {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Uploaded Successfully.')]")));
		BackToUser.click();
	}
    public void VarifyImage()   {
    	boolean img=VarifyImg.isDisplayed();
    	Assert.assertEquals(true, img);
    	Reporter.log(img + " Image Varified Sucessfully");
	} 

	public void Verifyfirstname() throws Throwable   { 
		String Expected=FirstName.getAttribute("value");
		String actual=flib.getexcelData("Read", 8, 1);
        Boolean IsText=actual.equals(Expected);
        Assert.assertTrue(IsText.TRUE);  		  
 	}
	
    public void verifylastname() throws Throwable   { 
    	String Expectedlastname=LastName.getAttribute("value");
    	String actuallastname=flib.getexcelData("Read", 8, 2);
        Boolean IsTextName=actuallastname.equals(Expectedlastname);
        Assert.assertTrue(IsTextName.TRUE);  		  
    }	
    
//  public void Fillformemail(String email)   { 
//      EmailIdVerify.sendKeys(email);
//      String actualname=EmailIdVerify.getAttribute("value");
//      Boolean IsTextEmail=actualname.equals(email);
//      Assert.assertTrue(IsTextEmail.TRUE);
//	}
    
    public void VerifyPosition() throws Throwable   { 
    	String Expectedposition=Position.getAttribute("value");
    	String actualposition=flib.getexcelData("Read", 8, 4);
        Boolean IsTextPosition=actualposition.equals(Expectedposition);
        Assert.assertTrue(IsTextPosition.TRUE);
	}
    
    public void VerifyOrganisation() throws Throwable   { 
    	String actualOrganisation=Organisation.getAttribute("value");
    	String ExpectedOrganisation=flib.getexcelData("Read", 8, 5);
        Boolean IsTextorganisation=actualOrganisation.equals(ExpectedOrganisation);
        Assert.assertTrue(IsTextorganisation.TRUE);
	}
    
    public void VerifyBLKfirstname() throws Throwable   { 
		String ExpectedBLKfstname=FirstName.getAttribute("value");
		String actualBLKfstname=flib.getexcelData("Read", 9, 1);
        Boolean IsText=actualBLKfstname.equals(ExpectedBLKfstname);
        Assert.assertTrue(IsText.TRUE);  		  
 	}
	
    public void verifyBLKlastname() throws Throwable   { 
    	String ExpectedBLKlastname=LastName.getAttribute("value");
    	String actualBLKlastname=flib.getexcelData("Read", 9, 2);
        Boolean IsTextName=actualBLKlastname.equals(ExpectedBLKlastname);
        Assert.assertTrue(IsTextName.TRUE);  		  
    }	
    
    public void VerifyBLKPosition() throws Throwable   { 
    	String ExpectedBLKposition=Position.getAttribute("value");
    	String actualBLKposition=flib.getexcelData("Read", 8, 4);
        Boolean IsTextPosition=actualBLKposition.equals(ExpectedBLKposition);
        Assert.assertTrue(IsTextPosition.TRUE);
	}
    
    public void VerifyBLKOrganisation() throws Throwable   { 
    	String actualBLKOrganisation=Organisation.getAttribute("value");
    	String ExpectedBLKOrganisation=flib.getexcelData("Read", 8, 5);
        Boolean IsTextorganisation=actualBLKOrganisation.equals(ExpectedBLKOrganisation);
        Assert.assertTrue(IsTextorganisation.TRUE);
	}
    
}
