package uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SantaGiftsDetails {
	public WebDriver driver;
	
	By secretsanta= By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[5]/a");
	By camera=By.xpath("//*[@id='CollectionAjaxContent']/div[1]/div[37]/div/a/div[1]");
	By checkbox=By.xpath("//*[@id='29368625397848']");
	By cart = By.xpath("//*[@id='cbb-also-bought-box']/div/div[2]/div/button/span");
	By total=By.xpath("//*[@id='CartPage']/div/form/div[5]/div/div[2]/div/div[2]/div[2]/span");
	public SantaGiftsDetails(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getsecretsanta() {
		return driver.findElement(secretsanta);
	}
	public WebElement getcamera() {
		return driver.findElement(camera);
	}
	public WebElement getcheckbox() {
		return driver.findElement(checkbox);
	}
	public WebElement getcart() {
		return driver.findElement(cart);
	}
	public WebElement gettotal() {
		return driver.findElement(total);
	}
}
