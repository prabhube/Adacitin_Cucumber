package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BassClass.BassClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\prem\\eclipse-workspace\\Adactin_cucumber_pom\\src\\test\\java\\com\\feature\\Adactnpom.feature",
glue="com.stepdefinition")
public class RunnerClass {
	public static WebDriver driver;
	@BeforeClass
	public static void setup() {
		driver=BassClass.browserLaunch("chrome");
	}
}
