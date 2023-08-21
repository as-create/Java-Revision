package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	WebDriver driver;
	String u;
	String p;
	@Given("open the application {string}")
	public void open_the_application(String url) {
		// Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
	}

	@When("user gives valid cridentials {string} and {string}")
	public void user_gives_valid_cridentials_and(String user, String password) {
		// Write code here that turns the phrase above into concrete actions
		 u=user;
		 p=password;
		/*WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(user);
		WebElement pswd = driver.findElement(By.name("password"));
		pswd.sendKeys(password);
		WebElement logIn = driver.findElement(By.xpath("//button[text()=' Login ']"));
		logIn.click(); */
	}

	@Then("validate user is landed on dashboard {string} or {string}")
	public void validate_user_is_landed_on_dashboard(String text, String errormsg) {
		// Write code here that turns the phrase above into concrete actions
		if(u.equals("Admin") && p.equals("admin123")) 
		{
		WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		Assert.assertEquals(dashboard.getText(), text);
		}
		else
		{
		WebElement error=driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
		Assert.assertEquals(error.getText(), errormsg);
		}
		driver.quit();
	
	}

}
