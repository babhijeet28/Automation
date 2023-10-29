package Abhijeet.SeleniumTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

		private WebDriver driver;
		
		private By emailField = By.xpath("//input[@name='email']");
		private By passwordField = By.xpath("//input[@name='password']");
		private By loginButton = By.xpath("//span[text()='Login']");
		
		public LoginPage(WebDriver driver) {
			this.driver=driver;
		}
		
		
		public void clickloginButton() {
			driver.findElement(loginButton).click();
		}

		public void enterEmail(String email) {
			driver.findElement(emailField).sendKeys(email);			
		}

		public void enterPassword(String password) {
			driver.findElement(passwordField).sendKeys(password);
			
		}
}
