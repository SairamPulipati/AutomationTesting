package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		ChromeDriver rv1=new ChromeDriver();
		rv1.manage().window().maximize();
		rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		rv1.get("http://www.gmail.com");
		rv1.findElement(By.xpath("//input[@type='email']")).sendKeys("sairampulipati1@gmail.com");
		rv1.findElement(By.id("identifierNext")).click();
	        rv1.findElement(By.name("password")).sendKeys("!Sairam19");
	    	    rv1.findElement(By.id("passwordNext")).click();
	        rv1.findElement(By.xpath("//div[@role='button']")).click();
	        rv1.findElement(By.linkText("Sign ot")).click();
	        rv1.close();
	}

}
