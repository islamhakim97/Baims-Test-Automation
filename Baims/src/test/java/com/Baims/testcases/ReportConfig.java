package com.Baims.testcases;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.Base.com.testBase;
import com.relevantcodes.extentreports.ExtentReports;

public class ReportConfig extends testBase {

	public ReportConfig() throws IOException {
		super();
	}
	/*[IMPORTANT]#to Generate report and not facing errors ##Don't Forget To : 
	 * 1) include REportCongig class in testng.xml file when need to Generate the report
	 * 2) and Run TestCases from testng.xml file OR you will find Null Pointer Exception . */
	//Create The Report
	@BeforeSuite
	public void start()
	{
		extent= new ExtentReports("/Volumes/IslamHakim/AlgorizaTestAutomationInternship/FirstMonthProject/Baims Automation/Baims-Test-Automation/Baims/TestReport/BaimsReport.html",true);
		extent.addSystemInfo("OS","MAC");
		extent.addSystemInfo("Owner","Islam Hakim");
		extent.addSystemInfo("TestName","Baims.com");
		extent.addSystemInfo("Language","Java");
		extent.addSystemInfo("Framework Design","Page Object");
	}
	@AfterSuite
	public void end()
	{
		extent.flush();// create the Report
	}

}
