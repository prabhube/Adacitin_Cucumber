package com.BassClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pompage {
	public static WebDriver driver;
	@FindBy(id="username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	@FindBy(id="password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(id="login")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	// Constructor
	public Pompage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);

	}
}
