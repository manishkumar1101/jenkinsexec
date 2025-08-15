package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderpage {
	
@FindBy(xpath="//a[contains(text(), 'Order Online Now')]")
private WebElement orderpage;
	
@FindBy(id="food_quantity")
private WebElement foodquat;


@FindBy(id="food_item")
private WebElement fooditem;

@FindBy(id="special_item")
private WebElement specialitem;

@FindBy(id="delivery_type")
private WebElement deliverytype;
@FindBy(id="delivery_area")
private WebElement deliveryarea;

@FindBy(id="submitBtn")
private WebElement submitbtn;
@FindBy(id="resetBtn")
private WebElement resetbtn;

public orderpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
public void orderbtn() {
	orderpage.click();
}
public WebElement fooditem() {
	return fooditem;
}
public WebElement specialitem() {
	return specialitem;
}
public void foodqt(String qt) {
	 foodquat.sendKeys(qt);
}
public WebElement deliverytype() {
	return deliverytype;
}
public WebElement deliveryarea() {
	return deliveryarea;
}
public void submit() {
	submitbtn.click();
}
public void reset() {
	resetbtn.click();
}

}
