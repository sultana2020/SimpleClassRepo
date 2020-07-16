import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyJUnitClass {

	@Test
	public void test() {
		 
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().window().fullscreen();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.bbc.com/");

		System.out.println("***************************** page title using getTitle method ***********************");

		String siteTitle = driver.getTitle();
		System.out.println(siteTitle);

		System.out.println("***************************** title validation using if statement ***********************");

		if (siteTitle.equals(siteTitle)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}

		System.out.println(
				"***************************** title validation using switch statement ***********************");

		switch (siteTitle) {
		case "BBC - Homepage":
			System.out.println("Test passed");
			break;
		case "":
			System.out.println("Test failed");
			break;
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.close();
		driver.quit();
	
	}

}
