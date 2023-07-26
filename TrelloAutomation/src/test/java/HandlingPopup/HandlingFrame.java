package HandlingPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/E%20SUBRAMANYAM/OneDrive/Desktop/page.html");
		driver.findElement(By.id("d1")).sendKeys("a");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("d2")).sendKeys("b");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("d1")).sendKeys("c");
		
		
		

	}

}
