package com.anhtester.runners;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@Test
	@CucumberOptions(
	        features = "src/test/resources/features/Catalog.feature",
	        glue = {
	                "com.anhtester.projects.website.cms.stepdefinitions"
	        },
	        plugin = {
	                "com.anhtester.hooks.CucumberListener",
	                "pretty",
	                "html:target/cucumber-reports/TestRunnerLoginCMS.html",
	                "json:target/cucumber-reports/TestRunnerLoginCMS.json",
	                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
	                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	        },
	        monochrome = true,
	        tags = "@regression"
	)

	public class TestRunnerCatalogCMS extends AbstractTestNGCucumberTests {
	    @Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    
	}
}
