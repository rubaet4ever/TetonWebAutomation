package com.tetonshop.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contact {
	
	public static void createContactTest(WebDriver driver) {
		// TODO Auto-generated method stub
		try {

			driver.findElement(By.xpath("//a[contains(@href, 'https://shop.tetonelectronics.com/contact')]")).click();
			Thread.sleep(2000);

		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();

		}
	}
}


