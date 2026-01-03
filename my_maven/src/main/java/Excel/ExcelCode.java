package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	//excel file - non primitive data type 
	public static FileInputStream f;
	// excel workbook
	public static XSSFWorkbook w;
	//excel sheet
	public static XSSFSheet s;
	public static String readStringData(int i, int j) throws IOException
	{
		// here we need to give path of the excel file.
		f= new FileInputStream( "");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r = s.getRow(i);
		XSSFCell c= r.getCell(j);
		return c.getStringCellValue();
	}
 public static double readIntegerData(int i,int j) throws IOException
 {
	 f= new FileInputStream( "");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r = s.getRow(i);
		XSSFCell c= r.getCell(j);
		return c.getNumericCellValue();
	 
 }
}
