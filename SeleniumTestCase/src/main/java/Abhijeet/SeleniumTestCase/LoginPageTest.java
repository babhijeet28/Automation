package Abhijeet.SeleniumTestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {
		
	private WebDriver driver;
	private LoginPage loginPage;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webDriver.chrome.driver", "/SeleniumTestCase/src/main/java/Abhijeet/SeleniumTestCase/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gor-pathology.web.app/");
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
	}
	
	@Test
	public void testLogin() {
		loginPage.enterEmail("test@kennect.io");
		loginPage.enterPassword("Qwerty@1234");
		
		loginPage.clickloginButton();
	}
	
	@AfterMethod
	public void tearDown(WebDriver driver) {
		this.driver=driver;
		driver.quit();
	}
}
