package com.etlhive.selenium.homepage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.etlhive.selenium.utils.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class HomePage extends Utilities {
	
	@FindBy(linkText = "REGISTER")
	public WebElement Reg; 
	
	@FindBy(linkText = "SIGN-ON")
	public WebElement signon; 
	
	@FindBy(css = "#Main > section.grey-box > div > div > div:nth-child(2) > div > div > div.col-md-9 > div.col-md-12 > div > div:nth-child(1) > div > a\r\n")
	public WebElement phpnetlink; 
	
	private WebDriver driver;
	
		public HomePage(WebDriver driver2) {
		//HomePage.java will consider the class as super to which it is calling, here the super class is GoogleTest
			super();
			this.driver = driver2;
			
			//to initialize the constructor then use WeElements
			PageFactory.initElements(driver,this);
		}
		
	    /*public void clickOnRegister() {
		// TODO Auto-generated method stub
		clicksafelyOn(Reg);
			}	*/
		
			//For Assert need to use boolean
		public boolean clickOnPhpLink() throws IOException {
			Reporter.log("clicking on abc");
			//For taking SS
			TakesScreenshot scrsht = ((TakesScreenshot)driver);
			File sourcefile = scrsht.getScreenshotAs(OutputType.FILE);
			File destinationfile = new File("C:\\Users\\Samikhya\\Maven_Workspace\\MavenTest\\Reports\\Screenshots\\test.png");
			FileUtils.copyFile(sourcefile, destinationfile);
		return(clicksafelyOn(phpnetlink));
		}	
		
			public boolean clickOnRegister() throws IOException {
				//For taking SS
			return(clicksafelyOn(Reg));
			}	
			
			public void clickOnSignon() {
				clicksafelyOn(signon);
			}
			
	}


