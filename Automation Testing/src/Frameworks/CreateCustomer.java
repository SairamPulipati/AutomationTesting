package Frameworks;

import org.testng.annotations.Test;

public class CreateCustomer extends BaseClass {
@Test
public void testCreateCustomer()
{
	OpenTaskPage otp=new OpenTaskPage();
	otp.ClickOnProjectsAndCustomersLink();
	ActiveProjectsAndCustomersPage apacp=new ActiveProjectsAndCustomersPage();
	apacp.ClickOnAddNewCustomerButton();
	AddNewCustomerPage ancp=new AddNewCustomerPage();
	ancp.EnterCustomerName("PULI");
	ancp.ClickOnCreateButton();
	String s=apacp.RetrieveSuccessmessage();
	System.out.println(s);
	
}
}
