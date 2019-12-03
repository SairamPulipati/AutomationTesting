package week1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TetScript11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		ChromeDriver rv1=new ChromeDriver();
		rv1.manage().window().maximize();
       	rv1.navigate().to("http://127.0.0.1:81/login.do");
    	rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   rv1.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		    rv1.findElement(By.linkText("Reports")).click();
		    rv1.findElement(By.xpath("//img[@alt='Click Here to Pick up the date']")).click();
		    String cur=rv1.getWindowHandle();
		    System.out.println(cur);
		    Set<String> s1=rv1.getWindowHandles();
		    for(String s:s1)
		    {
		    	if(!s.equals(cur))
		    	{
		    		rv1.switchTo().window(s);
		    		System.out.println(s);
		    		break;
		    	}
		    }
		    rv1.manage().window().maximize();
		    rv1.findElement(By.className("calendarCurrentMonthWorkingDay")).click();
		    rv1.switchTo().window(cur);
		    rv1.findElement(By.xpath("//img[@alt='Logout']")).click();
	}

}
