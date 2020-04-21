package Scenarios;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PagesProject.GooglePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScenario1 {
	WebDriver driver = null;

	@BeforeSuite
	public void startoftest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	
	public void actualgoogletest() {
		GooglePage page1 = new GooglePage(driver);
		//driver.get("https://google.com");
		page1.googlebrowserlaunch();
		page1.GoogleSearchEnter();
		page1.GoogleClickSubmit();
	}


	@AfterSuite
	public void aftertest() {
		driver.close();
		driver.quit();
	}




}
