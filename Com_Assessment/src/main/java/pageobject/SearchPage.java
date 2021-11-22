package pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import uistore.SearchPageDetails;

public class SearchPage  extends ReadPropertyFile {
	
	
	public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {
		
		driver=DriverInitialisation();
	}
	@Test
	public void SearchPage() throws InterruptedException {
		
		
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");	
	
		
		SearchPageDetails s=new SearchPageDetails(driver);
		s.getSearch().sendKeys("mickeymouse",Keys.ENTER);
		
		Thread.sleep(3000);
		//s.getmickeymouse().click();
		
		
		Assert.assertEquals(s.getImage().getText(), "Mickey Mouse Solar Powered Bobblehead");
		Thread.sleep(3000);
		 log.info("Assertion passed");
		
	}
	@AfterTest
	public void close() {
		
		driver.quit();
		
	}
}
