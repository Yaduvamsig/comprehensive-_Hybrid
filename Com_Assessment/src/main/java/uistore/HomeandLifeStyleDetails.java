
package uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeandLifeStyleDetails {
	
	WebDriver driver;
	By lifestyle =By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[11]/a");
	By pantry=By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[11]/ul/li[6]/a");
	By name=By.xpath("//*[@id='sortBy']");
	By item=By.xpath("//*[@id='CollectionAjaxContent']/div[1]/div[3]/div/a/div[1]");
	By qty=By.xpath("//*[@id='AddToCartForm-10299105491']/div[2]/div/span[1]");
	
	By pc=By.xpath("//*[@id='PostalCode']");
	By check =By.xpath("//*[@id='cod-cheker']/button");
	By text=By.xpath("//*[@id='PostalCodeCheckerAvailability']");
	
	public  HomeandLifeStyleDetails(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public  WebElement getlifestyle()
	{
		return driver.findElement(lifestyle);
	}
	public  WebElement getpantry()
	{
		return driver.findElement(pantry);
	}
	
	public  WebElement getname()
	{
		return driver.findElement(name);
	}
	
	public  WebElement getitem()
	{
		return driver.findElement(item);
	}
	public  WebElement getqty()
	{
		return driver.findElement(qty);
	}
	public  WebElement getpincode()
	{
		return driver.findElement(pc);
	}
	
	public  WebElement getcheck()
	{
		return driver.findElement(check);
	}
	public  WebElement gettext()
	{
		return driver.findElement(text);
	}
	
	
	
	
	
	

}