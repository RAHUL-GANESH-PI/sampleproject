package samplePackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	

	@Test
	void viewBrowser(){
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.netflix.com/in/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	assertEquals("https://www.netflix.com/in/",driver.getCurrentUrl());
	driver.close();
	}

}
