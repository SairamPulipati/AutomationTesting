package Delete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Frameworks.BaseClass;

public class OpenTaskPage extends BaseClass {
@FindBy(linkText="Projects & Customers")
private WebElement ProjetsAndCustomersLink;
public OpenTaskPage()
{
	PageFactory.initElements(BaseClass.driver,this);
}
public void ClickOnProjectsAndCustomers()
{
	ProjetsAndCustomersLink.click();
}
	
}
