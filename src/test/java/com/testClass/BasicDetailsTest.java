package com.testClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mainClass.DriverSetup;
import com.pageClass.BasicDetailsPage;
import com.utilityClass.LogsGeneration;
import com.utilityClass.TakeScreenshots;

public class BasicDetailsTest extends DriverSetup {

//	Logger log;
	
	BasicDetailsPage basic_page;
	LogsGeneration logs;
	TakeScreenshots take_screen;

	public BasicDetailsTest() {
		super();
	}

	@Parameters("BrowserType")
	@BeforeMethod	
	public void initDriver(String browser) {
		driverInitialization(browser);
		basic_page = new BasicDetailsPage();
		logs = new LogsGeneration();
//		log = LogManager.getLogger(BasicDetailsTest.class);
//		DOMConfigurator.configure("log4j2.xml");
		take_screen = new TakeScreenshots();
	}

	@Test
	public void basicDetails() {
		
		take_screen.takeScreenshots();
		basic_page.basicDetails("Max Patil", "04051993", "maxx@gmaail.com", "7219577420");
		take_screen.takeScreenshots();
		logs.createLogs("Entered name, DOB, email and Mobile number", "NA");
//		logs.info("Name and all details are filled");
//		log.error("Error will be throw");
	}

	@AfterMethod
	public void tearDown() {
		take_screen.takeScreenshots();
		driver.close();
//		log.info("Driver is closed");
		logs.createLogs("Driver is going to closed...", "All files will be closed..");
	}
}
