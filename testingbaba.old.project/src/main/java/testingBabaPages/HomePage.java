package testingBabaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {
		WebDriver driver = new ChromeDriver();
		
		@Test
		void launchBrowser() {
			driver.manage().window().maximize();
			driver.get("https://testingbaba.com/old/");
			System.out.println("automation validation successfully done");
		}
}
