package ChiragTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverDemo {
		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Chirag\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("http://www.bbc.co.uk");
WebElement NewsClick = driver.findElements(By.linkText("News")).get(0);
 NewsClick.click();
	}
}