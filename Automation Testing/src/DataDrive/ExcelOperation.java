package DataDrive;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation {
public static String ReadData(String Sheetname,int rownum,int Cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	FileInputStream fis=new FileInputStream("C://Testdata//Userdata.xlsx");
	Workbook w1 = WorkbookFactory.create(fis);
	String s1 = w1.getSheet(Sheetname).getRow(rownum).getCell(Cellnum).getStringCellValue();
	return s1;
}
public static void WriteData(String Sheetname,int rownum,int Cellnum,String Data) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	FileInputStream fis=new FileInputStream("C://Testdata//Userdata.xlsx");
	Workbook w1 = WorkbookFactory.create(fis);
   w1.getSheet(Sheetname).getRow(rownum).createCell(Cellnum).setCellValue(Data);
   FileOutputStream fos=new FileOutputStream("C://Testdata//Userdata.xlsx");
   w1.write(fos);
}
}
