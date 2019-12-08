package org.test.surya.Project1;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("8760778868");
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("2019");
	WebElement log = driver.findElement(By.xpath("//input[@value='Log In']"));
	log.click();
	
	
	
	
	
	
	
}
	
}
