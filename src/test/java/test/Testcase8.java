//check if the product can be sorted by relevance,price,rating etc 
package test;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import source.HomePage;
import source.LoginPage;
import source.Product1Page;

public class Testcase8 extends LaunchQuit
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void sort_product() throws InterruptedException, EncryptedDocumentException, IOException
	{
		HomePage home=new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();
		LoginPage login=new LoginPage(driver);
		login.un();
		login.signin();
    	//sThread.sleep(10000);
		home.searching();
		home.sortby_meth();
		

}
}
