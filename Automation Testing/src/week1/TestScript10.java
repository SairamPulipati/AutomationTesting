package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		ChromeDriver rv1=new ChromeDriver();
		rv1.manage().window().maximize();
       	rv1.get("http://127.0.0.1:81/login.do");
    	rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   rv1.findElement(By.name("username")).sendKeys("admin");
		   rv1.findElement(By.name("pwd")).sendKeys("manager");
		   rv1.findElement(By.xpath("//input[@valign='absmiddle']")).click(); 
		   rv1.findElement(By.linkText("Projects & Customers")).click();
		   rv1.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		   rv1.findElement(By.xpath("//input[@name='name']")).sendKeys("shiva");
		   rv1.findElement(By.xpath("//textarea[@name='description']")).sendKeys("shiva is a loyal cutomer");
		   rv1.findElement(By.linkText("Archives")).click();
		  System.out.println(rv1.findElement(By.xpath("//input[@value='Cancel Customer Creation and Proceed']")).getAttribute("value"));
		  System.out.println(rv1.findElement(By.xpath("//input[@value='Remain on the Page']")).getAttribute("value"));
		  rv1.findElement(By.xpath("//input[@value='Cancel Customer Creation and Proceed']")).click();
		   rv1.findElement(By.className("logoutImg")).click();
		   rv1.close(); 
	}

}
