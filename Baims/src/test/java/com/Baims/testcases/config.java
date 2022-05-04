package com.Baims.testcases;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.Base.com.testBase;
import com.relevantcodes.extentreports.ExtentReports;

public class config extends testBase {

	public config() throws IOException {
		super();
	}
//	
//	//Create The Report
//	@BeforeSuite
//	public void start()
//	{
//		extent= new ExtentReports("/Volumes/IslamHakim/AlgorizaTestAutomationInternship/FirstMonthProject/Baims Automation/Baims-Test-Automation/Baims/TestReport//Report.html",true);
//		extent.addSystemInfo("OS","MAC");
//		extent.addSystemInfo("Owner","Islam Hakim");
//		extent.addSystemInfo("TestName","Baims.com");
//		extent.addSystemInfo("Language","Java");
//		extent.addSystemInfo("Framework Design","Page Object");
//	}
//	@AfterSuite
//	public void end()
//	{
//		extent.flush();// create the Report
//	}

}
