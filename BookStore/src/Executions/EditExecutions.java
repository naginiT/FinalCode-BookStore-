package Executions;

import org.testng.annotations.Test;

import Actions.EditActions;
import Objects.BrowserCode;
/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Email Text Box
 * Verifying Password Text Box
 * Verifying Login Button
 * Verifying Edit Tab
 * Verifying Continue Button
*
*/
public class EditExecutions {
	@Test
	public void Signin() throws Exception
	{
	Thread.sleep(5000);
	BrowserCode.Browser();
	EditActions.edit();
	}
}
/*String s=	class.method(j,2);
AddressInspectElements.lastname().sendKeys(s);*/