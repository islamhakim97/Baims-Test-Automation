package com.Baims.testcases;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.Baims.pages.HomePage;
import com.Baims.pages.LoginPage;
import com.Baims.util.TestUtils;
import com.Base.com.testBase;

import atu.testrecorder.exceptions.ATUTestRecorderException;


public class LoginPageTest extends testBase {

	public LoginPageTest() throws IOException {
		super();
		
	}
	LoginPage loginPage;
	HomePage homePage;
	
	 //@Parameters({"browser"})   //{} means defined
	    
		@BeforeMethod
		public void setup(Method method) throws IOException , ATUTestRecorderException                            //Method method,String browser

		{
			initialization("chrome");
		    loginPage=new LoginPage();// after you initialize your driver
			//TestUtils.TakeVideo(method.getName());
			//TestUtils.Recorder.start();
			loginPage.getMainPage();
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		    
		}

		@AfterMethod
		public void tearDown(Method method,ITestResult result) throws IOException, ATUTestRecorderException //ITestResult is TestNG listener to log test status[pass|fail|skipped]

		{
			//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

			//TestUtils.TakePicture(method.getName());
             driver.quit();
     		//driver.close();
			
		}
    	//Login TCs
		//@Test(priority=1)
		public void performValidLoginTest() throws IOException
		{
			String validUser=prop.getProperty("username");
			String validpass=prop.getProperty("password");
			homePage=loginPage.performValidLogin(validUser,validpass);
			boolean Ar = homePage.BeginisDisplayed();
			Assert.assertEquals( Ar, true,"Login Fail , In correct Username Or Password");
		}
		
		//@Test(priority=2,dataProvider="testLoginData")//,dataProvider="testLoginData"
		public void CheckLoginwithInvalidPasswordOrmail(String mail,String pass) throws IOException//String fname,String lname
		{
		  loginPage.performLogin(mail,pass);
		   boolean actualResult = loginPage.signinIsDisplayed();
		    
			Assert.assertEquals(actualResult, false,"Login Fail , In correct Username Or Password");
			
		}
		//Forgot Password Functionality
		@Test(priority=3)
		public void checkForgotPasswordFunctionality()
		{
			loginPage.checkForgotPassword();
			boolean ar=loginPage.setNewPasswordIsDisplayed();
			Assert.assertEquals(ar, true,"Set a new Password Text is not displayed");
			
		}
		//login with Google
		//@Test(priority=4)
		public void CheckLoginwithGoogle()
		{
			loginPage.getMainPage();
			loginPage.goToLoginPage();
			loginPage.signinWithGoogleWindow();
			boolean ar=loginPage.signinIsDisplayed();
			Assert.assertFalse(ar,"Fail Login with Google");
			
		}
		//login with Twitter
		//@Test(priority=5)
	    public void CheckLoginwithTwitter()
		{
		  loginPage.getMainPage();
		  loginPage.goToLoginPage();
		  loginPage.signinWithTwitterleWindow();
		  boolean ar=loginPage.signinIsDisplayed();
		  Assert.assertFalse(ar,"Fail Login with Twitter");
					
		}
	    //login with Phone
	   // @Test(priority=6)
		 public void CheckLoginwithPhoneNumber()
			{
			  loginPage.getMainPage();
			  loginPage.goToLoginPage();
			  loginPage.signinUsingPhoneNumberWindow();;
			  boolean ar=loginPage.verifyCode();
			  Assert.assertTrue(ar,"Fail Login using phone number");
						
			}
		
		@DataProvider
		public Object[][] testLoginData() throws IOException
		{
			// if you ** change the file name **[don't forget to change the File Path ]in the getDataFromExcel Method 
			//AND [pass the correct sheet name to getDataFrom Excel Method]].
			String ExcelSheetname="Sheet1";//"FbLoginData";//"RegisterDataSheet";
			Object[][]data=TestUtils.getDataFromExcel(ExcelSheetname);
			return data;
		}

		

}