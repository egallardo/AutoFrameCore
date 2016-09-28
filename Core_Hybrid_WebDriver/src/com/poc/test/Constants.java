package com.poc.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Constants {
	
	
	public static String TEST_SUITE_SHEET="Test Suite";
	public static String Test_Suite_ID="TSID";
	public static String RUNMODE_YES="Y";
	public static String TEST_CASES_SHEET="Test Cases";
	public static String RUNMODE = "Runmode";
	public static String TCID="TCID";
	public static String TEST_STEPS_SHEET="Test Steps";
	public static String KEYWORD="Keyword";
	public static String KEYWORD_PASS="PASS";
	public static String KEYWORD_FAIL="FAIL";
	public static String RESULT="Result";
	public static String KEYWORD_SKIP="SKIP";
	public static String DATA="Data";
	public static String OBJECT="Object";
	public static String DATA_START_COL="col";
	public static String DATA_SPLIT="\\|";
	public static Object POSITIVE_DATA="Y";
	public static Object RANDOM_VALUE="Random_Value";
	public static String CONFIG="config";
	public static final String SUITE_ID = "TSID";
	public static final String DESCRIPTION = "Description";

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
