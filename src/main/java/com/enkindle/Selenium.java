/**
 * 
 */
package com.enkindle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Thirumal
 *
 */
public class Selenium {

	static Browser browser =  Browser.FIREFOX;
	static WebDriver driver;
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		if (Browser.FIREFOX.equals(browser)) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (Browser.CHROME.equals(browser)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Browser.EDGE.equals(browser)) {
			driver = new EdgeDriver();
			WebDriverManager.edgedriver().setup();
		} else {
			throw new Exception("The requested bowser test is not implemented");
		}
		driver.get("https://google.com");
		//
		driver.manage().window().maximize();
		driver.close();
	}

}
