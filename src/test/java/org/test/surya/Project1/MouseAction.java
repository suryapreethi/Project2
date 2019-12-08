package org.test.surya.Project1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseAction {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement beauty = driver.findElement(By.xpath("//span[text()='Beauty, Health & Daily Needs']"));
		Actions a = new Actions(driver);
		a.doubleClick(beauty).perform();
		Thread.sleep(3000);
		WebElement skin = driver.findElement(By.xpath("//span[text()='Skin Care']"));
		skin.click();
		Robot r = new Robot();
		WebElement search = driver.findElement(By.id("inputValEnter"));
		search.sendKeys("Earring");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
