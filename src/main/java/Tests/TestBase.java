package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBase {
	public WebDriver driver;
	public String url;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void launchBrowser(String browser, String url) {
		System.out.println("Test");
		if (browser.equals("ch")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		if (browser.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else {
			System.out.println("browser not available");

		}
		this.url=url;
		driver.get(url);

	}

	
	@AfterClass
	public void closeBrowser() {

		//driver.quit();

	}

}
