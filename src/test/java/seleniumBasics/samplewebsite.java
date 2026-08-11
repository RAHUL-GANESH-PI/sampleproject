package seleniumBasics;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class samplewebsite {

	@Test
	public void mainScreenSearch() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		WebDriver chrome = new ChromeDriver(options);
		chrome.get("https://toolsqa.com");
		System.out.println("Window size: " + chrome.manage().window().getSize());
		System.out.println("Elements found: " + chrome.findElements(By.name("keyword")).size());
		List<WebElement> keywordInputs = chrome.findElements(By.name("keyword"));
		for (WebElement el : keywordInputs) {
			if (el.isDisplayed()) {
				el.sendKeys("Playwright", Keys.ENTER);
				break;
			}
		}
		chrome.quit();
	}
}
