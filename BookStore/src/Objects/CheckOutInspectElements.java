package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutInspectElements extends BrowserCode {
	static WebElement element;
	static By shopingcart=By.xpath("//*[@id=\"topbar\"]/div/div/div[1]/ul[2]/li[3]/a/span");
	static By emailid=By.xpath("//*[@id=\"formNewLestter\"]/div[2]/input[1]");
	static By subscribe=By.xpath("//*[@id=\"formNewLestter\"]/div[2]/span/button");
	static By checkout=By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a");
	public CheckOutInspectElements(WebDriver driver)
	{
		super();
	}
	public static WebElement shopingcart()
	{
	element=driver.findElement(shopingcart);
	return element;
	}
	
	public static WebElement emailid()
	{
	element=driver.findElement(emailid);
	return element;
	}
	public static WebElement subscribe()
	{
	element=driver.findElement(subscribe);
	return element;
	}
	public static WebElement checkout()
	{
	element=driver.findElement(checkout);
	return element;
	}
	
}
