package Actions;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.AddressInspectElements;
import Objects.BrowserCode;
import Objects.EditInspectElements;
import Objects.ReturnCustomer;
import Values.ExcelCode;
import Actions.ReturnCustomerActions;
/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Modify your address book entries Tab
 * Verifying Back Button
 * Verifying Edit Button
 * Verifying Delete Button
 * Verifying Continue Button
 * Verifying NewAddress Button
* Author Sharmila
* verifying login Tab with Excel
*/
//updat
public class AddressActions {
 
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell cell;
	static  String s=null;
	static  String s1=null;
	public static void edit() throws Exception{
		//login credintials read from excel
		ReturnCustomerActions.exeec11();
		     AddressInspectElements.address().click();
		     AddressInspectElements.back1().click(); //clicking on back button
		     AddressInspectElements.address().click();
		     Thread.sleep(5000);
		     AddressInspectElements.delete().click();
		Thread.sleep(5000);
		     AddressInspectElements.edit().click();
	   Thread.sleep(5000);    
		     AddressInspectElements.back().click(); //clicking on back button
       Thread.sleep(5000);
		     AddressInspectElements.edit().click();
		     Thread.sleep(5000);
		     
		     ExcelCode.FileReading("C:\\Users\\HP\\git\\BookStoreTask-_Finalcode\\BookStore\\External Files\\Book1.xlsx","Sheet3");
		 	try {
			
				 AddressInspectElements.firstname().clear();
				 AddressInspectElements.lastname().clear();
				 AddressInspectElements.company().clear();
				 AddressInspectElements.address1().clear();
				 AddressInspectElements.address2().clear();
				 AddressInspectElements.city().clear();
				 AddressInspectElements.postcode().clear();		 
				 AddressInspectElements.cont().click();
				 
			        	 String a1=  ExcelCode.RowColumn(1, 1);
				          AddressInspectElements.firstname().sendKeys(a1); 
				         String a2=  ExcelCode.RowColumn(1, 2);
					      AddressInspectElements.lastname().sendKeys(a2);
					     String a3=  ExcelCode.RowColumn(1, 3); 
						  AddressInspectElements.company().sendKeys(a3); 
						 String a4=  ExcelCode.RowColumn(1, 4);
						  AddressInspectElements.address1().sendKeys(a4);
						 String a5=  ExcelCode.RowColumn(1, 5);
						  AddressInspectElements.address2().sendKeys(a5); 
						 String a6=  ExcelCode.RowColumn(1, 6);
						  AddressInspectElements.city().sendKeys(a6);
						 String a7=  ExcelCode.RowColumn(1, 7);
			              AddressInspectElements.postcode().sendKeys(a7);
			              ExcelCode.RowColumn(1, 8);
							 Thread.sleep(5000);
							 AddressInspectElements.country().selectByIndex(106);
							 Thread.sleep(5000);
							 ExcelCode.RowColumn(1, 9);
							 AddressInspectElements.region().selectByIndex(2);
							 AddressInspectElements.defaultaddressno().click();
							 Thread.sleep(5000);
							 AddressInspectElements.cont().click();		//clicking on continue button
							 
							s=AddressInspectElements.edit().getText();
							 System.out.println("Text is  "+s);
							s1="edit";
							 if(s.equalsIgnoreCase(s1)){
							 	Thread.sleep(5000);
							 	 ExcelCode.RowColumn1(1, 10);
					                ExcelCode.FileWritinging("C:\\Users\\HP\\git\\BookStoreTask-_Finalcode\\BookStore\\External Files\\Book1.xlsx","Sheet3");

							 }
							 else {
								 ExcelCode.RowColumn2(1, 10);
					                ExcelCode.FileWritinging("C:\\Users\\HP\\git\\BookStoreTask-_Finalcode\\BookStore\\External Files\\Book1.xlsx","Sheet3");	
							 }	 
					
							 
							 
	
			Thread.sleep(5000);
			AddressInspectElements.newaddress().click();
			Thread.sleep(5000);
			 AddressInspectElements.cont().click();
		
			 String a8=  ExcelCode.RowColumn(1, 1);
	          AddressInspectElements.firstname().sendKeys(a8); 
	         String a9=  ExcelCode.RowColumn(1, 2);
		      AddressInspectElements.lastname().sendKeys(a9);
		     String a10=  ExcelCode.RowColumn(1, 3); 
			  AddressInspectElements.company().sendKeys(a10); 
			 String a11=  ExcelCode.RowColumn(1, 4);
			  AddressInspectElements.address1().sendKeys(a11);
			 String a12=  ExcelCode.RowColumn(1, 5);
			  AddressInspectElements.address2().sendKeys(a12); 
			 String a13=  ExcelCode.RowColumn(1, 6);
			  AddressInspectElements.city().sendKeys(a13);
			 String a14=  ExcelCode.RowColumn(1, 7);
             AddressInspectElements.postcode().sendKeys(a14);
				 cell =sheet.getRow(1).getCell(8);
				 Thread.sleep(5000);
				 AddressInspectElements.country().selectByIndex(106);
				 Thread.sleep(5000);
				 AddressInspectElements.region().selectByIndex(2);
				 AddressInspectElements.defaultaddressyes().click();
				 Thread.sleep(5000);
				 AddressInspectElements.cont().click();		//clicking on continue button
			AddressInspectElements.delete().click();

		 	}
		 	finally {
		 		System.out.println("sajd");
		 	}
}
}