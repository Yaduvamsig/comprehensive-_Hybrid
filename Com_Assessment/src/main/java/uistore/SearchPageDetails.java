package uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPageDetails {
	public WebDriver driver;
	
	
	By search=By.xpath("//*[@id='myheader']/div[1]/header/div[2]/div[2]/div[3]/form/input[2]");
	//By mickeymouse=By.xpath("/html/body/div[10]/ul/li[2]");
	By image=By.xpath("//*[@id='snize-product-6576615588038']/a/div/span/span[1]");
	
public SearchPageDetails(WebDriver driver) {

 this.driver=driver;
 
}


public WebElement getSearch() {
// TODO Auto-generated method stub
return driver.findElement(search);

}
/*public WebElement getmickeymouse() {
	// TODO Auto-generated method stub
	return driver.findElement(mickeymouse);

	}*/
public WebElement getImage() {
	// TODO Auto-generated method stub
	return driver.findElement(image);

	}

}