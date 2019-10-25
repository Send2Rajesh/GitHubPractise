package com.cucumber.SingleTon;

import org.openqa.selenium.WebDriver;

import com.cucumber.POM.Addcart;
import com.cucumber.POM.Login;
import com.cucumber.POM.Modifyaddcart;
import com.cucumber.POM.Search;

public class PageObjectManager {
	
 private Addcart addcart;
 private Login login;
 private Modifyaddcart modfifycart;
 private Search search;
 public static WebDriver driver;
 
 public PageObjectManager(WebDriver xdriver) {
this.driver=xdriver;

 }

public Addcart getAddcart() {
	if (addcart==null) {
		addcart=new Addcart(driver);
	}
	return addcart;
	
}

public Search getSearch() {
	if (search==null) {
		search=new Search(driver);
	}
	return search;
}

public Login getLogin() {
	if (login==null) {
		login=new Login(driver);
	}
	return login;
}

public Modifyaddcart getModfifycart() {
	return modfifycart;
}


}
