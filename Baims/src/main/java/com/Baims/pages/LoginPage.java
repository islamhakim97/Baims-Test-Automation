package com.Baims.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.com.testBase;

public class LoginPage extends testBase {

	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	//WebElements
	@FindBy(xpath="//a[@href='https://baims.com/']")
	WebElement kuwit;
	@FindBy(xpath="//a[@href='https://baims.com/login']")
	WebElement LoginBtn;
	@FindBy(xpath= "//span[@class='lang_display']")
	WebElement changeLanguage;
	@FindBy(xpath="//label[@for='EN']")
	WebElement English;
	
	
	@FindBy(linkText="Sign in using email")
	WebElement loginUsingMaileng;
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement signin;
	//google
	@FindBy(xpath="//span[text()='Sign in with Google']")
	WebElement signInWithGoogle;
	@FindBy(xpath="//input[@type='email']")
	WebElement gmail;
	
	@FindBy(xpath="//span[@class='VfPpkd-vQzf8d']")
	WebElement next;
	//password
	@FindBy(xpath="//input[@type='password']")
	WebElement gmailpass;
	@FindBy(xpath="//span[@jsname='V67aGc']")
	WebElement passnext;
	//Twitter
	@FindBy(xpath="//span[text()='Sign in with Twitter']")
	WebElement signInWithTwitter;
	@FindBy(xpath="//input[@id='username_or_email']")
	WebElement twitterusername;
	@FindBy(xpath="//input[@id='password']")
	WebElement twitterpassword;
	@FindBy(xpath="//input[@type='submit']")
	WebElement twitterSignin;
	//Phone Number
	@FindBy(xpath="//span[text()='Sign in using Phone Number']")
	WebElement signinusingPhoneNum;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement phone;
	@FindBy(xpath="//button[text()='Send verification code']")//Send verification code
	WebElement sendcode;
	@FindBy(xpath="//h4[text()='Enter verification code']")
	WebElement verifycode;
	//selected-flag
	@FindBy(xpath="//div[contains(@class,'flag-dropdown')]")
	WebElement code;
    @FindBy(xpath="//ul[@role='listbox']")
 	WebElement list;
    @FindBy(xpath="//li[@data-country-code='eg']")
    WebElement Egypt;
    //Forgot Password Functionality
    @FindBy(linkText="Forgot password?")
    WebElement ForgotPassword;
    @FindBy(xpath="//input[@name='email']")
    WebElement Email;
    //verification code - For Reset Password
    @FindBy(xpath="//input[contains(@aria-label,'Character 1')]")
   	WebElement codechar1;
    @FindBy(xpath="//input[contains(@aria-label,'Character 2')]")
   	WebElement codechar2;
    @FindBy(xpath="//input[contains(@aria-label,'Character 3')]")
	WebElement codechar3;
    @FindBy(xpath="//input[contains(@aria-label,'Character 4')]")
   	WebElement codechar4;
    @FindBy(xpath="//input[contains(@aria-label,'Character 5')]")
   	WebElement codechar5;
    @FindBy(xpath="//input[contains(@aria-label,'Character 6')]")
   	WebElement codechar6;
    //Set New Password - Set a new password
    @FindBy(xpath="//h4[text()='Set a new password']")
	WebElement SetANewPassword;
    //new password
    @FindBy(xpath="//input[@name='password']")
   	WebElement newpass;
    //confirm new pass
    @FindBy(xpath="//input[@name='password_repeat']")
   	WebElement confirmnewpass;
    //Confirm new password Btn
    @FindBy(xpath="//button[text()='Confirm new password']")
   	WebElement confirmpasswordBtn;
	//Methods
	public void getMainPage()
	{
		driver.get("https://baims.com/") ;
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void performLogin(String mail,String pass) throws IOException
	{
		
		goToLoginPage();
		js.executeScript("arguments[0].style.border='3px solid purple'", loginUsingMaileng);
		loginUsingMaileng.click();
		
		js.executeScript("arguments[0].style.border='3px solid purple'", email);
		email.sendKeys(mail);
		js.executeScript("arguments[0].style.border='3px solid purple'", password);
		password.sendKeys(pass);
		signin.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@type='submit']")))).click();
		
	}

