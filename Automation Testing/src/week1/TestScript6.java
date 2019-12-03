package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		ChromeDriver rv1=new ChromeDriver();
		rv1.manage().window().maximize();
       	rv1.navigate().to("http://127.0.0.1:81/login.do");
    	rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   rv1.findElement(By.name("username")).sendKeys("admin");
		   rv1.findElement(By.name("pwd")).sendKeys("manager");
		   rv1.findElement(By.xpath("//input[@valign='absmiddle']")).click();     
		   rv1.findElement(By.linkText("Projects & Customers")).click();
		   rv1.findElement(By.xpath("//input[@value='Add New Project']")).click();
		   WebElement d=rv1.findElement(By.name("customerId"));
		   Select s1=new Select(d);
			  s1.selectByVisibleText("sai");
			  rv1.findElement(By.xpath("//input[@name='name']")).sendKeys("WIFI Bins");
			  rv1.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Access WIFI From bins");
			  rv1.findElement(By.xpath("//input[@name='createProjectSubmit']")).click();
			 System.out.print(rv1.findElement(By.className("successmsg")).getText());
			 rv1.findElement(By.className("logoutImg")).click();
			   rv1.close();
	      

	}

}
