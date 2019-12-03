package Delete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Frameworks.BaseClass;

public class ProjectsAndTasks extends BaseClass {
@FindBy(xpath="//input[@value='Delete This Customer']")
private WebElement DeleteCustomerButton;
public ProjectsAndTasks()
{
	PageFactory.initElements(BaseClass.driver,this);
}
public void DeleteCustomer()
{
	DeleteCustomerButton.click();
	driver.switchTo().alert().accept();
}
}
