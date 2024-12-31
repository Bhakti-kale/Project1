package test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{
	int initialcount=0;
	int retrytimes=4;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(initialcount<retrytimes) 
		{
			initialcount++;
			return true;	//retry now
		}
		
		return false;		//don't retry
	}


}
