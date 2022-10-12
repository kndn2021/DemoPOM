package com.mainClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

public class DriverSetup {

	public static WebDriver driver;

	public void driverInitialization(String browser) {

		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");

			driver = new ChromeDriver();
		} 
		else if(browser.equalsIgnoreCase("IE")) {
			System.setProperty(InternetExplorerDriverService.IE_DRIVER_SILENT_PROPERTY, "true");
			System.setProperty("webdriver.ie.driver", "C:\\Automation\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("No browser found.");
			System.exit(1);
		}
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://portal.hdfc.com/signup?redirectTo=gettingStarted&back=signup");
	}

}
