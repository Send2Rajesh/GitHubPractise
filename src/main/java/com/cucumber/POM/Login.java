package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.SingleTon.PageObjectManager;

public class Login {
	public static WebDriver driver;

	@FindBy(xpath = "//img[@class='logo img-responsive']")
	private WebElement logo;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement homesignin;

	@FindBy(id = "email")
	private WebElement useremail;

	@FindBy(id = "passwd")
	private WebElement userpasswd;

	@FindBy(id = "SubmitLogin")
	private WebElement submit;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement sinout;

	public WebElement getSinout() {
		return sinout;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getHomesignin() {
		return homesignin;
	}

	public WebElement getUseremail() {
		return useremail;
	}

	public WebElement getUserpasswd() {
		return userpasswd;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public Login(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

}
