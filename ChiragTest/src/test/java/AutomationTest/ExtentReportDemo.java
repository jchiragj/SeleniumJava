package AutomationTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo {

	WebDriver driver = null;
	ExtentReports extent = null;
	ExtentHtmlReporter htmlReporter;
	@BeforeSuite
	public void setuptest() {
		htmlReporter = new ExtentHtmlReporter("extent.html");
		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void GoogleSearch1() throws IOException {
		ExtentTest test1 = extent.createTest("GoogleSearch", "Outcome");
		
		// log(Status, details)
        test1.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test1.info("This step shows openinng of Google webpage");
        
        // log with snapshot
     
		driver.get("http://google.com");
		  test1.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test1.addScreenCaptureFromPath("screenshot.png");
	        
	        test1.log(Status.INFO, "This step is finiding serchboc and typing");
		WebElement SearchField = driver.findElement(By.xpath("//input[@name='q']"));
		SearchField.sendKeys("This is Search Test");
		 test1.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test1.addScreenCaptureFromPath("screenshot.png");
	    
	}
	
	@Test
	public void GoogleSearch2() throws IOException {
		ExtentTest test1 = extent.createTest("GoogleSearch", "Outcome");
		
		// log(Status, details)
        test1.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test1.info("This step shows openinng of Google webpage");
        
        // log with snapshot
     
		driver.get("http://google.com");
		  test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test1.addScreenCaptureFromPath("screenshot.png");
	        
	        test1.log(Status.INFO, "This step is finiding serchboc and typing");
		WebElement SearchField = driver.findElement(By.xpath("//input[@name='q']"));
		SearchField.sendKeys("This is Search Test");
		 test1.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test1.addScreenCaptureFromPath("screenshot.png");
	    
	}


	@AfterSuite
	public void tesrDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
		extent.flush();
	}



}
