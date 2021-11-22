package uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Top50details {
	public WebDriver driver;

	By Top50 = By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[6]/a");
	By features = By.id("sortBy");
	By best = By.xpath("//*[@id=\'sortBy\']/option[3]");
	By book = By.xpath("//*[@id='CollectionAjaxContent']/div[1]/div[42]/div/a/div[2]/div[1]");

	public Top50details(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement getTop50() {

		return driver.findElement(Top50);

	}

	public WebElement getFeatures() {

		return driver.findElement(features);

	}

	public WebElement getBest() {

		return driver.findElement(best);

	}

	public WebElement getBook() {

		return driver.findElement(book);

	}

}