package seleniumBasics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getTitleTest {

	@Test
	void viewChromeBrowser() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.netflix.com/in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		assertEquals("https://www.netflix.com/in/", driver.getCurrentUrl());
		driver.quit();
	}
}
