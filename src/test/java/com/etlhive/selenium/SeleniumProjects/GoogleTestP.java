package com.etlhive.selenium.SeleniumProjects;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.etlhive.selenium.homepage.HomePage;

//Listeners annotation is written here to fetch its methods before @Test is run
@Listeners(ListenerTest.class)

public class GoogleTestP {
	

	//For TestNG, @Test annotation means this is the main function, start the execution from here
	//testng.xml is for batch execution
	
	//If dataProvider class is a separate class we want to import here then we also have to pass the class name as a parameter
	@Test(dataProvider="abc", dataProviderClass=DataProviderTest.class)
	
	public void f1(String url) throws InterruptedException, IOException
	{
	//public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		//To tell our script that we want to use Chrome browser, so set chrome driver path
		// we have to give \\ instead of \
		//webdriver is an interface which will be given method definitions from Chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samikhya\\eclipse-workspace\\Intro\\Driver\\chromedriver.exe");
		
		//So reference variable will be of Webdriver but object will be of ChromeDriver (Upcasting)
		WebDriver driver = new ChromeDriver();
		
		//to open an URL
		//driver.get("https://phptravels.com/demo");
		
		//For Data Provider
		driver.get(url);
		
		//use sleep so that we can view the web page but Thread.sleep should never be used but wait() methods should be
		//Thread.sleep(5000);
		//driver.close();
		
		HomePage hm = new HomePage(driver);
		hm.clickOnPhpLink();
		
		//Using Assert in Selenium
		//Assert.assertTrue("Clicking on registration link", hm.clickOnRegister());
//		
//		Register rg = new Register(driver);
//		//For first name and last name
//		Assert.assertTrue("Entering first name", rg.addFirstName("Samikhya"));
//		Assert.assertTrue("Entering first name", rg.addLastName("Patnayak"));
		driver.close();
	}
}