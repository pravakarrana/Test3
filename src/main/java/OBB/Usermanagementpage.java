package OBB;

    
 
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
 

 import Gen.Baseclass1;

public class Usermanagementpage extends Baseclass1{
	//WebElement Locators
	@FindBy(xpath="//a[text()='Add']")
	private WebElement ClickAdduser;
	
	@FindBy(xpath="//input[contains(@id,'btnImport')]")
	private WebElement ClickImport;
	
	@FindBy(xpath="//input[contains(@name,'fileupload')]")
	private WebElement Clickuploadfile;
	
	@FindBy(xpath="//input[contains(@name,'fileupload1')]")
	private WebElement ClickuploadfileZip;
    
	@FindBy(xpath="//input[contains(@name,'fileupload')]")
	private WebElement upl;
	
	 
	
	
	
	
	//Utilization methods
 	public void ClickOnAddUsers()   {
		ClickAdduser.click();
	}	
	public void ClickOnImport() throws InterruptedException    {
		ClickImport.click();
		Thread.sleep(2000);
	}
	public void OnlyClickOnUpload() throws InterruptedException, Throwable    {
		Actions act=new Actions(driver);
 		act.moveToElement(Clickuploadfile).click().build().perform();	 
        Thread.sleep(2000);
		   StringSelection ss=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\ImportUser_Template - TC_05");
	       Toolkit tk=Toolkit.getDefaultToolkit();
	       Clipboard cb=tk.getSystemClipboard();
	       cb.setContents(ss, null);
	       
	       Robot robot=new Robot();
	       robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	       robot.keyPress(java.awt.event.KeyEvent.VK_V);
	       Thread.sleep(500);
	       
	       robot.keyRelease(java.awt.event.KeyEvent.VK_V);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
	       Thread.sleep(500);
      
	       robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	       Thread.sleep(3000);
	}
	public void OnlyClickOnUploadBLK() throws InterruptedException, Throwable    {
		Actions act=new Actions(driver);
 		act.moveToElement(Clickuploadfile).click().build().perform();	 
        Thread.sleep(2000);
		   StringSelection ss=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\ImportUser_Template - TC_09");
	       Toolkit tk=Toolkit.getDefaultToolkit();
	       Clipboard cb=tk.getSystemClipboard();
	       cb.setContents(ss, null);
	       
	       Robot robot=new Robot();
	       robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	       robot.keyPress(java.awt.event.KeyEvent.VK_V);
	       Thread.sleep(500);
	       
	       robot.keyRelease(java.awt.event.KeyEvent.VK_V);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
	       Thread.sleep(500);
      
	       robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	       Thread.sleep(3000);
	}	
	public void ClickOnUpload() throws InterruptedException, Throwable    {
		Actions act=new Actions(driver);
 		act.moveToElement(Clickuploadfile).click().build().perform();	 
        Thread.sleep(2000);
		   StringSelection ss=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\ImportUser_Template-TC_07");
	       Toolkit tk=Toolkit.getDefaultToolkit();
	       Clipboard cb=tk.getSystemClipboard();
	       cb.setContents(ss, null);
	       
	       Robot robot=new Robot();
	       robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	       robot.keyPress(java.awt.event.KeyEvent.VK_V);
	       Thread.sleep(500);
	       
	       robot.keyRelease(java.awt.event.KeyEvent.VK_V);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
	       Thread.sleep(500);
      
	       robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	       Thread.sleep(3000);
	}	
	public void ClickOnUploadZip() throws InterruptedException, Throwable    {
		Actions act=new Actions(driver);
 		act.moveToElement(ClickuploadfileZip).click().build().perform();	 
        Thread.sleep(2000);
		   StringSelection ss=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\Marvel-Transparent.zip");
	       Toolkit tk=Toolkit.getDefaultToolkit();
	       Clipboard cb=tk.getSystemClipboard();
	       cb.setContents(ss, null);
	       
	       Robot robot=new Robot();
	       robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	       robot.keyPress(java.awt.event.KeyEvent.VK_V);
	       Thread.sleep(500);
	       
	       robot.keyRelease(java.awt.event.KeyEvent.VK_V);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
	       Thread.sleep(500);
      
	       robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	       Thread.sleep(3000);
	}	
	 
 
	
	
	
}
