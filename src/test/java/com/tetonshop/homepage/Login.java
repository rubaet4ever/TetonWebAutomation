package com.tetonshop.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	public static void createLoginTest(WebDriver driver) {
		// TODO Auto-generated method stub
		try {

			driver.findElement(By.xpath("//a[contains(@href, 'https://shop.tetonelectronics.com/login')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("johnsmithgmail.com");//wrong email
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abc@123456789");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[4]/button")).click();
			Thread.sleep(2000);
			
		
		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();

		}

	}

}
