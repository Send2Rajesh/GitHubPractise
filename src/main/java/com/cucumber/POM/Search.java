package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

	public static WebDriver driver;
	

	@FindBy(xpath = "//a[@class='login']")
	private WebElement search_signin;
	
	@FindBy(id = "email")
	private WebElement search_useremail;

	@FindBy(id = "passwd")
	private WebElement search_userpasswd;

	@FindBy(id = "SubmitLogin")
	private WebElement search_submit;

	@FindBy(id = "search_query_top")
	private WebElement search_bar;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement clicksearch;
	
	public WebElement getClicksearch() {
		return clicksearch;
	}

	@FindBy(id ="selectProductSort")
	private WebElement sortby;
	
	@FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[2]")
	private WebElement product;
	
	@FindBy(xpath= "(//a[@data-field-qty='qty'])[2]")
	private WebElement quality;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement addcart;
	
	@FindBy(xpath = "//span[@title='Continue shopping']")
	private WebElement conshopping;
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement searchsignout;
	
	public WebElement getSearch_signin() {
		return search_signin;
	}

	public WebElement getSearch_useremail() {
		return search_useremail;
	}

	public WebElement getSearch_userpasswd() {
		return search_userpasswd;
	}

	public WebElement getSearch_submit() {
		return search_submit;
	}

	public WebElement getSearch_bar() {
		return search_bar;
	}

	public WebElement getSortby() {
		return sortby;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getQuality() {
		return quality;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	public WebElement getConshopping() {
		return conshopping;
	}

	

	public WebElement getSearchsignout() {
		return searchsignout;
	}

	public Search(WebDriver sdriver) {
this.driver=sdriver;
PageFactory.initElements(driver, this);
	}
	}
