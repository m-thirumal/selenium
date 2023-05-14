/**
 * 
 */
package com.enkindle;

import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * @author thirumal
 *
 */
public class CommonListener implements ITestListener {


	public void onTestStart(ITestResult result) {
	   System.out.println("test start in listener");
	}
	
}
