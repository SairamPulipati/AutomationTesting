package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		ChromeDriver rv1=new ChromeDriver();
		rv1.manage().window().maximize();
       	rv1.navigate().to("http://127.0.0.1:81/login.do");
    	rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   rv1.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		    rv1.findElement(By.linkText("Reports")).click();
		   Select w=new Select(rv1.findElement(By.name("users")));
		   for(int i=0;i<=3;i++)
		   {
			   w.selectByIndex(i);
		   }
		   w.deselectAll();
		   for(int i=0;i<=3;i++)
		   {
			   if(i%2==0)
			   {
				  w.selectByIndex(i); 
			   }
		   }
         w.deselectAll();
         for(int i=0;i<=3;i++)
		   {
			   w.selectByIndex(i);
		   }
		   for(int i=3;i>=0;i--)
		   {
			  w.deselectByIndex(i);
		   }

	}

}
