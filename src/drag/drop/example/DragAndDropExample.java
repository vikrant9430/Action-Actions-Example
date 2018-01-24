package drag.drop.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikrant Nandan\\Desktop\\SQT\\Selenium WebDriver"
				+ "\\Selenium Drivers\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement drag = driver.findElement(By.cssSelector("#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("#droppable"));
		
		Actions oaction = new Actions(driver); 
		oaction.dragAndDrop(drag, drop).perform();
		System.out.println("Performed");
		
		
		}
	}


