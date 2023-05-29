package com.tetonshop.report;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ExtentReportsWithTestNG {

	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	@Test
	public void AboutUs() {
		test = extent.createTest("Verify Launch Browser")
				.assignAuthor("Bharath")
				.assignCategory("smoke")
				.assignDevice("Desktop_chrome");
		test.log(Status.PASS, "Browser lunched");
		test.pass("Browser launched successfully");
		test.info("Displaying Page");
	}
	
	@Test
	public void Products() {
		test = extent.createTest("Verify user able to login with valid cred.")
				.assignAuthor("Kumar")
				.assignCategory("sanity")
				.assignDevice("Desktop_chrome");
		test.info("Enter valid credentials");
		test.pass("user logged in successfully");
		test.warning("Reset password after first login");
	}
	
	@Test
	public void FAQ() {
		test = extent.createTest("Verify user able to reach home screen")
				.assignAuthor("Kumar")
				.assignCategory("regression")
				.assignDevice("Desktop_chrome");
		test.skip("Unable to load home screen");
		test.info("Displaying Page");
	}
	
	@Test
	public void Contact() {
		test = extent.createTest("Verify user navigate all screens")
				.assignAuthor("BBK")
				.assignCategory("regression")
				.assignDevice("Desktop_chrome");
		test.fail("User unable to navigate all screens");
		test.info("Displaying Page");
	}
	
	@Test
	public void Login() {
		test = extent.createTest("Verify user able to click on logout button")
				.assignAuthor("BBK")
				.assignCategory("regression")
				.assignDevice("Desktop_chrome");
		test.pass("User able to click on logout button and it's loading");
		test.info("Displaying Page");
	}
	
	@Test
	public void Register() {
		test = extent.createTest("Verify user able to logged out successfully")
				.assignAuthor("BBK1")
				.assignCategory("regression")
				.assignDevice("Desktop_chrome");
		test.fail("User unable to logout application is not responding");
		test.info("Displaying Page");;
	}
	
	@Test
	public void ResetPassword() {
		test = extent.createTest("Verify user able to logged out successfully")
				.assignAuthor("BBK1")
				.assignCategory("regression")
				.assignDevice("Desktop_chrome");
		test.fail("User unable to logout application is not responding");
		test.info("Displaying Page");;
	}
	
	@Test
	public void ProductsAdd_DeleteCart() {
		test = extent.createTest("Verify user able to ProductsAdd_DeleteCart Successfully")
				.assignAuthor("Mitul")
				.assignCategory("Functionality Testing")
				.assignDevice("Desktop_chrome");
		test.fail("User unable to checkout selected items and after it is not responding");
		test.info("Displaying Page");
	}
	
	@BeforeTest
	public void beforeTest() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("ExtentReport.html");
		extent.attachReporter(spark);
	}

	@AfterTest
	public void afterTest() {
		extent.flush();
	}

}