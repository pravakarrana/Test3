package Tc;

 

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

 
import Gen.Baseclass1;
import OBB.Eventmanagementpage;
import OBB.Usermanagementpage;
import OBB.UsersPage;

   // @Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
    public class AddUser_Bulk_UploadTest extends Baseclass1 {
	
	
	 @Test
     public void CMS_E2MTest_BulkUpload_TC05() throws Throwable  {
	
	
		 OBB.Eventmanagementpage EMP=PageFactory.initElements(driver, Eventmanagementpage.class);
                             EMP.ClickOnMenu();
                             
         OBB.Eventmanagementpage Emp_User=PageFactory.initElements(driver, Eventmanagementpage.class);
                             Emp_User.ClickOnEventManagement(); 
                             
	     Usermanagementpage imp=PageFactory.initElements(driver, Usermanagementpage.class);
	                        imp.ClickOnImport();
	                        
	     Usermanagementpage uplod=PageFactory.initElements(driver, Usermanagementpage.class);
	                        uplod.OnlyClickOnUpload();
         UsersPage sv=PageFactory.initElements(driver, UsersPage.class);
                   sv.ClickOnSaveBulkupload();
                   
	     //Verify the successfully message
         
          UsersPage msg=PageFactory.initElements(driver, UsersPage.class);
                    msg.verifymsg();
            
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
}
}
