package right.click;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikrant Nandan\\Desktop\\SQT\\"
				+ "Selenium WebDriver\\Selenium Drivers\\Browser Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		WebElement link = driver.findElement(By.linkText("Facebook Lite"));
		
		Actions oAction=new Actions(driver);
        oAction.contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
        .sendKeys(Keys.RETURN).build().perform();


	}

}
