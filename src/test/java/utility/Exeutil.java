package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exeutil {
	public static String getCellValue(String x, String sheet, int r, int c)
	 {
		try
		{
			FileInputStream f=new FileInputStream(x);
			XSSFWorkbook wb=new XSSFWorkbook(f); 
			XSSFCell cell=wb.getSheet(sheet).getRow(r).getCell(c);
			
			if(cell.getCellType()==CellType.STRING)
			{
				 return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
			}
		}
		catch(Exception e)
		{
			return "";
		}
	}
	 public static int getRowCount (String x, String Sheet) 
	 {
		 try
		 {
			 FileInputStream f=new FileInputStream(x);
		   		XSSFWorkbook wb=new XSSFWorkbook(f);
		   	 return wb.getSheet(Sheet).getLastRowNum();
		 }
		 catch(Exception e)
		 {
			 return 0;
		 }
		
  		
	 }


}
