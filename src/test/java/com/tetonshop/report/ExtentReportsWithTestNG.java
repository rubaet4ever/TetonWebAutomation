package com.tetonshop.report;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class ExtentReportsWithTestNG {

	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
	
	//public ExtentReports extent;
	//public ExtentSparkReporter spark;
	public ExtentTest test;
	
	public static void createExtentReportsWithTestNG(WebDriver driver) {
		// TODO Auto-generated method stub
		
		
	}
	
	@Test
	public void setUpTest(){
	ExtentTest Test = extent.createTest("Launch Browser and Website").assignAuthor("Mohammad").assignCategory("UI Test").assignDevice("Desktop_chrome");
	Test.log(Status.PASS,"Browser lunched");
	Test.pass("Browser launched successfully");
	test.info("Displaying Page");
	}
	
	@Test
	public void AboutUs() {
		test = extent.createTest("Verify About Us Menu Page")
				.assignAuthor("Rubaet")
				.assignCategory("Smoke Test")
				.assignDevice("Desktop_chrome");
		test.pass("About Us page is able to clickable");
		test.info("Displaying Page");
	}
	
	@Test
	public void Products() {
		test = extent.createTest("Verify Products Menu Page")
				.assignAuthor("Qaiyum")
				.assignCategory("Sanity Test")
				.assignDevice("Desktop_chrome");
		test.pass("Product page is able to clickable");
		test.info("Displaying Page");
	}
	
	@Test
	public void FAQ() {
		test = extent.createTest("Verify FAQ Menu Page")
				.assignAuthor("Mitul")
				.assignCategory("RE Test")
				.assignDevice("Desktop_chrome");
		test.pass("FAQ page is able to clickable");
		test.info("Displaying Page");
	}
	
	@Test
	public void Contact() {
		test = extent.createTest("Verify Contact Menu Page")
				.assignAuthor("John")
				.assignCategory("Smoke Test")
				.assignDevice("Desktop_chrome");
		test.pass("Contact page is able to clickable");
		test.info("Displaying Page");
	}
	
	@Test
	public void Login() {
		test = extent.createTest("Verify user unable to login with invalid credentials")
				.assignAuthor("Smith")
				.assignCategory("User Acceptance Testing")
				.assignDevice("Desktop_chrome");
		test.pass("User not able to login successfully");
		test.info("Displaying Page");
	}
	
	@Test
	public void Register() {
		test = extent.createTest("Verify user unable to register with invalid credentials")
				.assignAuthor("Robert")
				.assignCategory("Security Testing")
				.assignDevice("Desktop_chrome");
		test.pass("User unable to register to complete the application registration form");
		test.info("Displaying Page");;
	}
	
	@Test
	public void ResetPassword() {
		test = extent.createTest("Verify user unable to sent with invalid credentials")
				.assignAuthor("Carlo")
				.assignCategory("User Acceptance Testing")
				.assignDevice("Desktop_chrome");
		test.pass("User unable to reset passoword is not responding");
		test.warning("Reset password after first login credentials are invalid");
		test.info("Displaying Page");;
	}
	
	@Test
	public void ProductsAdd_DeleteCart() {
		test = extent.createTest("Verify user able to ProductsAdd_DeleteCart Successfully")
				.assignAuthor("Rian")
				.assignCategory("Functionality Testing")
				.assignDevice("Desktop_chrome");
		test.fail("User unable to checkout selected items and after it is not responding");
		test.info("Displaying Page");
	}
	
	@BeforeTest
	public void beforeTest() {
	
		extent.attachReporter(spark);
	}

	@AfterTest
	public void afterTest() {
		extent.flush();
	}

}