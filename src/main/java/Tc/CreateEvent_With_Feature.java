package Tc;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

 
 import Gen.Baseclass1;
import OBB.EventInfopage;

 //@Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
 public class CreateEvent_With_Feature extends Baseclass1 {

	
	
	 @Test
     public void CMS_E2MTest_BulkUpload_TC05() throws Throwable  {
		 String eventname=flib.getexcelData("Event", 1, 0);
		 String shortname=flib.getexcelData("Event", 1, 1);
		 String fromTime=flib.getexcelData("Event", 1, 4);
		 String toTome=flib.getexcelData("Event", 1, 7);
		 String IntervalTime=flib.getexcelData("Event", 1, 8);
		 
		EventInfopage evm=PageFactory.initElements(driver, EventInfopage.class); 
		              evm.NavigateToEvent();
		 
	    EventInfopage ename=PageFactory.initElements(driver, EventInfopage.class); 
	                  ename.Fillform_Eventname(eventname);
	                  ename.Fillform_Shortname(shortname);	
	                  ename.NavigateCalenderBox();
	                  ename.Open_DatePickerbox();
	                  
	    EventInfopage tymbox=PageFactory.initElements(driver, EventInfopage.class);
	                  tymbox.SelectFromTimeBox();
		 
	    EventInfopage settime=PageFactory.initElements(driver, EventInfopage.class);
	                  settime.SetTime(fromTime);
		 
	    EventInfopage todate=PageFactory.initElements(driver, EventInfopage.class);
	                  todate.NavigateCalenderBoxTo();
	                  todate.Open_ToDatebox();
	                  
	    EventInfopage totime=PageFactory.initElements(driver, EventInfopage.class);
	                  totime.SetToTime(toTome);
		 
	    EventInfopage timezone=PageFactory.initElements(driver, EventInfopage.class); 
	                  timezone.SelectTimeZone();
	                  
	    EventInfopage dateformat=PageFactory.initElements(driver, EventInfopage.class); 
	                  dateformat.SelectDateFormat(); 
		 
	    EventInfopage intvaltym=PageFactory.initElements(driver, EventInfopage.class); 
	                  intvaltym.IntervalTime(IntervalTime);
		 
		 
		 
	 }
	 
}
