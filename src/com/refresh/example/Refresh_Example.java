package com.refresh.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Refresh_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikrant Nandan\\Desktop\\SQT\\Selenium WebDriver"
				+ "\\Selenium Drivers\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://jqueryui.com");
		driver.get("http://www.google.com");
		
		Thread.sleep(5000);
		
		 Actions oAction=new Actions(driver);
		 oAction.sendKeys(Keys.F5).perform();
		 
		 System.out.println("performed");
		 
		 WebElement element = driver.findElement(By.cssSelector("#gbwa > div.gb_Mc > a"));
				 
		 Actions oAction1=new Actions(driver);
		 oAction1.clickAndHold(element).release().build().perform();
		 
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("alert('Click and Hold operation Done');");

	}

}
