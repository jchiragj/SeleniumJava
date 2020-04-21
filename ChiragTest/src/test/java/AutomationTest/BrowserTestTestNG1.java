package AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTestTestNG1 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setuptest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void GoogleSearch1() {
		driver.get("http://google.com");
		WebElement SearchField = driver.findElement(By.xpath("//input[@name='q']"));
		SearchField.sendKeys("This is Search Test");
	}

	@AfterTest
	public void tesrDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}
}
	

