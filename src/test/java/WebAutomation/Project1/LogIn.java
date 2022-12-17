package WebAutomation.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogIn  extends BrowserConfig{
	@Test (priority = 0)
	
	public void openUrl() {
		
		driver.get("https://itera-qa.azurewebsites.net/Login");
		driver.manage().window().maximize();
		
	}
	
	@Test (priority = 1)
	public void signIn() throws InterruptedException {
		
		WebElement userName = 	driver.findElement(By.id("Username"));
		WebElement password = 	driver.findElement(By.id("Password"));
		WebElement LOGIN 	= 	driver.findElement(By.name("login"));
		
		
		userName.sendKeys("EnidNevemore");
		password.sendKeys("enid123456");
		
		Thread.sleep(3000);
		LOGIN.click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
	}
	
	

}
