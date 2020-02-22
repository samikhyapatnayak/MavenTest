package com.etlhive.selenium.commonlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.etlhive.selenium.utils.Utilities;

import com.etlhive.selenium.SeleniumProjects.GoogleTestP;

public class Register extends Utilities {

	@FindBy(linkText = "REGISTER")
	public WebElement Reg; 
	
	@FindBy(linkText = "SIGN-ON")
	public WebElement signon; 
	
	@FindBy(name = "firstName")
	public WebElement fn; 
		
	@FindBy(name = "lastName")
	public WebElement ln;
	
	@FindBy(name = "phone")
	public WebElement phn;
	
	@FindBy(id = "userName")
	public WebElement un;
	
	@FindBy(name = "address1")
	public WebElement ads1;
	
	@FindBy(name = "address2")
	public WebElement ads2;
	
	@FindBy(name = "city")
	public WebElement ct;
	
	@FindBy(name = "state")
	public WebElement st;
	
	@FindBy(name = "country")
	public WebElement cn;
	
	@FindBy(name = "postalCode")
	public WebElement pc;
	
	@FindBy(name = "email")
	public WebElement em;
	
	@FindBy(name = "password")
	public WebElement pwd;
	
	@FindBy(name = "confirmPassword")
	public WebElement cnpwd;
	
	@FindBy(name = "register")
	public WebElement regtsr;
	
	private WebDriver driver;
	
	public Register(WebDriver driver5) {
	//HomePage.java will consider the class as super to which it is calling, here the super class is GoogleTest
		super();
		this.driver = driver5;
		
		//to initialize the constructor then use WeElements
		PageFactory.initElements(driver,this);
	}
	public WebElement Submit;
	public boolean addFirstName(String text) {
		return(SendValue(fn, text));
		}	
		
	public boolean addLastName(String text) {
		return(SendValue(ln, text));
		}
}
