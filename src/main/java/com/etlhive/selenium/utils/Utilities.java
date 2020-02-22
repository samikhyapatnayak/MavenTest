package com.etlhive.selenium.utils;

import java.io.File;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

public class Utilities {
	WebDriver driver;
	public boolean clicksafelyOn(WebElement ele) {
		
		try {
			
				
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
		//For Assert
		return true;
		
		}catch(TimeoutException ex) {
			//ex.printStackTrace(); //show the issues found in Log
			//To handle this exception use the below code so that it waits for 20 secs more
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.click();
			
 		}catch(NoSuchElementException e) {
 			System.out.println("Element is not present on the page");
 			return false;
 		//When we don't know which kind of exception will come; To handle any kind of Exception use the below 
 		//but we don't use it then we have to handle all the exception only one way.
 		//So, we write different exceptions to handle different scenarios
 		//In case we are using this then use it at the very bottom, is should always be the last catch but execution happens in sequence
 		//So, if catch(Exception a) is written first then the other catchs won't be executed and all exceptions will be handled one way
 		}catch(Exception a) {
 			a.printStackTrace();
 			return false;
 		//If there are no exception but some other error then to print that we write finally() block. This block gets always executed.
 		}finally{
 			
 		}
		return false;
		
	}
	public boolean SendValue(WebElement ele,String text)
	{
		try {
			ele.sendKeys(text);
			return true;
		}catch(TimeoutException ex) {
			ex.printStackTrace(); //show the issues found in Log
			return false;
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element is not present on the page");
			return false;
		}
		catch(Exception a) {
			a.printStackTrace();
			return false;
		}
		
	}
}

