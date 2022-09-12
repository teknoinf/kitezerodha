package base;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public WebDriver driver;//having acess throughout the project FOR THAT USE PUBLIC
public void initilizeBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	//maxi
	driver.manage().window().maximize();
	//implicitly wait
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
}
}