    public void performValidLogin(String mail,String pass) throws IOException
    {
    	
        goToLoginPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        js.executeScript("arguments[0].style.border='3px solid purple'", loginUsingMaileng);
    	loginUsingMaileng.click();	
		js.executeScript("arguments[0].style.border='3px solid purple'", email);
		email.sendKeys(mail);
		js.executeScript("arguments[0].style.border='3px solid purple'", password);
		password.sendKeys(pass);
		js.executeScript("arguments[0].style.border='3px solid purple'", signin);
		signin.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		//return new HomePage();
    }
    //Forgot password?
    public void checkForgotPassword()
    {
    	
    	 goToLoginPage();
    	 
         js.executeScript("arguments[0].style.border='3px solid purple'", loginUsingMaileng);
         loginUsingMaileng.click();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     	 js.executeScript("arguments[0].style.border='3px solid purple'", ForgotPassword);
     	 ForgotPassword.click();
     	js.executeScript("arguments[0].style.border='3px solid purple'", Email);
     	Email.sendKeys("islamabdelhakim5@gmail.com");
     	js.executeScript("arguments[0].style.border='3px solid purple'", sendcode);
     	sendcode.click();
     	//Fill in Verification Code - e80c55
     	js.executeScript("arguments[0].style.border='3px solid purple'",codechar1);
     	codechar1.sendKeys("e");
     	js.executeScript("arguments[0].style.border='3px solid purple'",codechar2);
     	codechar2.sendKeys("8");
     	js.executeScript("arguments[0].style.border='3px solid purple'",codechar3);
     	codechar3.sendKeys("0");
     	js.executeScript("arguments[0].style.border='3px solid purple'",codechar4);
     	codechar4.sendKeys("c");
     	js.executeScript("arguments[0].style.border='3px solid purple'",codechar5);
     	codechar5.sendKeys("5");
     	js.executeScript("arguments[0].style.border='3px solid purple'",codechar6);
     	codechar6.sendKeys("5");
     	//Set New Password
    	js.executeScript("arguments[0].style.border='3px solid purple'",newpass);
     	newpass.sendKeys("test@123!");
    	js.executeScript("arguments[0].style.border='3px solid purple'",confirmnewpass);
     	confirmnewpass.sendKeys("test@123!");
    	js.executeScript("arguments[0].style.border='3px solid purple'",confirmpasswordBtn);
     	confirmpasswordBtn.click();
     	
     	
    }
    
    public void goToLoginPage()
    {
    	 getMainPage();
    	js.executeScript("arguments[0].style.border='3px solid purple'", kuwit);
    	kuwit.click();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	js.executeScript("arguments[0].style.border='3px solid purple'", changeLanguage);
    	changeLanguage.click();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	js.executeScript("arguments[0].style.border='3px solid purple'", English);
    	English.click();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);

    	js.executeScript("arguments[0].style.border='3px solid purple'", LoginBtn);
    	LoginBtn.click();
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    }
    public void signinWithGoogleWindow()
    {
    	// Store the current window handle
    	String winHandleBefore = driver.getWindowHandle(); 
    	// Perform the click operation that opens new window
    	js.executeScript("arguments[0].style.border='3px solid purple'", signInWithGoogle);
    	signInWithGoogle.click();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    	// Switch to new window opened
    	for(String winHandle : driver.getWindowHandles()){
    	    driver.switchTo().window(winHandle);
    	}

    	// Perform the actions on new window
    	js.executeScript("arguments[0].style.border='3px solid purple'", gmail);
    	gmail.sendKeys("islamabdelhakim5@gmail.com");
    	js.executeScript("arguments[0].style.border='3px solid purple'", next);
    	next.click();
    	gmailpass.sendKeys("01112330219");
    	js.executeScript("arguments[0].style.border='3px solid purple'", gmailpass);
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	passnext.click();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	// Close the new window, if that window no more required
    	driver.close();

    	// Switch back to original browser (first window)
    	driver.switchTo().window(winHandleBefore);

    	// Continue with original browser (first window)
    	
    }
    //twiiter username :islam10680899  pass:test@123! mail:fegamic253@dmosoft.com
    public void signinWithTwitterleWindow()
    {
    	// Store the current window handle
    	String winHandleBefore = driver.getWindowHandle(); 
    	// Perform the click operation that opens new window
    	js.executeScript("arguments[0].style.border='3px solid purple'", signInWithTwitter);
    	signInWithTwitter.click();

    	// Switch to new window opened
    	for(String winHandle : driver.getWindowHandles()){
    	    driver.switchTo().window(winHandle);
    	}

    	// Perform the actions on new window
    	js.executeScript("arguments[0].style.border='3px solid purple'", twitterusername);
    	twitterusername.sendKeys("islam10680899");
    	js.executeScript("arguments[0].style.border='3px solid purple'", twitterpassword);
    	twitterpassword.click();
    	gmailpass.sendKeys("test@123!");
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    	js.executeScript("arguments[0].style.border='3px solid purple'", twitterSignin);
    	twitterSignin.click();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	// Close the new window, if that window no more required
    	driver.close();

    	// Switch back to original browser (first window)
    	driver.switchTo().window(winHandleBefore);

    	// Continue with original browser (first window)
    	
    }
    public void signinUsingPhoneNumberWindow()
    {
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	js.executeScript("arguments[0].style.border='3px solid purple'", signinusingPhoneNum);
    	signinusingPhoneNum.click();
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    	js.executeScript("arguments[0].style.border='3px solid purple'", code);
    	code.click();
    //	js.executeScript("arguments[0].style.border='3px solid purple'", Egypt);
    	Egypt.click();
    	//tabindex
    	js.executeScript("arguments[0].style.border='3px solid purple'", phone);
    	phone.sendKeys("1112247971");
    	js.executeScript("arguments[0].style.border='3px solid purple'", sendcode);
    	sendcode.click();
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    	
    	
    }
   
	public boolean signinIsDisplayed()
	{
		return signin.isDisplayed();
	}
	public boolean verifyCode()
	{
		js.executeScript("arguments[0].style.border='3px solid purple'", verifycode);
       return verifycode.isDisplayed();
	}
	public boolean setNewPasswordIsDisplayed()
	{
		return SetANewPassword.isDisplayed();
	}

	public void DeleteAllCookies()
	{
		driver.manage().deleteAllCookies();
	}
	

}
