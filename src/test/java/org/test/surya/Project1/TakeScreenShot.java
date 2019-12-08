package org.test.surya.Project1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		TakesScreenshot tk = (TakesScreenshot)driver;
		File sourcefile = tk.getScreenshotAs(OutputType.FILE);
		File destination = new File("D://sample.png");
		FileUtils.copyFile(sourcefile, destination);
	
		
		

	}

}
