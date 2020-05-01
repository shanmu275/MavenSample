package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class PojoLog extends BaseClass {

	//default constructor
	public PojoLog() {
		PageFactory.initElements(driver, this);	} 
	@FindBy(id= "email")
	private WebElement txtEmail;

	@FindBy(id= "pass")
	private WebElement txtPass;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}


}
