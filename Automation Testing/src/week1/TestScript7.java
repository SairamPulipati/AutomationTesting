package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript7 {

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
		   rv1.findElement(By.linkText("Reports")).click();
		   Select w=new Select(rv1.findElement(By.name("users")));
		   w.selectByIndex(0);
		   w.selectByIndex(1);
		   w.selectByIndex(2);
		   w.deselectByIndex(1);
		   w.deselectByIndex(2);

		   
	}

}
