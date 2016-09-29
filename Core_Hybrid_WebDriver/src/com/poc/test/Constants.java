package com.poc.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Constants {
	
	//Login WebElements
	public static WebElement j_username;
	public static WebElement j_password;
	public static WebElement logon_button;

	//Main Menu WenElements
	public static WebElement ui_menu_addPfsCompany;
	public static WebElement ui_menu;

	@SuppressWarnings("unused")
	public void loadLoginWebElments(WebDriver driver){
		j_username = driver.findElement(By.xpath("//*[@id='login_content']/table[2]/tbody/tr[1]/td[2]/input"));
		j_password = driver.findElement(By.xpath("//*[@id='login_content']/table[2]/tbody/tr[2]/td[2]/input"));
		logon_button = driver.findElement(By.xpath("//*[@id='login_content']/table[4]/tbody/tr/td/input"));
	}
	
	public void loadMenuWebElments(WebDriver driver){
		ui_menu_addPfsCompany = driver.findElement(By.xpath("//*[@id='layoutFormID:menuBarID']/ul/li[1]/ul/li[4]/a/span"));
		ui_menu = driver.findElement(By.xpath("//*[@id='layoutFormID:menuBarID']/ul/li[1]/a/span[2]"));
	}
}
