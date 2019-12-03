package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		ChromeDriver rv1=new ChromeDriver();
		rv1.manage().window().maximize();
	rv1.get("http://127.0.0.1:81/login.do");
		   rv1.findElement(By.name("username")).sendKeys("admin");
		   rv1.findElement(By.name("pwd")).sendKeys("manager");
		   rv1.findElement(By.xpath("//input[@valign='absmiddle']")).click();     
	      rv1.findElement(By.linkText("Users")).click();
	      rv1.findElement(By.xpath("//input[@type='button']")).click();
	      rv1.findElement(By.xpath("//input[@name='username']")).sendKeys("Sairam Pulipati");
	      rv1.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("Sairam1");
	      rv1.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("Sairam1");
	      rv1.findElement(By.xpath("//option[@value='true']")).click();
	      rv1.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Sai");
	      rv1.findElement(By.xpath("//input[@name='middleName']")).sendKeys("ram");
	      rv1.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Pulipati");
	      rv1.findElement(By.xpath("//input[@name='phone']")).sendKeys("+91 8497915842");
	      rv1.findElement(By.xpath("//input[@name='mobile']")).sendKeys("+91 8497915842");
	      rv1.findElement(By.xpath("//input[@name='email']")).sendKeys("psairam108@gmail.com");
	      rv1.findElement(By.xpath("//input[@name='otherContact']")).sendKeys("+91 8008464458");
	      rv1.findElement(By.xpath("//input[@name='fax']")).sendKeys("srk");
	      rv1.findElement(By.xpath("//input[@type='submit']")).click();
	      String s1=rv1.findElement(By.className("successmsg")).getText();
		   System.out.print(s1);
		   rv1.findElement(By.className("logoutImg")).click();
		   rv1.close();
	      
	      
	      
	      
	      
	      
	}

}
