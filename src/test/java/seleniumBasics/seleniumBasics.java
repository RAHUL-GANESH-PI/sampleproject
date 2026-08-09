package seleniumBasics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumBasics {

	  @Test
	    void viewBrowser(){
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.netflix.com/in/");
	        System.out.println(driver.getTitle());
	        System.out.println(driver.getCurrentUrl());
	        assertEquals("https://www.netflix.com/in/", driver.getCurrentUrl());
	        driver.close();
	    }
}
