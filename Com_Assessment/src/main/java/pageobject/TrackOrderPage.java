package pageobject;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import reusablecomponents.ReadPropertyFile;
import uistore.TrackOrderDetails;

public class TrackOrderPage extends ReadPropertyFile {

public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());
	
	@BeforeTest
	public void initialise() throws IOException {
		
		driver=DriverInitialisation();
	}
	
	@Test
	public void TrackOrderPage() throws InterruptedException {
		
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		log.info("navigation to url");	
		
		TrackOrderDetails td = new TrackOrderDetails(driver);
		td.getTrackOrder().sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
	    
		Set<String> ab = driver.getWindowHandles();
		Iterator<String> it = ab.iterator();
		String parentId = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		
		System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
	    ChromeOptions options  = new ChromeOptions();
	    options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
		
	    td.getEmail().sendKeys("vamsi@gmail.com");
	    td.getOrderId().sendKeys("073907");
	    td.getFind().click();
		  System.out.println(driver.getTitle());
		    Thread.sleep(2000);
		    driver.close(); 
		    driver.switchTo().window(parentId);
		    log.info("trackorderpage completed");

	}
	
	  @AfterTest public void close() {
		  System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
		    ChromeOptions options  = new ChromeOptions();
		    options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
	  
	  driver.close(); driver=null;
	  
	  }


}
