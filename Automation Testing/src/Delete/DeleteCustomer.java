package Delete;

import org.testng.annotations.Test;

import Frameworks.BaseClass;

public class DeleteCustomer extends BaseClass{
	@Test
	public void testDeleteCustomer()
	{
		OpenTaskPage otp=new OpenTaskPage();
		otp.ClickOnProjectsAndCustomers();
		ActiveProjectsAndCustomersPage  apac=new ActiveProjectsAndCustomersPage();
		apac.SelectCustomer();
		ProjectsAndTasks pat=new ProjectsAndTasks();
		pat.DeleteCustomer();
		String s=apac.RetrieveMessage();
		System.out.print(s);
		
	}	
}
