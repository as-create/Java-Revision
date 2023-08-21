package reusable;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBase {
	
	WebDriver driver;
	
	@Test
	public void invokeDriver(WebDriver driver) throws Exception {
		String filePath="properties/demo.properties";
		
		Properties pr=new Properties();
		
		FileInputStream fileInput=new FileInputStream(filePath);
		
		pr.load(fileInput);
		
		String url=pr.getProperty("url");
		
		String s2=pr.getProperty("browser");
		
		System.out.println(url);
		System.out.println(s2);
		
		this.driver=driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
	}

}
