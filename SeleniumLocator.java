package task19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.guvi.in/register");

		driver.findElement(By.id("name")).sendKeys("Name");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testuser@test.com");
		driver.findElement(By.xpath("//input[contains(@class,'password-err')]")).sendKeys("Test@123");
		driver.findElement(By.cssSelector("input[id='mobileNumber']")).sendKeys("9876543210");
		driver.findElement(By.id("signup-btn")).click();

		//driver.close();
	}

}

Output:
May 26, 2024 8:41:13 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 125, returning the closest version; found: 122; Please update to a Selenium version that supports CDP version 125

