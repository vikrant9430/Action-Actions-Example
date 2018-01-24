package drag.drop.example;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Send_Text_in_Capital_Letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikrant Nandan\\Desktop\\SQT\\Selenium WebDriver"
				+ "\\Selenium Drivers\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Opening the URL
		  driver.get("http://www.google.com");
		 
		 //Implicit wait for the browser to launch
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		//Google Search Text-box 
		  WebElement element =driver.findElement(By.cssSelector("#sb_ifc0"));
		  
		//Creating action class object
		        Actions oAction=new Actions(driver);
		        //Creating action collection to perform numerous methods on element
		        Actions moreActions = oAction
		           .moveToElement(element)
		           .click()
		           .keyDown(element,Keys.SHIFT) //for caps
		           .sendKeys(element,"selenium");
		        
		        Action enterInCaps= moreActions.build();
		        enterInCaps.perform();
		         System.out.println("Text is entered in Captial letters");

	}
	
	

}
