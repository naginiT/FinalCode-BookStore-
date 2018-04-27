package Actions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import Actions.ReturnCustomerActions;
import Objects.BrowserCode;
import Objects.EditInspectElements;
import Values.BrowserCodeValues;
import Values.ExcelCode;
/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Email Text Box
 * Verifying Password Text Box
 * Verifying Login Button
 * Verifying Edit Tab
 * Verifying Continue Button
*
*/
public class EditActions {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell cell;
	static String s;
	static String ar=null;
	
	public static void edit() throws Exception{
		ReturnCustomerActions.exeec11();
		     EditInspectElements.edit().click();
		     EditInspectElements.back().click(); //clicking on back button
		    //EditInspectElements.edit().click();
		     
		     ExcelCode.FileReading("C:\\Users\\HP\\git\\BookStoreTask-_Finalcode\\BookStore\\External Files\\Book1.xlsx","Sheet1");
			for(int j=1; j<=3; j++) {
				 EditInspectElements.edit().click();
				 EditInspectElements.firstname().clear();
				 EditInspectElements.lastname().clear();
				 EditInspectElements.emailid().clear();
				 EditInspectElements.mobile().clear();
				EditInspectElements.fax().clear();
				  EditInspectElements.cont().click(); //clicking on continue button
				 
				 
				String a1=  ExcelCode.RowColumn(j, 1);
				EditInspectElements.firstname().sendKeys(a1);
		
				String a2=ExcelCode.RowColumn(j, 2);
				 EditInspectElements.lastname().sendKeys(a2);
				 String a3=ExcelCode.RowColumn(j, 3);
				 EditInspectElements.emailid().sendKeys(a3);
				 String a4= ExcelCode.RowColumn(j, 4);
				 EditInspectElements.mobile().sendKeys(a4);
				  String a5=ExcelCode.RowColumn(j, 5);
				  EditInspectElements.fax().sendKeys(a5);
				  EditInspectElements.cont().click();		//clicking on continue button
				 //Writing Status on Excel
				
					 
				  try {
					 
				    s=EditInspectElements.cont().getAttribute("value");
	                System.out.println("text is " +s); 
	                if(s.equalsIgnoreCase(BrowserCodeValues.s1)){
	                	Thread.sleep(5000);
	                	System.out.println("validate");
	                	 ExcelCode.RowColumn1(j, 6);
	                ExcelCode.FileWritinging("C:\\Users\\HP\\git\\BookStoreTask-_Finalcode\\BookStore\\External Files\\Book1.xlsx","Sheet1");
	                }
	             
	                EditInspectElements.back().click(); //clicking on back button  
	               
				  }
				  
				catch(Exception e){
					ar=BrowserCode.driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/div/div[1]")).getText();
					System.out.println("ar" +ar);
					
					if( BrowserCodeValues.expectedresults.equalsIgnoreCase(ar) ){
						
						System.out.println("2 if");
						ExcelCode.RowColumn1(j, 6);
						 ExcelCode.FileWritinging("C:\\Users\\HP\\git\\BookStoreTask-_Finalcode\\BookStore\\External Files\\Book1.xlsx","Sheet1");
						
					}
					else {
						ExcelCode.RowColumn2(j, 6);
		                System.out.println("invalidate");
		                ExcelCode.FileWritinging("C:\\Users\\HP\\git\\BookStoreTask-_Finalcode\\BookStore\\External Files\\Book1.xlsx","Sheet1");
					System.out.println(e);
				}
				}
			
}
}
}



