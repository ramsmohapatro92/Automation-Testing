package wrappers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class WDwrappers extends WDListner

{
	RemoteWebDriver driver;

	public static EventFiringWebDriver eventDriver;

	public WebElement locateElement(String locator, String val)
	{
		WebElement element=null;

		switch(locator)
		{
		case "Id":
			element=eventDriver.findElement(By.id(val));
			break;

		case "XPath":
			element=eventDriver.findElement(By.xpath(val));
			break;

		case "ClassName":
			element=eventDriver.findElement(By.className(val));
			break;

		case "LinkText":
			element=eventDriver.findElement(By.linkText(val));
			break;

		case "PartialLinkText":
			element=eventDriver.findElement(By.partialLinkText(val));
			break;

		case "Name":
			element=eventDriver.findElement(By.name(val));
			break;

		case "CssSelector":
			element=eventDriver.findElement(By.cssSelector(val));
			break;

		case "TagName":
			element=eventDriver.findElement(By.tagName(val));
			break;

		default:
			System.err.println("Invalid locator:Provide some useful locators");	
		}

		return element;

	}
	public void InputValues(WebElement element,String val)
	{
		element.clear();

		element.sendKeys(val);
	}
	public void click(WebElement element)
	{
		element.click();
	}
	public void SelectByVisibleText(WebElement element,String text)
	{
		Select dropdown=new Select(element);

		dropdown.selectByVisibleText(text);
	}
	public void SelectByIndex(WebElement element,int ID)
	{
		Select dropdown=new Select(element);

		dropdown.selectByIndex(ID);

	}
	public void SelectByValue(WebElement element,String value)
	{
		Select dropdown=new Select(element);

		dropdown.selectByValue(value);
	}
	public void SwitchToWindow(int WindowID)
	{
		Set<String>AllwindowHandles=driver.getWindowHandles();

		List<String>Allwindows=new ArrayList<String>();

		Allwindows.addAll(AllwindowHandles);

		driver.switchTo().window(Allwindows.get(WindowID));
	}
	public void AlertAccept()
	{
		driver.switchTo().alert().accept();
	}
	public void AlertDismiss()
	{
		driver.switchTo().alert().dismiss();
	}
	public void AlertSendText(String Text)
	{
		driver.switchTo().alert().sendKeys(Text);
	}
	public void AlertGettext(String Text)
	{
		driver.switchTo().alert().getText();
	}
	public void SwitchFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public boolean VerifyTitle(String Title)
	{
		String newTitle=driver.getTitle();

		if(newTitle.equals(Title))
		{
			System.out.println("Title Matched");
			return true;
		}
		else
		{
			System.err.println("Title Mismatch");
			return false;
		}
	
	}
	public void GetAttribute()
	{

	}
	public String GetText(WebElement element)
	{	
		String Text=element.getText();

		return Text;

	}
	public void VerifyText(WebElement element,String Text)
	{
		String newText=element.getText();

		if(newText.equals(Text))
		{
			System.out.println("Text Matched");
		}
		else
		{
			System.err.println("Text Mismatch");
		}
	}
	public void invokeApp(String Browser,String URL)
	{	switch (Browser)
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			break;

		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");	
			driver=new FirefoxDriver();
			break;

		case "InternetExplorer":
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;

		default:
			System.err.println("Invalid Browser name");	
		}

	eventDriver=new EventFiringWebDriver(driver);
	WDListner handler=new WDListner();
	eventDriver.register(handler);
	eventDriver.get(URL);
	eventDriver.manage().window().maximize();
	eventDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	}
	public void QuitApp()
	{
		driver.close();
	}

}































