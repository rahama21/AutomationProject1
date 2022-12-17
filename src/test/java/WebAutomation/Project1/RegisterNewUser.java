package WebAutomation.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterNewUser extends BrowserConfig {
	@Test (priority = 0)
	
	public void openUrl() {
		
		driver.get("https://itera-qa.azurewebsites.net/UserRegister/NewUser");
		driver.manage().window().maximize();
		
	}
	@Test (priority = 1)
	
	public void register() throws InterruptedException {
		
		WebElement firstName  		= driver.findElement(By.id("FirstName"));
		WebElement surName   		= driver.findElement(By.id("Surname"));
		WebElement ePost   	 		= driver.findElement(By.id("E_post"));
		WebElement mobile  			= driver.findElement(By.id("Mobile"));
		WebElement userName 		= driver.findElement(By.id("Username"));
		WebElement password 		= driver.findElement(By.id("Password"));
		WebElement confirm 			= driver.findElement(By.id("ConfirmPassword"));
		WebElement submit 			= driver.findElement(By.id("submit"));
		
		firstName.sendKeys("Enid");
		surName.sendKeys("Nevermore");
		ePost.sendKeys("taylor2356");
		mobile.sendKeys("1234567890");
		userName.sendKeys("EnidNevemore");
		password.sendKeys("enid123456");
		confirm.sendKeys("enid123456");
		Thread.sleep(2000);
		submit.submit();
		Thread.sleep(5000);
		
		
		
		
	}

}
