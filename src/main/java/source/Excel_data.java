package source;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Excel_data 
{
	static String fullnamevalue;
	static String mobilenumbervalue;
	static String passwordvalue;
	static String name;
	static String pass;
	static String name2;
	static String pass2;
	
	public void datafetching() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream file1 = new FileInputStream("C:\\Users\\Bhakti\\eclipse-workspace\\Project1\\ExcelSheet\\Credentials.xlsx");
		Workbook w1 = WorkbookFactory.create(file1);
		
			fullnamevalue = w1.getSheet("register").getRow(0).getCell(0).getStringCellValue();
			mobilenumbervalue = NumberToTextConverter.toText(w1.getSheet("register").getRow(0).getCell(1).getNumericCellValue());
			passwordvalue = w1.getSheet("register").getRow(0).getCell(2).getStringCellValue();
			Thread.sleep(2000);
			//for tc2
			name = NumberToTextConverter.toText(w1.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
			pass = w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
			Thread.sleep(1000);
			//for tc3
			name2 = NumberToTextConverter.toText(w1.getSheet("login").getRow(2).getCell(0).getNumericCellValue());
			pass2 = w1.getSheet("login").getRow(2).getCell(1).getStringCellValue();
			
			
			
			
	}

}
