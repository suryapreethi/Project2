package org.test.surya.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement email = driver.findElement(By.id("email"));
	js.executeScript("arguments[0].setAttribute('value', 'surya')",email);
	js.executeScript("return arguments[0].getAttribute('value')",email);	
	

	}

}
