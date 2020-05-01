package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	//default constructor
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	} 
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="pass")
	private WebElement txtPass;
	
//	@FindBy(id="loginbutton")
//	private WebElement btnLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

//	public WebElement getBtnLogin() {
//		return btnLogin;
//	}
	
}
