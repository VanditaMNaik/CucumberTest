package com.anhtester.hooks;



import com.anhtester.driver.DriverManager;
import com.anhtester.driver.TargetFactory;
import com.anhtester.projects.website.cms.pages.CatalogPage;
import com.anhtester.projects.website.cms.pages.CommonPageCMS;
import com.anhtester.projects.website.cms.pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;

public class TestContext {

    private WebDriver driver;

    public TestContext() {
        driver = ThreadGuard.protect(new TargetFactory().createInstance());
        driver.manage().window().maximize();
        DriverManager.setDriver(driver);
    }

    private LoginPage loginPage;
    private CommonPageCMS commonPageCMS;
    private CatalogPage catalogpage;

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public CommonPageCMS getCommonPage() {
        if (commonPageCMS == null) {
            commonPageCMS = new CommonPageCMS();
        }
        return commonPageCMS;
    }
    
    public CatalogPage getCatalogPage() {
        if (catalogpage == null) {
            catalogpage = new CatalogPage();
        }
        return catalogpage;
    }

    public WebDriver getDriver() {
        return DriverManager.getDriver();
    }

}
