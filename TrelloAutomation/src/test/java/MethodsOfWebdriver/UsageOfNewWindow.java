package MethodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNewWindow {

	public static void main(String[] args) throws InterruptedException {
		 //Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//maximize the browser window
		driver.manage().window().maximize();
		//pass the main URL of the app
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//create a new window upon the same object reference.
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.instagram.com/");
		//close the instagram window
		Thread.sleep(2000);
    	driver.close();
		//post-condition
		//this will terminate the session completely
		// this method will all the windows irrespective of which window is under driver control.
		driver.quit();
	}

}
