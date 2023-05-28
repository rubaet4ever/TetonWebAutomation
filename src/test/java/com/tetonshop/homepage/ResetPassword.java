package com.tetonshop.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPassword {
	
	public static void createResetPasswordTest(WebDriver driver) {
		// TODO Auto-generated method stub
		try {

			driver.findElement(By.xpath("//a[contains(@href, 'https://shop.tetonelectronics.com/login')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@href, 'https://shop.tetonelectronics.com/password/reset')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("johnsmithgmail.com");//wrong email
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[2]/button")).click();
			Thread.sleep(2000);
		
		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();

		}
	}
}
