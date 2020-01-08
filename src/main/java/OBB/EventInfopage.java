package OBB;

import java.awt.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

 import Gen.Baseclass1;
import net.sourceforge.htmlunit.corejs.javascript.commonjs.module.provider.ParsedContentType;
 
public class EventInfopage extends Baseclass1{

	//WEBELEMENT LOCATORS
 	@FindBy(xpath="//a[text()='New Event']")
	private WebElement ClickEvent;
	
	@FindBy(xpath="//input[contains(@title,'Enter event full name')]")
	private WebElement EventFullName;
	
	@FindBy(xpath="//input[contains(@title,'Enter event short name')]")
	private WebElement EventShortName;
	
	@FindBy(xpath="//input[contains(@class,'date-input hasDatepicker')]")
	private  WebElement fromclickdatebox;
	
	@FindBy(xpath="//input[contains(@name,'txtToDate')]")
	private  WebElement Toclickdatebox;
	
	@FindBy(xpath="//div[@class='ui-datepicker-title']//span")
	private WebElement FromMonthYear;
	
	@FindBy(xpath="//div[contains(@id,'ui-datepicker-div')]//div//div//span[1]")
	private WebElement ToMonthYear;
	
	@FindBy(xpath="//input[contains(@id,'txtFromTime')]")
	private WebElement clicktimebox;
	
	@FindBy(xpath="//input[contains(@id,'txtToTime')]")
	private WebElement clickTotimebox;
	 
	@FindBy(xpath="//input[contains(@id,'txtFromTime')]//..//..//div[4]//div//ul//li")
	private WebElement FromTime;
	 
	@FindBy(xpath="//div[@class='ui-datepicker-title']//span")
	private WebElement ToTime;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement ClickNextOnCalender;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[contains(text(),'31')]")
	private WebElement ClickCurrentDate;
	
	@FindBy(xpath="//select[contains(@id,'ddlTimeZone')]")
	private WebElement Eventtimezone;
	
	@FindBy(xpath="//select[contains(@id,'ddlDateFormat')]")
	private WebElement dateformat;
	
	@FindBy(xpath="//input[contains(@id,'txtBannerInterval')]")
	private WebElement intervaltime;
	
	//METHODS OR FUNCTIONS
	
	
	public void NavigateToEvent() throws InterruptedException   {
		ClickEvent.click();
		Thread.sleep(2000);
	}	
	public void Fillform_Eventname(String eventfullname)   { 
		EventFullName.sendKeys(eventfullname);
	}
	public void Fillform_Shortname(String eventshortname)   { 
		EventShortName.sendKeys(eventshortname);
	}
	public void NavigateCalenderBox()   { 
		fromclickdatebox.click();
	}
	public void NavigateCalenderBoxTo()   { 
		Toclickdatebox.click();
	}
	public void Open_DatePickerbox() throws Throwable   { 
	 	String month=flib.getexcelData("Event", 1, 2);
	 	String Date=flib.getexcelData("Event", 1, 3);
 	 while(true) {
 	   if(FromMonthYear.getText().equals(month)) {
 		 break;
 	   }
 	   else
 	   {
 		 ClickNextOnCalender.click();
 		 Thread.sleep(1000);
 		   }
 	   }
  	    driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[contains(text(),'"+Date+"')]")).click();   
	}
	public void SelectFromTimeBox() throws InterruptedException   { 		 
		clicktimebox.click();		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);	 
	}
	public void SetTime(String tym) { 		
		clicktimebox.sendKeys(tym);
	}
	public void Open_ToDatebox() throws Throwable   { 
		String month=flib.getexcelData("Event", 1, 5);
	 	String Date=flib.getexcelData("Event", 1, 6);	   
	 while(true){
	 if(FromMonthYear.getText().equals(month)) {
	 	break;
     }
	 else 
	 {
	   ClickNextOnCalender.click();
	   Thread.sleep(1000);
	 }
   }
	 driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[contains(text(),'"+Date+"')]")).click();   
   }
	public void SelectToTimeBox() throws InterruptedException   { 	 
		clickTotimebox.click();		 
		Thread.sleep(1000);	 
	}
	public void SetToTime(String tym)       { 		
		clickTotimebox.sendKeys(tym);
	}
	public void SelectTimeZone()       { 		
		Select sel=new Select(Eventtimezone);
		       sel.selectByVisibleText("(UTC+05:30) Chennai, Kolkata, Mumbai, New Delhi");
	}
	public void SelectDateFormat()       { 		
		Select sel=new Select(dateformat);
		       sel.selectByVisibleText("dd MMM yyyy (eg. 02 Dec 2016)");
	}
	public void IntervalTime(String interval)       { 		
		intervaltime.sendKeys(interval);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 }
