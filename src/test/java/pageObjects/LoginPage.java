package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By username = By.name("username");
	
	private By pswd = By.name("password");
	 
	private By logIn = By.xpath("//button[text()=' Login ']");
	
	public void userLogIn(String user, String password) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(pswd).sendKeys(password);
		driver.findElement(logIn).click();
	}

}
