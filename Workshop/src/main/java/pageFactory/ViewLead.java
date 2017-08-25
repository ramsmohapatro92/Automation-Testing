package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pageFactory.DeleteLeadPage;
import pageFactory.EditLeadPage;

public class ViewLead extends AbstractPage
{
	public ViewLead()
	{
		PageFactory.initElements(eventDriver, this);
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")WebElement Delete;
	@FindBy(how=How.LINK_TEXT,using="Edit")WebElement Edit;

	 public void viewLeaddetails()
	 {
		 
	 }
	
	public DeleteLeadPage clickDeleteLead()
	{
		click(Delete);
		return new DeleteLeadPage();
	}
	public EditLeadPage clickEditLead()
	{
		click(Edit);
		return new EditLeadPage();
	}
}
