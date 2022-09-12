package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_1 {
//declaration
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement LOGINBTN ;
	
	//initializaton
	public pom_1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void enterUN(String username) {
		UN.sendKeys(username);
		
	}
	public void enterPWD(String password) {
		PWD.sendKeys("password");
		
	}
	public void enterclickLOGINBTN() {
		LOGINBTN.click();
	}
	
	
}
