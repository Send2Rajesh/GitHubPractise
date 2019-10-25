package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.Auto_Baseclass.AutoBaseclass;
import com.cucumber.POM.Login;
import com.cucumber.SingleTon.PageObjectManager;
import com.cucumber.runner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends AutoBaseclass {
public static WebDriver driver= TestRunner.driver;

PageObjectManager pom=new PageObjectManager(driver);


@Given("^User should be in Web Application$")
public void user_should_be_in_Web_Application() throws Throwable {
    geturl("http://automationpractice.com/index.php");
    
}

@Then("^User should see the Application logo$")
public void user_should_see_the_Application_logo() throws Throwable {
    elementisDisplayed(pom.getLogin().getLogo());
    
}

@Then("^User click the Sign-in the home_page$")
public void user_click_the_Sign_in_the_home_page() throws Throwable {
    clickelement(pom.getLogin().getHomesignin());
    
}

@When("^User enter the Email_id$")
public void user_enter_the_Email_id() throws Throwable {
    sendkeys(pom.getLogin().getUseremail(),"piratesofthecaribbean@gmail.com");
    
}

@When("^User enter the Password$")
public void user_enter_the_Password() throws Throwable {
    sendkeys(pom.getLogin().getUserpasswd(),"pirates@123");
    
}

@When("^login_button$")
public void login_button() throws Throwable {
    clickkk(pom.getLogin().getSubmit());
    
}

@When("^User click the Signout_button$")
public void user_click_the_Signout_button() throws Throwable {
    clickelement(pom.getLogin().getSinout());
    
}

//@test2

@Given("^Valid Url$")
public void Valid_Url() throws Throwable {
	geturl("http://automationpractice.com/index.php");
    
    
}

@Given("^User click the Sign in the homepage$")
public void user_click_the_Sign_in_the_homepage() throws Throwable {
clickelement(pom.getSearch().getSearch_signin());    
}

@When("^User enter the Emailid$")
public void user_enter_the_Emailid() throws Throwable {
    sendkeys(pom.getSearch().getSearch_useremail(), "piratesofthecaribbean@gmail.com");
    
}

@When("^User enters the Passwd$")
public void user_enters_the_Passwd() throws Throwable {
    sendkeys(pom.getSearch().getSearch_userpasswd(), "pirates@123");
    
}

@When("^User click the login button$")
public void user_click_the_login_button() throws Throwable {
    clickelement(pom.getSearch().getSearch_submit());
    
}

@When("^User search for the product$")
public void user_search_for_the_product() throws Throwable {
    sendkeys(pom.getSearch().getSearch_bar(), "dress");
    
}

@When("^User click the search icon$")
public void user_click_the_search_icon() throws Throwable {
   clickelement(pom.getSearch().getClicksearch());
}


@When("^User sort the product by lowest first$")
public void user_sort_the_product_by_lowest_first() throws Throwable {
   dropdown(pom.getSearch().getSortby(), "index", "1");
    
}

@When("^User click the product$")
public void user_click_the_product() throws Throwable {
    clickelement(pom.getSearch().getProduct());
    
}

@When("^User Increase the quality$")
public void user_Increase_the_quality() throws Throwable {
	clickelement(pom.getSearch().getQuality());
    
}

@When("^User Click add to cart$")
public void user_Click_add_to_cart() throws Throwable {
    clickelement(pom.getSearch().getAddcart());
}

@When("^User Click the Continue shopping$")
public void user_Click_the_Continue_shopping() throws Throwable {
    clickelement(pom.getSearch().getConshopping());
    
}

@When("^User Click the sign-out button$")
public void user_Click_the_sign_out_button() throws Throwable {
    clickelement(pom.getSearch().getSearchsignout());
    
}
//test3

@Given("^User Enter the valid_Url$")
public void user_Enter_the_valid_Url() throws Throwable {
    geturl("http://automationpractice.com/index.php");
    
}

@Given("^User click the Sign button$")
public void user_click_the_Sign_button() throws Throwable {
    clickelement(pom.getAddcart().getAddcarthomesignin());
    
}

@When("^User enter the valid Email$")
public void user_enter_the_valid_Email() throws Throwable {
    sendkeys(pom.getAddcart().getAddcartuseremail(),"piratesofthecaribbean@gmail.com");
    
}

@When("^User enters the valid Password$")
public void user_enters_the_valid_Password() throws Throwable {
    sendkeys(pom.getAddcart().getAddcartuserpasswd(), "pirates@123");
    
}

@When("^User login the Application$")
public void user_login_the_Application() throws Throwable {
    clickelement(pom.getAddcart().getAddcartsubmit());
    
}

@When("^User Mouse Hover the cart$")
public void user_Mouse_Hover_the_cart() throws Throwable {
    
    
}

@When("^User change the Product size$")
public void user_change_the_Product_size() throws Throwable {
    
    
}

@When("^User change the Product color$")
public void user_change_the_Product_color() throws Throwable {
    
    
}

@When("^Click add to cart$")
public void click_add_to_cart() throws Throwable {
    
    
}

@When("^click continue shopping $")
public void click_continue_shopping() throws Throwable {
    
    
}

@When("^User click the home button$")
public void user_click_the_home_button() throws Throwable {
    
    
}

@When("^Click the sign out$")
public void click_the_sign_out() throws Throwable {
    
    
}

@Given("^Get valid URL$")
public void get_valid_URL() throws Throwable {
    
    
}

@Given("^Click the Sign button$")
public void click_the_Sign_button() throws Throwable {
    
    
}

@When("^Enter the valid Email$")
public void enter_the_valid_Email() throws Throwable {
    
    
}

@When("^Enter the valid Password$")
public void enter_the_valid_Password() throws Throwable {
    
    
}

@When("^User click login button$")
public void user_click_login_button() throws Throwable {
    
    
}

@When("^Mouse hover  to the cart$")
public void mouse_hover_to_the_cart() throws Throwable {
    
    
}

@When("^Click check out$")
public void click_check_out() throws Throwable {
    
    
}

@When("^delete any one product from the cart$")
public void delete_any_one_product_from_the_cart() throws Throwable {
    
    
}

@When("^Click process to checkout$")
public void click_process_to_checkout() throws Throwable {
    
    
}

@When("^click again process to checkout$")
public void click_again_process_to_checkout() throws Throwable {
    
    
}

@When("^User click Agree to the terms and conditions$")
public void user_click_Agree_to_the_terms_and_conditions() throws Throwable {
    
    
}

@When("^User click the payment option$")
public void user_click_the_payment_option() throws Throwable {
    
    
}

@When("^User click the confirm my order button $")
public void user_click_the_confirm_my_order_button() throws Throwable {
    
    
}

@When("^signout$")
public void signout() throws Throwable {
    
    
}


}
