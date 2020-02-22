package com.etlhive.selenium.SeleniumProjects;

import org.testng.annotations.DataProvider;

public class DataProviderTest {
	//makes our method a Data Provider method
	@DataProvider(name="abc")
	//If we don't know which kind of object we are going to handle then return type should Object
	//For handling data in rows and columns write two dimensional array i.e. Object[][]
	public static Object[][] googleTest1() {
		//We haven't created any reference variable but need to create a new Object array each time
		//return new Object[][]{{"Samikhya", "patnayak", "8884344747", "s.p@gmail.com"},
		//						{"Paras", "Sharma", "8884344757", "p.s@gamil.com"}};
		
		return new Object[][] {{"http://phptravels.com/demo/"}};
	}
}
