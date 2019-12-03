package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript3 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		ChromeDriver rv1=new ChromeDriver();
		rv1.manage().window().maximize();
	rv1.get("http://127.0.0.1:81/login.do");
		   rv1.findElement(By.name("username")).sendKeys("admin");
		   rv1.findElement(By.name("pwd")).sendKeys("manager");
		   rv1.findElement(By.xpath("//input[@valign='absmiddle']")).click();     
	      rv1.findElement(By.linkText("Projects & Customers")).click();
		   rv1.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		   rv1.findElement(By.xpath("//input[@name='name']")).sendKeys("saiRam");
		   rv1.findElement(By.xpath("//textarea[@name='description']")).sendKeys("sai is a loyal cutomer");
		   rv1.findElement(By.xpath("//input[@type='submit']")).click();
		   String s1=rv1.findElement(By.className("successmsg")).getText();
		   System.out.print(s1);
		   rv1.findElement(By.className("logoutImg")).click();
		   rv1.close();
	}

} 
