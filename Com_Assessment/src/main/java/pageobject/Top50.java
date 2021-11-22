package pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import uistore.Top50details;



public class Top50 extends ReadPropertyFile{
	public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {
		
		driver=DriverInitialisation();
	}
	@Test
	public void Top50() throws InterruptedException {
		
		
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");	
	
	  Top50details p=new Top50details(driver);
	  p.getTop50().click();
	  p.getFeatures().click();
	  p.getBest().click();
	  Thread.sleep(1000);
	 
	  Assert.assertEquals( p.getBook().getText(),"Pokémon Silicone Sling Pouch Bag");
	  Thread.sleep(2000);
	  log.info("Assertion passed");
	  log.info("navigated to top50");
	  
	
	}
	@AfterTest
	public void close() {
		
		driver.quit();
		
	}
	

}