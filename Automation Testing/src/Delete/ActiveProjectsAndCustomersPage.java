package Delete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Frameworks.BaseClass;

public class ActiveProjectsAndCustomersPage {
@FindBy(className="successmsg")
private WebElement SuccessMessage;
@FindBy(linkText="kalyan")
private WebElement CustomerLink;
public ActiveProjectsAndCustomersPage()
{
	PageFactory.initElements(BaseClass.driver,this);
}
public void SelectCustomer()
{
	CustomerLink.click();
}
public String RetrieveMessage()
{
	return SuccessMessage.getText();

	}
}
