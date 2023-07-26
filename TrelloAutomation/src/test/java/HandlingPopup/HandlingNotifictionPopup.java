package HandlingPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotifictionPopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		Thread.sleep(4000);
		WebDriver driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.close();

	}

}
