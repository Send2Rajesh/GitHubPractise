package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcart {
public static WebDriver driver;

@FindBy(xpath = "//a[@class='login']")
private WebElement addcarthomesignin;

@FindBy(id = "email")
private WebElement addcartuseremail;

@FindBy(id = "passwd")
private WebElement addcartuserpasswd;

@FindBy(id = "SubmitLogin")
private WebElement addcartsubmit;

@FindBy(xpath="//a[@title='View my shopping cart']")
private WebElement carthover;

@FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[2]")
private WebElement clickproduct;

@FindBy(id="group_1")
private WebElement size;

@FindBy(id="color_14")
private WebElement color;

@FindBy(xpath="(//button[@type='submit'])[3]")
private WebElement addcart;

@FindBy(xpath="//span[@title='Continue shopping']")
private WebElement continueshop;

@FindBy(xpath="//i[@class='icon-home']")
private WebElement home;

@FindBy(xpath="//a[@class='logout']")
private WebElement sinout;

public Addcart(WebDriver adriver) {
this.driver=adriver;
PageFactory.initElements(driver, this);

}

public WebElement getAddcarthomesignin() {
	return addcarthomesignin;
}

public WebElement getAddcartuseremail() {
	return addcartuseremail;
}

public WebElement getAddcartuserpasswd() {
	return addcartuserpasswd;
}

public WebElement getAddcartsubmit() {
	return addcartsubmit;
}

public WebElement getCarthover() {
	return carthover;
}

public WebElement getClickproduct() {
	return clickproduct;
}

public WebElement getSize() {
	return size;
}

public WebElement getColor() {
	return color;
}

public WebElement getAddcart() {
	return addcart;
}

public WebElement getContinueshop() {
	return continueshop;
}

public WebElement getHome() {
	return home;
}

public WebElement getSinout() {
	return sinout;
}
}
