package com.anhtester.projects.website.cms.stepdefinitions;


import com.anhtester.hooks.TestContext;
import com.anhtester.keywords.WebUI;
import com.anhtester.projects.website.cms.pages.CatalogPage;
import com.anhtester.projects.website.cms.pages.CommonPageCMS;
import com.anhtester.projects.website.cms.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogSteps {
	LoginPage loginPage;
	CatalogPage cp;
	CommonPageCMS commonPageCMS;

	public CatalogSteps(TestContext testContext) {
	        cp = testContext.getCatalogPage();


	   }

	   @Given("User navigate to Login Page for Admin {string}")
	    public void userNavigateToLoginPageForAdmin(String url) {
	        WebUI.openWebsite(url);
	    }

	    @When("user enter email {string} password {string}")
	    public void userEnterEmailPasswordAndClickLoginButton(String email, String password) {
	        commonPageCMS = loginPage.loginCMS(email, password);
	    }

	    @And("click Login button")
	    public void clickLoginButton() {
	    }

	    @Then("user is redirected to the Dashboard page")
	    public void userIsRedirectedToTheDashboardPage() {
	        commonPageCMS.verifyDashboardPageDisplays();
	    }

	    @When("User clicks on catalog")
	    	public void userclicksoncatalog()
	    	{
	    		cp.catalogdashboard();
	    	}
	    @Then("User clicks on products")
	    public void userclicksonproducts()
	    {
	    	cp.productClick();
	    }

	    @Then("Enters product name {string} and SKU {string}")
	    public void entersproductnameandsku(String prodName,String SKUname)
	    {
	    	cp.productandsku(prodName, SKUname);
	    }

	    @And("clicks on Search button")
	    public void clicksonsearchbutton()
	    {
	    	cp.Searchbtn();
	    }

}
