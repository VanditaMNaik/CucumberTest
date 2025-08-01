package com.anhtester.projects.website.cms.pages;

import org.openqa.selenium.By;

import com.anhtester.keywords.WebUI;

public class CatalogPage {

	
public By CatalogDash=By.xpath("//p[normalize-space()=\"Catalog\"]");
public By Products=By.xpath("//ul[@class=\"nav nav-treeview\"]/descendant::p[normalize-space()=\"Products\"]");
public By ProductName=By.xpath("//input[@id=\"SearchProductName\"]");
public By SKU=By.xpath("//input[@name=\"GoDirectlyToSku\"]");
public By SearchBtn=By.xpath("//button[@id=\"search-products\"]");


public void  catalogdashboard()
{
	WebUI.clickElement(CatalogDash);
}
public void productClick()
{
	WebUI.clickElement(Products);
}
public void productandsku(String prodName,String SKUname)
{
	WebUI.setText(ProductName, prodName);
	WebUI.setText(SKU, SKUname);
}
public void Searchbtn()
{
	WebUI.clickElement(SearchBtn);
}














}
