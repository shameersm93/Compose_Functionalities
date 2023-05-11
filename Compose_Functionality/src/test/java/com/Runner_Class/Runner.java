package com.Runner_Class;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base_Class.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Lenovo\\eclipse-workspace\\Compose_Functionality\\src\\test\\java\\com\\Feature_File\\Compose.Feature" , 
				 glue= "com.Step_Definition")
public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void SetUp() {
		driver = BaseClass.browser("Chrome");
		
	}

}
