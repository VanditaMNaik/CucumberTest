package com.anhtester.projects.website.cms.pages;

import org.openqa.selenium.By;

import com.anhtester.keywords.WebUI;

public class LoginPage {

    private By inputEmail = By.xpath("//input[@id=\"Email\"]");
    private By inputPassword = By.xpath("//input[@id=\"Password\"]");
    private By buttonLogin = By.xpath("//button[text()=\"Log in\"]");
//    private By buttonCopy = By.xpath("//button[normalize-space()='Copy']");

    public CommonPageCMS loginCMS(String email, String password) {
    	WebUI.clearText(inputEmail);
        WebUI.setText(inputEmail, email);
        WebUI.clearText(inputPassword);
        WebUI.setText(inputPassword, password);
        WebUI.clickElement(buttonLogin);

        return new CommonPageCMS();
    }
}
