package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CustomUtility extends BaseClass {
	
	//Javascript utility to execute element click script.
	
	public void jsClick(WebElement element)
	{
		
		JavascriptExecutor executor =(JavascriptExecutor)getDriver();
		executor.executeScript("arguments[0].click();", element);
	}

}
