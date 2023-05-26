package com.tetonshop.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products {

	public static void createProductsTest(WebDriver driver) {
		// TODO Auto-generated method stub
		try {

			driver.findElement(By.xpath("//a[contains(@href, 'https://shop.tetonelectronics.com/shop')]")).click();
			Thread.sleep(2000);

		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();

		}

	}

}
