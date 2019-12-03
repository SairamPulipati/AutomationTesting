package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		ChromeDriver rv1=new ChromeDriver();
		rv1.get("file:///C:/Users/saira/OneDrive/Documents/Sample.html");
		rv1.manage().window().maximize();
		rv1.findElement(By.id("un")).sendKeys("admin");
		rv1.findElement(By.name("psd")).sendKeys("pass");
		rv1.findElement(By.id("c1")).click();
		rv1.findElement(By.id("c2")).click();
		rv1.findElement(By.id("c3")).click();
		rv1.findElement(By.className("male")).click();
		rv1.findElement(By.linkText("Actitime")).click();
		 rv1.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		rv1.navigate().back();
		rv1.navigate().forward();
		rv1.navigate().refresh();
	}

}
