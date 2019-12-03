package Frameworks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage extends BaseClass {
	@FindBy(name="name")
	private WebElement CustomerNameTextField;
	@FindBy(name="createCustomerSubmit")
	private WebElement CreateCustomerButton;
	public AddNewCustomerPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
	}
	public void EnterCustomerName(String s)
	{
		CustomerNameTextField.sendKeys(s);
	}
	public void ClickOnCreateButton()
	{
		CreateCustomerButton.click();
	}
}
