package pageobject;




import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import uistore.HomeandLifeStyleDetails;
import uistore.MouseActionsDetails;

public class HomeandLifeStyle extends ReadPropertyFile{
public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());
	
	@BeforeTest
	public void initialise() throws IOException {
		
		driver=DriverInitialisation();
	}
	
	@Test
	public void HomeandLifeStyle() throws InterruptedException {
		HomeandLifeStyleDetails l=new HomeandLifeStyleDetails(driver);
		
		
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");
		Actions action = new Actions(driver);

		action.moveToElement(l.getlifestyle()).perform();
		l.getpantry().click();
		Thread.sleep(2000);
		Select s= new Select(l.getname());
		s.selectByIndex(2);
		l.getitem().click();
		Thread.sleep(1000);
		l.getqty().click();
		l.getpincode().sendKeys("521333");
		Thread.sleep(3000);
		l.getcheck().click();
		Thread.sleep(5000);
		System.out.println(l.gettext().getText());
		log.info("navigated to Homelifestyle");
		
		
		
		
		
		
	}
	
	@AfterTest
	public void close() {
		
		driver.close();
		driver=null;
	}
	
	

}