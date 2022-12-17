package WebAutomation.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserConfig {
	
	WebDriver driver ;
	@BeforeSuite
	public void Start() {
		
		String browser = System.getProperty("browswe","chrome");
		
		if (browser.contains("chrome")) {
			
			
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		} 
		
		else if (browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			
			
			
			
		} else {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		
	}
	
	@AfterSuite
	private void End() {
		driver.quit();
		
		
		
		
	}
	
	

}
