package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.Auto_Baseclass.AutoBaseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.java.gl.Logo;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\cucumber\\feature", glue = "com.cucumber.stepdefinition",
tags= {"@test3"})


public class TestRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void browserlaunch() throws Throwable {
		driver = AutoBaseclass.browserlaunch("chrome");
	}

	@AfterClass
	public static void quit() {
		driver.quit();
	}
}
