package com.Runner_Class;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base_Class.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Lenovo\\git\\ComposeEmail\\Compose_Functionality\\src\\test\\java\\com\\Feature_File\\Compose.feature" , 
				 glue= "com.Step_Definition")


public class Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void Setup() {
		driver = BaseClass.browser("Chrome");

	}
	
	}



