package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_3 {
	//Declaration
			@FindBy(xpath="//span[@class='user-id']")private WebElement userID;


			//initialization
			public pom_3(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			//utilization
			public String verifyuserID() {

				String actID = userID.getText();
				return actID;
			}
}
