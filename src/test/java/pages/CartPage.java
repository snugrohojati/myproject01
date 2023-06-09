package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;

/**
 * @author Administrator
 *
 */
public class CartPage extends TestBase {
	
@FindBy(xpath="//a[contains(text(),'Add to cart')]")
WebElement addToCartButton;


public CartPage(){
PageFactory.initElements(driver, this );
}

public void addToCart() {
	addToCartButton.click();
}
}
