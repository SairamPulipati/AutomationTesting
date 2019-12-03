package DataDrive;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginLogout {
	@Test
public void testLoginLogout() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	String url = ExcelOperation.ReadData("Sheet1", 1, 0);
	String un=ExcelOperation.ReadData("Sheet1", 1, 1);
	String pwd=ExcelOperation.ReadData("Sheet1", 1, 2);
	String Exp=ExcelOperation.ReadData("Sheet1", 1, 3);
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	ChromeDriver rv1=new ChromeDriver();
	rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	rv1.manage().window().maximize();
	rv1.get(url);
	rv1.findElement(By.name("username")).sendKeys(un);
	rv1.findElement(By.name("pwd")).sendKeys(pwd);
	rv1.findElement(By.xpath("//input[@valign='absmiddle']")).click();     
	String act=rv1.getTitle();
	ExcelOperation.WriteData("Sheet1",1, 4, act);
    if(Exp.equals(act))	
    {
     ExcelOperation.WriteData("Sheet1", 1,5, "pass");	
    }
    else
    {
    	ExcelOperation.WriteData("Sheet1", 1,5, "Fail");		
    }
}
}
