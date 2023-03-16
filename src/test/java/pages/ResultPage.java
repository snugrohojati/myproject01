package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;

/**
 * @author Administrator
 *
 */
public class ResultPage extends TestBase {
	
@FindBy(xpath="//a[contains(text(),'Add to cart')]")
WebElement addToCartButton;

@FindBy(css="div>div>ul>li>a[href='index.html']")
WebElement homeButton;

public ResultPage(){
PageFactory.initElements(driver, this );
}

public void addToCart() {
	addToCartButton.click();
	driver.switchTo().alert().accept();
	homeButton.click();
}

}
