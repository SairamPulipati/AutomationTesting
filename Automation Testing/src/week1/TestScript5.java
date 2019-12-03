package week1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		ChromeDriver rv1=new ChromeDriver();
		rv1.manage().window().maximize();
		rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       	rv1.get("http://127.0.0.1:81/login.do");
		   rv1.findElement(By.name("username")).sendKeys("admin");
		   rv1.findElement(By.name("pwd")).sendKeys("manager");
		   rv1.findElement(By.xpath("//input[@valign='absmiddle']")).click();     
		   rv1.findElement(By.linkText("Projects & Customers")).click();
	       System.out.println(rv1.findElement(By.xpath("//input[@value='Archive Selected Customers & Projects']")).getAttribute("value")); 
	       WebElement d=rv1.findElement(By.name("selectedCustomer"));
	  Select s1=new Select(d);
	  s1.selectByVisibleText("sai");
	  List<WebElement> a=s1.getOptions();
	  String D1=a.get(1).getText();
	  System.out.println(D1);
	  
	
	  
	   
	}

}
