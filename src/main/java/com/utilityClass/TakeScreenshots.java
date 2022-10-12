package com.utilityClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.mainClass.DriverSetup;

public class TakeScreenshots extends DriverSetup {

	public void takeScreenshots() {
		
		Date date = new Date();
		SimpleDateFormat date_format = new SimpleDateFormat("YYYY-MM-dd HH-mm-ss");
		String get_date = date_format.format(date);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File getScreenshot = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			Files.move(getScreenshot, new File("C:\\Users\\HP\\eclipse-workspace\\SeleniumFramework\\Listeners\\Screenshots\\" +get_date +".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
