package kite_test;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pom_classes.Pom_2;
import pom_classes.pom_1;
import pom_classes.pom_3;
import utility.Utility_class;

public class Test_class extends BaseClass {
	//declare all useful members as global
	
			pom_1 login1;
	 	Pom_2 login2;
			pom_3 home;
			
			@BeforeClass
		public void openBrowser()  throws Throwable {
		initilizeBrowser();
		    
		    //all objects of POM class
		    login1=new pom_1(driver);
		     login2=new Pom_2(driver);
		     home=new pom_3(driver);
		}
	//	private void initilizeBrowser() {
			// TODO Auto-generated method stub
			
		
		@BeforeMethod
		public void loginToApp() throws Throwable {
			//enter un
			 
			 login1.enterUN(Utility_class.getTD(0, 0));//DPG458
			 System.out.println((Utility_class.getTD(0, 0)));
			 
			 //enter pwd
			
			login1.enterPWD(Utility_class.getTD(0, 1));
			//clck on login btn
			login1.enterclickLOGINBTN();
			
			//enter pin
			
			login2.enterPIN(Utility_class.getTD(0, 2));
			//click on continue btn
			login2.clickcntBtn();
		}
		@Test
		public void verifyuserID() throws Throwable {
			Reporter.log("running verify user id",true);
			String actID = home.verifyuserID();
			 String expID=Utility_class.getTD(0, 0);
			Assert.assertEquals(expID,actID,"both are different tc is failed");
		}
		@AfterMethod
		public void logoutApp() {
			Reporter.log("logout the application",true);
		}
		@AfterClass
		public void closeBrowser() {
			Reporter.log("close the app",true);
		}
			
	}

