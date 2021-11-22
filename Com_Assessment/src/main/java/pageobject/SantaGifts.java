package pageobject;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import reusablecomponents.ReadPropertyFile;
import uistore.SantaGiftsDetails;
import uistore.TrackOrderDetails;

public class SantaGifts extends ReadPropertyFile {

public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());
	
	@BeforeTest
	public void initialise() throws IOException {
		
		driver=DriverInitialisation();
	}
	
	@Test
	public void SantaGifts() throws InterruptedException {
		
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		log.info("navigation to url");	
		
		SantaGiftsDetails s = new SantaGiftsDetails (driver);
		
	    s.getsecretsanta().click();
	    s.getcamera().click();
	    s.getcheckbox().click();
	    s.getcart().click();
	    Thread.sleep(3000);
	    
	    Assert.assertEquals(s.gettotal().getText(),"Rs. 1,098");
		
		
		System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
	    ChromeOptions options  = new ChromeOptions();
	    options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
	    log.info("navigated to secret santa gifts");
	

	}
	
	  @AfterTest public void close() {
		  System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
		    ChromeOptions options  = new ChromeOptions();
		    options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
	  
	  driver.close(); driver=null;
	  
	  }


}
