package testCase_POM;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataProvider.ExcelDataProvider;
import pageFactory.LoginPage;
import wrappers.AnnotaionsTestNG;

public class TC001 extends AnnotaionsTestNG 
{
	@DataProvider(name="fetchdata")
	public Object[][]getdata() throws IOException
	{
		return ExcelDataProvider.dataProvider("TC001");
	}


	@Test(dataProvider="fetchdata")
	public void testCreateLead(String Username,String Password,String CompanyName,String FirstName,
			String LastName,String DataSource,String CampaignID,String eMailID)
	{
		new LoginPage()                  
		.enterUserName(Username)
		.enterPassword(Password)
		.clickLogin()
		.clickcrmsfa()
		.clickLead()
		.clickCreateLead()
		.enterCompanyName(CompanyName)
		.enterFirstName(FirstName)
		.enterLastName(LastName)
		.enterDataSource(DataSource)
		.enterCampaignID(CampaignID)
		.enterEmailID(eMailID)
		.clickCreateLead();

	}
}
