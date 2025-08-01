package com.anhtester.projects.website.cms.pages;

import org.openqa.selenium.By;

import static com.anhtester.keywords.WebUI.*;

public class CommonPageCMS {

    private By Dashboard = By.xpath("//h1[normalize-space()=\"Dashboard\"]");

    public void verifyDashboardPageDisplays() {
        waitForPageLoaded();
        verifyContains(getCurrentUrl(), "/admin", "The URL not match.");
        verifyElementPresent(Dashboard, 5, "Login failed. The Dashboard page not displays.");
    }

}
