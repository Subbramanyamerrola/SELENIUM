package HandlingScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollToBottom {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j= (JavascriptExecutor) driver;
		//scroll the bottom page
		j.executeScript("Window.scrollTo(0,document.body.scrollHeigh)");
		//scroll to top of the webpage
		j.executeScript("window.scrollTo(0,0)");

	}

}
