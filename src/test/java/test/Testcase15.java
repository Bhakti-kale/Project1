//15.reach till cart page without login in amazon application---add to cart not working
package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.HomePage;
import source.Product1Page;
import source.ShoppingCart;
@Listeners(Listner_logic.class)
public class Testcase15 extends LaunchQuit 
{
	@Test(retryAnalyzer=test.RetryLogic.class)
	public void cart_without_login() throws InterruptedException
	{
	HomePage home=new HomePage(driver);
	home.searching();
	Product1Page prodpage=new Product1Page(driver);
	prodpage.product(driver);
	Thread.sleep(5000);
	prodpage.addtocart();
	ShoppingCart shop=new ShoppingCart(driver);
	shop.gotocart();
}
}