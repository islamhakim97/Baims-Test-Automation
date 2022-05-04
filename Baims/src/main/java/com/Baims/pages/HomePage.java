package com.Baims.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.com.testBase;




public class HomePage extends testBase{

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	//Put Elements Of The HomePage with PageFactory Object Technique
	
    @FindBy(xpath="//p[text()='Study anytime you want']")
    WebElement Begin;
	
	
	//Put Methods Of The HomePage with PageFactory Object Technique
	public boolean BeginisDisplayed()
	{
		return Begin.isDisplayed();
	}

}
