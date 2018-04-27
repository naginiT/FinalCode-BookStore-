package Values;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.EditInspectElements;

public class ExcelCode {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static XSSFCell cell;
	
	public static void FileReading(String path, String value) throws Exception
	{
	 File f1=new File(path);
	 	FileInputStream fis=new FileInputStream(f1);
	 	workbook =new XSSFWorkbook(fis);
	 	sheet = workbook.getSheet(value); 	
}
	public static  String RowColumn(int row, int column) throws Exception {
		 cell =sheet.getRow(row).getCell(column);
		String a;
		if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
			long k =(long)cell.getNumericCellValue();
				 a=String.valueOf(k);
			            System.out.println(a);
			            Thread.sleep(5000);
					   }
		   else {
			    a=cell.getStringCellValue();
		     }
		return a;
			 
	}
	public static void FileWritinging(String path, String value) throws Exception
	{
	 File f1=new File(path);
	/* FileOutputStream fos= new FileOutputStream(f1);
     workbook.write(fos);
	 	sheet = workbook.getSheet(value);*/ 
	 	 FileOutputStream fos= new FileOutputStream(f1);
         workbook.write(fos);
}
	
	public static void RowColumn1(int row, int column) {
		System.out.println("row"+row);
		System.out.println("col"+column);
	  // you have placed getcell instead of create cell
		
		
		 sheet.getRow(row).createCell(column).setCellValue("pass");
		 
	}
	
	public static void RowColumn2(int row, int column) {
		 sheet.getRow(row).createCell(column).setCellValue("fail");
	}
	
	
}

