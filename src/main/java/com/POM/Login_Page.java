package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement pwd;
	
	@FindBy(name = "login")
	private WebElement login_btn;

	public Login_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}
	
	
	
	
	
	
	
}
