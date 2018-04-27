package Actions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.AddressInspectElements;
import Objects.BrowserCode;
import Objects.ReturnCustomer;
import Values.BrowserCodeValues;
import Values.ExcelCode;
public class ReturnCustomerActions  {
	

	    
	    static XSSFWorkbook work;
		static XSSFSheet sheet;
		static XSSFCell cell;
		 static int i;
		 static String s=null;
		 static String s5=null;
		public static void exeec11() throws Exception
		{
			
			Thread.sleep(5000);
			ExcelCode.FileReading("C:\\Users\\HP\\git\\BookStoreTask-_Finalcode\\BookStore\\External Files\\Bookstore11.xlsx", "sheet1");
		
		for(int j=1; j<=2;j++)
		{	
			ReturnCustomer.login().click();
			Thread.sleep(5000);
			String a1=  ExcelCode.RowColumn(j, 1);
			System.out.println("a1 "+a1);
			ReturnCustomer.uid11().sendKeys(a1);
			String a2=  ExcelCode.RowColumn(j, 2);
			Thread.sleep(5000);
			ReturnCustomer.password().sendKeys(a2);
		ReturnCustomer.login22().click();
		
			  s=BrowserCode.driver.getTitle();
			  System.out.println(s);
			  Thread.sleep(5000);
			  System.out.println(BrowserCodeValues.s2);
			   if(s.equalsIgnoreCase(BrowserCodeValues.s2)) {
				   System.out.println("1st if");
			  ExcelCode.RowColumn1(j, 3);
			  ExcelCode.FileWritinging("C:\\Users\\HP\\git\\BookStoreTask-_Finalcode\\BookStore\\External Files\\Bookstore11.xlsx", "sheet1");
		  }
			   else {
				   System.out.println("else condition");
					  ExcelCode.RowColumn2(j, 3);
					  ExcelCode.FileWritinging("C:\\Users\\HP\\git\\BookStoreTask-_Finalcode\\BookStore\\External Files\\Bookstore11.xlsx", "sheet1");
				  }  
			
			}
		

		}
		
		}

		
		

			





