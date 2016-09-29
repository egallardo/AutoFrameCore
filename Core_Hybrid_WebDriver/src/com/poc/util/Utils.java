package com.poc.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.JavascriptExecutor;

public class Utils {
	/**
	 * 
	 * @param driver
	 * @return
	 * @author elmer.gallardo
	 * 
	 */
	public boolean waitForJSandJQueryToLoad(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		// wait for jQuery to load
		ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				try {
					return (Boolean) ((JavascriptExecutor) driver).executeScript("return jQuery.active").equals("0");
				}
				catch (Exception e) {
					// no jQuery present
					return true;
				}
			}
		};

		// wait for Javascript to load
		ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				return (Boolean) ((JavascriptExecutor) driver).executeScript("return document.readyState")
						.toString().equals("complete");
			}
		};

		return wait.until(jQueryLoad) && wait.until(jsLoad);
	}

	/**
	 * 
	 * @param Selector
	 * @param Value
	 * @param driver
	 * @return
	 * @throws IOException
	 * @throws TimeoutException
	 * 
	 * @author elmer.gallardo
	 */
	public JavascriptExecutor executejQuery(String Selector, String Value, WebDriver driver) throws IOException, TimeoutException {
		JavascriptExecutor js = null;
		if (driver instanceof JavascriptExecutor) {
			js = (JavascriptExecutor)driver;
		} // else throw...

		// later on...
		//fiNumberId_input
		//statusId_label
		js.executeScript("$('select[id*=\""+ Selector + "\"]').val(\""+Value+"\");");//.trigger(\"change\")

		return js;

	}

	/**
	 * 
	 * @return
	 */
	public static ExpectedCondition<Boolean> jQueryAJAXCallsHaveCompleted() {
		return new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				return (Boolean) ((JavascriptExecutor) driver).executeScript("return (window.jQuery != null) && (jQuery.active === 0);");
			}
		};

	}


	/**
	 * 
	 * @param driver
	 * @throws Exception
	 * 
	 * @author elmer.gallardo
	 */
	public void waitForPageToLoad(WebDriver driver) throws Exception {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript(
						"return      document.readyState").equals("complete");
			}
		};
		Wait<WebDriver> wait = new WebDriverWait(driver, 30);
		wait.until(expectation);
	}


	/**
	 * 
	 * @param dpdElement
	 * @param option
	 * @author elmer.gallardo
	 */

	public void setDropdownByValue(WebElement dpdElement, String option){
		Select dropdown= new Select(dpdElement);
		dropdown.selectByValue(option);
	}

	public JavascriptExecutor executejQuery2(String Selector, WebDriver driver) throws IOException, TimeoutException {
		JavascriptExecutor js = null;
		if (driver instanceof JavascriptExecutor) {
			js = (JavascriptExecutor)driver;
		} // else throw...

		// later on...
		//fiNumberId_input
		//statusId_label
		js.executeScript("$('select[class*=\""+ Selector + "\"]')\".trigger(\"click\"));");

		return js;

	}

	public WebDriver configureWebDriver(WebDriver driver, String browser){
		if (browser == "Firefox"){
			System.setProperty("webdriver.gecko.driver", "../Core_Hybrid_WebDriver/webdrivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}else if( browser == "Chrome"){
			System.setProperty("webdriver.chrome.driver", "../Core_Hybrid_WebDriver/webdrivers/chromedriver.exe");
			DesiredCapabilities caps = DesiredCapabilities.chrome();        
			driver = new ChromeDriver(caps);
		}
		return driver;
	}	

}

