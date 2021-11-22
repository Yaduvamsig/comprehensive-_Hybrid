package pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import uistore.CartHandlingDetails;

public class CartHandling extends ReadPropertyFile {
	public static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {

		driver = DriverInitialisation();
	}

	@Test
	public void CartHandling() throws InterruptedException {
		CartHandlingDetails a = new CartHandlingDetails(driver);

		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");
		a.getallofit().click();
		a.getitem().click();
		Thread.sleep(3000);
		a.getaddtocart().click();
		Thread.sleep(3000);
		a.getgiftwrap().click();
		a.getgiftnote().click();
		Thread.sleep(3000);
		a.getfromdetails().sendKeys("Mindtree");
		a.gettodetails().sendKeys("vamsi");
		a.getmessage().sendKeys("diwali Gift");
		Thread.sleep(3000);
		System.out.println(a.gettotal().getText());
		log.info("navigated to All of it page");

		System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
		Thread.sleep(3000);

		a.getContinueShopping().click();
		Thread.sleep(3000);
		a.getallofit().click();

	}

	@AfterTest
	public void close() {

		driver.close();
		driver = null;

	}
}
