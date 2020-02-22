package com.etlhive.selenium.SeleniumProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGFeature {
	
	
	@Test
	public void status() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samikhya\\eclipse-workspace\\Intro\\Driver\\chromedriver.exe");
		
		//So reference variable will be of Webdriver but object will be of ChromeDriver (Upcasting)
		WebDriver driver = new ChromeDriver();
		System.out.println("Status method is running");
		driver.quit();
	}
	
	@Test
	public void print() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samikhya\\eclipse-workspace\\Intro\\Driver\\chromedriver.exe");
		
		//So reference variable will be of Webdriver but object will be of ChromeDriver (Upcasting)
		WebDriver driver = new ChromeDriver();
		System.out.println("print method is running");
		driver.quit();
	}
	
	@Test
	public void check() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samikhya\\eclipse-workspace\\Intro\\Driver\\chromedriver.exe");
		
		//So reference variable will be of Webdriver but object will be of ChromeDriver (Upcasting)
		WebDriver driver = new ChromeDriver();
		System.out.println("check method is running");
		driver.quit();
	}
	
	@Test
	public void rest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samikhya\\eclipse-workspace\\Intro\\Driver\\chromedriver.exe");
		
		//So reference variable will be of Webdriver but object will be of ChromeDriver (Upcasting)
		WebDriver driver = new ChromeDriver();
		System.out.println("rest method is running");
		driver.quit();
	}
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samikhya\\eclipse-workspace\\Intro\\Driver\\chromedriver.exe");
		
		//So reference variable will be of Webdriver but object will be of ChromeDriver (Upcasting)
		WebDriver driver = new ChromeDriver();
		System.out.println("test method is running");
		driver.quit();
	}

}
