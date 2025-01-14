//1.Test if a user can successfully register
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import source.Excel_data;
import source.HomePage;
import source.LoginPage;
import source.RegistrationPage;
@Listeners(Listner_logic.class)
public class Testcase1 extends LaunchQuit
{
	
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void register_to_amazon() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		Excel_data ed=new Excel_data();
		ed.datafetching();
	
		HomePage home=new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.starthere_meth();
		
		
		
		RegistrationPage reg=new RegistrationPage(driver);
        reg.name_meth();
        reg.mobno_meth();
        reg.pass_meth();
        reg.verifymob_meth();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      // reg.verifyCode();
//       String txt1= reg.getmsg();
//       Assert.assertEquals(true, txt1.contains("User can register."), "assertion fail");
//        
//     
       
      
        //Thread.sleep(10000);
//      reg.otp_meth();
//      Thread.sleep(10000);
//      reg.createacc_meth();
//		Thread.sleep(10000);
		
		
	}
}

