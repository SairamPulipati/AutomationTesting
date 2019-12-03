package Frameworks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsAndCustomersPage extends BaseClass {
@FindBy(xpath="//input[@value='Add New Customer']")
private WebElement AddNewCustomerButton;
@FindBy(className="successmsg")
private WebElement Successmessage;
public  ActiveProjectsAndCustomersPage()
{
	PageFactory.initElements(BaseClass.driver,this);
}
public void ClickOnAddNewCustomerButton()
{ 
	AddNewCustomerButton.click();
}
public String RetrieveSuccessmessage()
{
	return Successmessage.getText();
}
}
