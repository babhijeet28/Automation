package Abhijeet.SeleniumTestCase;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PathalogyAppTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\SeleniumTestCase\\src\\main\\java\\Abhijeet\\SeleniumTestCase\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// 1.Open Login Page
		driver.get("https://gor-pathology.web.app/");

		WebElement usernameInput = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement loginButton = driver.findElement(By.xpath("//span[text()='Login']"));

		usernameInput.sendKeys("test@kennect.io");
		passwordInput.sendKeys("Qwerty@1234");
		loginButton.click();

		// 2.Home Page

		WebElement dashboard = driver.findElement(By.xpath("//span[text()='Dashboard']"));

		dashboard.click();

		WebElement web = driver.findElement(By.xpath("//div[text()='Dashboard']"));
		boolean bool = web.isDisplayed();
		assertEquals(true, bool);

		// 3.Cost Calculator for Blood Test

		WebElement tests = driver.findElement(By.xpath("//span[text()='Tests']"));

		tests.click();

		// 4.Adding Patients and Creating Tests
		WebElement addPatientTest = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(3000L);
		
		Actions action = new Actions(driver);
		action.moveToElement(addPatientTest).click().perform();
				
        WebElement nameField = driver
				.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[1]"));
		WebElement emailField = driver
				.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[2]"));
		WebElement phoneNumberField = driver.findElement(By.xpath("//input[@type='number']"));
		WebElement generateDetails = driver.findElement(By.xpath("(//span[text()='General Details'])[2]"));
		
		nameField.sendKeys("Abhijeet Bhalerao");
		emailField.sendKeys("abhijeet_bhalerao@icloud.com");
		phoneNumberField.sendKeys("9284342506");
		generateDetails.click();
		
		WebElement height = driver.findElement(By.xpath("//input[@name='height']"));
		WebElement weight = driver.findElement(By.xpath("//input[@name='weight']"));
		WebElement gender = driver.findElement(By.id("mui-component-select-gender"));
		WebElement age = driver.findElement(By.xpath("//input[@name='age']"));
		WebElement systolic = driver.findElement(By.xpath("//input[@name='systolic']"));
		WebElement diastolic = driver.findElement(By.xpath("//input[@name='diastolic']"));
		
		height.sendKeys("164");
		weight.sendKeys("60");
		gender.click();
		WebElement male = driver.findElement(By.xpath("//li[text()='Male']"));
		male.click();
		age.sendKeys("25");
		systolic.sendKeys("110");
		diastolic.sendKeys("70");
		
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		WebElement addTests = driver.findElement(By.xpath("(//span[text()='Add Tests'])[2]"));
		addTests.click();
		
		WebElement addTestsForPatients = driver.findElement(By.xpath("//input[@id='patient-test']"));
		addTestsForPatients.click();
		Thread.sleep(3000);
		addTestsForPatients.sendKeys("AFP");
		addTestsForPatients.sendKeys(Keys.ARROW_DOWN);
		addTestsForPatients.sendKeys(Keys.ENTER);
		WebElement selectLabs = driver.findElement(By.xpath("//input[@id='patient-tests-labs']"));
		selectLabs.click();
		Thread.sleep(3000);
		selectLabs.sendKeys("HEALTH");
		selectLabs.sendKeys(Keys.ARROW_DOWN);
		selectLabs.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement doctorWhoRecommended = driver.findElement(By.xpath("//input[@name='doctor_name']"));
		doctorWhoRecommended.click();
		Thread.sleep(3000);
		doctorWhoRecommended.sendKeys("Beans");
		doctorWhoRecommended.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement doctorCommision = driver.findElement(By.id("mui-component-select-doctor_commission"));
		doctorCommision.click();
		Thread.sleep(3000);
		WebElement percent = driver.findElement(By.xpath("//li[text()='10%']"));
		percent.click();
		Thread.sleep(3000);
		
		Actions b = new Actions(driver);
		b.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		WebElement addBox = driver.findElement(By.xpath("(//button[@type='button'])[9]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(addBox).click().perform();
		WebElement button = driver.findElement(By.xpath("(//div[@role='button'])[12]"));
		button.click();
		Thread.sleep(3000);
		WebElement testEquipment = driver.findElement(By.xpath("//li[text()='test equipment']"));
		testEquipment.click();
		Thread.sleep(3000);
		WebElement check = driver.findElement(By.xpath("//span[text()='check']"));
		check.click();
		Thread.sleep(3000);
		WebElement addPatient = driver.findElement(By.xpath("//span[text()='Add Patient']"));
		addPatient.click();
	}
}
