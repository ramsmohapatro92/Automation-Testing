package wrappers;

import java.util.jar.JarException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.ImeNotAvailableException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WDListner implements WebDriverEventListener 
{

	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void onException(Throwable exceptions, WebDriver driver) 
	{
		//Capturing the exception Message//
		String excpMsg=exceptions.getMessage(); 
		System.out.println(excpMsg);
		
		//split() method splits this string against given regular expression and returns a char array//
		String[] spltMsg=excpMsg.split(":"); 
		
		if(exceptions instanceof ElementNotVisibleException )
		{
			System.out.println(spltMsg[1]+"With the element"+spltMsg[3].split(",")[0]+"having value"+spltMsg[4]);
		}
		else if(exceptions instanceof ImeNotAvailableException)
		{
			System.out.println(spltMsg[1]+"With the element"+spltMsg[3].split(",")[0]+"having value"+spltMsg[4]);
		}
		else if(exceptions instanceof InvalidElementStateException)
		{
			System.out.println(spltMsg[1]+"With the Invalid element"+spltMsg[3].split(",")[0]+"having value"+spltMsg[4]);
		}
		else if(exceptions instanceof InvalidSelectorException)
		{
			System.out.println(spltMsg[1]+"With the Invalid Selector"+spltMsg[3].split(",")[0]+"having value"+spltMsg[4]);
		}
		else if(exceptions instanceof JarException)
		{
			System.out.println(spltMsg[1]+"With the instance of"+spltMsg[3].split(",")[0]+"having value"+spltMsg[4]);
		}
		else if(exceptions instanceof NoAlertPresentException)
		{
			System.out.println(spltMsg[1]+"With No Alert present"+spltMsg[3].split(",")[0]+"having value"+spltMsg[4]);
		}
		else if(exceptions instanceof NoSuchElementException)
		{
			System.out.println();
			System.out.println(spltMsg[1]+"With the element"+spltMsg[3].split(",")[0]+"having value"+spltMsg[4]);
		}
		else if(exceptions instanceof NoSuchWindowException)
		{
			System.out.println(spltMsg[1]+"With the Window"+spltMsg[3].split(",")[0]+"having value"+spltMsg[4]);
		}
		else if(exceptions instanceof TimeoutException)
		{
			System.out.println(spltMsg[1]+"With the Timeout"+spltMsg[3].split(",")[0]+"having value"+spltMsg[4]);
		}
		else if(exceptions instanceof UnhandledAlertException)
		{
			System.out.println(spltMsg[1]+"With the element"+spltMsg[3].split(",")[0]+"having value"+spltMsg[4]);
		}
	}

/*	@Override
	public void afterAlertAccept(WebDriver driver) 
	{
		
		System.out.println("After Alert Accepted");
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) 
	{
		System.out.println("After Alert Dismiss");
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] arg2) {
		System.out.println("After change value of"+element);
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("After click on");
		
	}

	@Override
	public void afterFindBy(By locator, WebElement element, WebDriver driver) {
		System.out.println("After Find by");
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("After Navigate Back");
		
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		System.out.println("After Navigate Forward");
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		System.out.println("After Navigate refresh");
		
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("After Navigate to");
		
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		System.out.println("After Script");
		
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver)
	{
		if(throwable instanceof NoSuchElementException )
		{
			System.out.println("the element could not be found"+throwable.getMessage());
		}
		else if(throwable instanceof InvalidSelectorException)
		{
			System.out.println("Invalid Selector used"+throwable.getMessage());
		}
		throw new RuntimeException();
	}*/
	
	
	
}
