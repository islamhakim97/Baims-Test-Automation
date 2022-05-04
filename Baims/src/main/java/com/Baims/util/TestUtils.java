package com.Baims.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Base.com.testBase;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class TestUtils extends testBase{
	public static ATUTestRecorder Recorder;
	public TestUtils() throws IOException {
		super();
	}
   //Take Video 
	public static void TakePicture (String name) throws IOException
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// the path to save screen shots
		FileUtils.copyFile(srcFile, new File("/Volumes/IslamHakim/AlgorizaTestAutomationInternship/FirstMonthProject/Baims Automation/Baims-Test-Automation/Baims/TestReport/"+name+".png"));
	}
	//Take SnapShot 
	public static void TakeVideo(String videoname) throws ATUTestRecorderException
	{
		Recorder=new ATUTestRecorder("/Volumes/IslamHakim/AlgorizaTestAutomationInternship/FirstMonthProject/Baims Automation/Baims-Test-Automation/Baims/TestReport",videoname,false);
		
	}
	
	public static Object[][]getDataFromExcel(String ExcelSheetename) throws IOException
	{
		//"/Volumes/IslamHakim/Data Excel Sheets/LoginData.xlsx"
		File file=new File("/Volumes/IslamHakim/AlgorizaTestAutomationInternship/FirstMonthProject/Baims Automation/Data Excel Sheets/BaimsData.xlsx");
		FileInputStream fis2 = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis2);
		
		XSSFSheet sheet=workbook.getSheet(ExcelSheetename);
		int rows=sheet.getLastRowNum();
		int columns = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rows][columns];
			//Get Data from Excel sheet
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				data[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
			
	}


}
