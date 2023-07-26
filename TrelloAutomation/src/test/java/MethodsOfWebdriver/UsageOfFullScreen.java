package MethodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfFullScreen {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nationalgeographic.com/environment");
		//Go to full screemode
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
		

	}

}
