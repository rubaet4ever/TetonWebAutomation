package com.tetonshop.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsAdd_DeleteCart {
	
	public static void createProductsAdd_DeleteCart(WebDriver driver) {
		// TODO Auto-generated method stub
		try {

			driver.findElement(By.xpath("//a[contains(@href, 'https://shop.tetonelectronics.com/shop')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//section/div/div[2]/div/div/div/a/img")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='addToCart']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span/img")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='addToCart']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(@href, 'https://shop.tetonelectronics.com/shop')]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//div/div[2]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[2]/div[2]/div/div/a/img")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form/div/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//form/div/span")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//form/div/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form/div/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[3]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(@href, '#')])[14]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(@href, 'https://shop.tetonelectronics.com/shop')]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//div[6]/div/div/a/img")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form/div/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[3]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(@href, 'https://shop.tetonelectronics.com/carts')])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tr[@id='single-917']/td[6]/a/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='addToCart']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(@href, 'https://shop.tetonelectronics.com')])[4]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//img[@alt='Teton Smart Scale (Bluetooth)']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label/div/div/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span/img")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='addToCart']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(@href, 'https://shop.tetonelectronics.com')])[4]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//div[@id='sticky-header']/div/div/div/div[2]/nav/div[2]/div[3]/ul/li[2]/a/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form/button")).click();
			Thread.sleep(2000);
			
//			driver.findElement(By.xpath("//tr[5]/td[6]/a/i")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//tr[3]/td[6]/a/i")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//tr[1]/td[6]/a/i")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//tr[2]/td[6]/a/i")).click();
//			Thread.sleep(2000);
//			//driver.findElement(By.xpath("//tr[4]/td[6]/a/i")).click();
//			//Thread.sleep(2000);
//			//driver.findElement(By.xpath("//div[@id='sticky-header']/div/div/div/div[2]/nav/div[2]/div[3]/ul/li[2]/a/span")).click();
//			//Thread.sleep(2000);
//			//driver.findElement(By.xpath("//form/button")).click();
//			//Thread.sleep(2000);
//			driver.findElement(By.xpath("(//a[contains(@href, 'https://shop.tetonelectronics.com')])[4]")).click();
//			Thread.sleep(2000);


		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();

		}

	}
	
	}

