package OBB;

import java.util.Base64;
import java.util.Base64.Encoder;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import net.sourceforge.htmlunit.corejs.classfile.ByteCode;

public class VerifyEncryptedFormatpage {
	@FindBy(xpath="//input[contains(@id,'FirstName')]")
	private WebElement FirstNameVerify;
	
	@FindBy(xpath="//input[contains(@id,'LastName')]")
	private WebElement LastNameVerify;
	
	@FindBy(xpath="//input[contains(@id,'txtEmail')]")
	private WebElement EmailIdVerify;
	
	@FindBy(xpath="//input[contains(@name,'Position')]")
	private WebElement PositionVerify;
	
	@FindBy(xpath="//input[contains(@name,'Organization')]")
	private WebElement OrganisationVerify;
	
	
	
	
	
	
	public void Fillformfirstname(String fistname)   { 
		 FirstNameVerify.sendKeys(fistname);
//		 String actualname=FirstNameVerify.getAttribute("value");
//         Boolean IsText=actualname.equals(fistname);
//         Assert.assertTrue(IsText.TRUE);
   		  
 	}	
    public void Fillformlastname(String lastname)   { 
    	LastNameVerify.sendKeys(lastname);
//    	 String actualname=LastNameVerify.getAttribute("value");
//         Boolean IsTextName=actualname.equals(lastname);
//         Assert.assertTrue(IsTextName.TRUE);
//   		  
    }		
    public void Fillformemail(String email)   { 
    	EmailIdVerify.sendKeys(email);
//    	 String actualname=EmailIdVerify.getAttribute("value");
//         Boolean IsTextEmail=actualname.equals(email);
//         Assert.assertTrue(IsTextEmail.TRUE);
	}
    public void FillformPosition(String Position)   { 
    	PositionVerify.sendKeys(Position);	
//    	 String actualname=PositionVerify.getAttribute("value");
//         Boolean IsTextPosition=actualname.equals(Position);
//         Assert.assertTrue(IsTextPosition.TRUE);
	}
    public void FillformOrganisation(String Organisation)   { 
    	OrganisationVerify.sendKeys(Organisation);
//    	String actualname=OrganisationVerify.getAttribute("value");
//        Boolean IsTextorganisation=actualname.equals(Organisation);
//        Assert.assertTrue(IsTextorganisation.TRUE);
	}
}
