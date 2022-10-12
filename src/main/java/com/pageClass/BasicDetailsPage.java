package com.pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mainClass.DriverSetup;

public class BasicDetailsPage extends DriverSetup {

	@FindBy(how = How.ID, using = "full_name")
	WebElement name;

	@FindBy(how = How.NAME, using = "signup_dob")
	WebElement date_of_birth;

	@FindBy(id = "email_id")
	WebElement email_id;

	@FindBy(name = "mobile_no")
	WebElement mobile_number;

	@FindBy(xpath = "//button[text()=' Next ']")
	WebElement next_button;

	public BasicDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	public void basicDetails(String getName, String getDOB, String getEmail, String getMobile) {
		name.sendKeys(getName);
		date_of_birth.sendKeys(getDOB);
		email_id.sendKeys(getEmail);
		mobile_number.sendKeys(getMobile);
		next_button.click();
	}

}
