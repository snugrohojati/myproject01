package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;

/**
 * @author Administrator
 *
 */
public class LoginPage extends TestBase {
	
@FindBy(id="login2")
WebElement login;

@FindBy(id="loginusername")
WebElement username;

@FindBy(id="loginpassword")
WebElement password;

@FindBy(xpath="//*[@onclick=logIn()]")
WebElement loginButton;


public LoginPage(){
PageFactory.initElements(driver, this );
}

public void logIn() {
	login.click();
	username.sendKeys("suryawan");
	password.sendKeys("suryawan100%");
	loginButton.click();
}

}
