package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript9 {

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
		   rv1.findElement(By.linkText("Ram")).click();  
		   rv1.findElement(By.xpath("//input[@value='Archive This Customer']")).click();
		   System.out.println(rv1.switchTo().alert().getText());
		   rv1.switchTo().alert().accept();
		   System.out.println(rv1.findElement(By.className("successmsg")).getText());
		
	}

}
