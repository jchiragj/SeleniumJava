package PagesProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglePage {

	WebDriver driver = null;
// identifying the elements
	By Google_Search = By.xpath("//input[@type='text'][@name='q']");
	By GoogleSearch_Submit = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");

	// constructor to pass the driver
	public GooglePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//perform google search
	public void googlebrowserlaunch() {
		driver.get("https://google.com");
		System.out.println("Browser Launched");
	}
	
	
	public void GoogleSearchEnter()
	{
		driver.findElement(Google_Search).sendKeys("I love my India");

	}

	//perform click on submit
	public void GoogleClickSubmit() 
	{
		driver.findElement(GoogleSearch_Submit).sendKeys(Keys.RETURN);
	}

}
