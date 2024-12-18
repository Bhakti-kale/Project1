//1.Test if a user can successfully register
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import source.HomePage;
import source.LoginPage;
import source.RegistrationPage;

public class Testcase1 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void login_to_amazon() throws InterruptedException, EncryptedDocumentException, IOException 
	{
	
		HomePage home=new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.starthere_meth();
		RegistrationPage reg=new RegistrationPage(driver);
        reg.name_meth();
        reg.mobno_meth();
        reg.pass_meth();
        reg.verifymob_meth();
        Thread.sleep(10000);
//        reg.otp_meth();
//        Thread.sleep(10000);
//       reg.createacc_meth();
//		Thread.sleep(10000);
		
		
	}
}

