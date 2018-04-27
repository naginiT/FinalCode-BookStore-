package Actions;

import java.awt.Robot;
import Objects.ReturnCustomer;
import Values.BrowserCodeValues;
import Values.ExcelCode;
import Actions.ReturnCustomerActions;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.ChangePasswordInspectElements;
import Objects.EditInspectElements;
/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Change your password Tab
 * Verifying Back Button
 * Verifying Continue Button
*
*/
public class ChangePasswordActions {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFSheet sheet1;
	static XSSFCell cell;
	static String s=null;
	static String s1=null;
	static String s2=null;
	//static String s3=null;
	public  static void password() throws Exception{
		ReturnCustomerActions.exeec11();
		     ChangePasswordInspectElements.change().click();
		     ChangePasswordInspectElements.back().click();
		     ChangePasswordInspectElements.change().click();
		     
		     ExcelCode.FileReading("C:\\Users\\HP\\git\\BookStoreTask-_Finalcode\\BookStore\\External Files\\Book1.xlsx","Sheet2");
			  for(int j=1; j<=2; j++) {
				
				ChangePasswordInspectElements.password().clear();
				 String a1=  ExcelCode.RowColumn(j, 1);
				     ChangePasswordInspectElements.password().sendKeys(a1);
				 ChangePasswordInspectElements.repassword().clear();
				 String a2=  ExcelCode.RowColumn(j, 2); 
				      ChangePasswordInspectElements.repassword().sendKeys(a2);	
			 EditInspectElements.cont().click();
			 
			  try {	
				  s=EditInspectElements.cont().getAttribute("value");
             System.out.println("text is " +s);
             if(s.equalsIgnoreCase(BrowserCodeValues.s1)){
             	Thread.sleep(5000);
             	System.out.println("validate");
             	 ExcelCode.RowColumn1(j, 3);
	                ExcelCode.FileWritinging("C:\\Users\\HP\\git\\BookStoreTask-_Finalcode\\BookStore\\External Files\\Book1.xlsx","Sheet2");
             }
             }
            		 catch(Exception e){
            			 s2=ChangePasswordInspectElements.change().getText();
                         System.out.println("text is " +s2);
     					if(s2.equalsIgnoreCase(BrowserCodeValues.s3)){
     						
     						ExcelCode.RowColumn1(j, 3);
     		                ExcelCode.FileWritinging("C:\\Users\\HP\\git\\BookStoreTask-_Finalcode\\BookStore\\External Files\\Book1.xlsx","Sheet2");
     						
     					}
     					else {
     					 sheet.getRow(j).createCell(3).setCellValue("fail");
     		                System.out.println("invalidate");
     		               ExcelCode.RowColumn2(j, 3);
     		                ExcelCode.FileWritinging("C:\\Users\\HP\\git\\BookStoreTask-_Finalcode\\BookStore\\External Files\\Book1.xlsx","Sheet2");
     				}
             }
			}	

	}
}
