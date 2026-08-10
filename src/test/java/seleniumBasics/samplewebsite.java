package seleniumBasics;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class samplewebsite {

	@Test
	public void mainScreenSearch() {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--start-maximized");
		WebDriver chrome = new ChromeDriver(options);
		chrome.get("https://toolsqa.com");
		chrome.findElement(By.id("accept-cookie-policy")).click();
		chrome.findElement(By.className("navbar__search--input")).sendKeys("Playwright", Keys.ENTER);
	//	chrome.findElement(By.className("absolute")).click();
	}
}
