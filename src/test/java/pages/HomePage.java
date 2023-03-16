package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {

@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
WebElement item1;

@FindBy(xpath="//a[contains(text(),'Samsung galaxy s7')]")
WebElement item2;

public HomePage() {
	PageFactory.initElements(driver, this);
	
}

public void selectItem1() {
	item1.click();
}
public void selectItem2() {
	item2.click();
}
	
}
