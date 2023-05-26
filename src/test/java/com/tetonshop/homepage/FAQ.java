package com.tetonshop.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FAQ {
	public static void createFAQTest(WebDriver driver) {
		// TODO Auto-generated method stub
		try {

			driver.findElement(By.xpath("//a[contains(@href, 'https://shop.tetonelectronics.com/faq')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@href, '#faq10')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@href, '#faq11')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@href, '#faq12')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@href, '#faq13')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@href, '#faq9')]")).click();
			Thread.sleep(2000);
			
			
			

		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();

		}

	}

}
