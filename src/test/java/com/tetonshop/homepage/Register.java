package com.tetonshop.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
	
	public static void createRegisterTest(WebDriver driver) {
		// TODO Auto-generated method stub
		try {

			driver.findElement(By.xpath("//a[contains(@href, 'https://shop.tetonelectronics.com/login')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@href, 'https://shop.tetonelectronics.com/register')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div/input")).sendKeys("John Smith");//wrong name
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("johnsmithgmail.com");//wrong email
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[3]/div/input")).sendKeys("12345678901");//wrong number
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[4]/div/input")).sendKeys("ABC@12345678901");//wrong password
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[6]/button")).click();
			Thread.sleep(2000);
			
		
		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();

		}

	}

}
