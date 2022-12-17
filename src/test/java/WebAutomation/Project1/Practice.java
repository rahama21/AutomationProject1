package WebAutomation.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Practice  extends BrowserConfig{
	@Test (priority = 0)
	
	public void openUrl() {
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		
	}
	@Test (priority = 1)
	
	public void TextArea() throws InterruptedException {
		
		WebElement name 	=driver.findElement(By.id("name"));
		WebElement mobile 	=driver.findElement(By.id("phone"));
		WebElement email	=driver.findElement(By.id("email"));
		WebElement password	=driver.findElement(By.id("password"));
		WebElement adress	=driver.findElement(By.id("address"));
		WebElement submit	=driver.findElement(By.name("submit"));
		
		
		
		name.sendKeys("Enid");
		mobile.sendKeys("12345678901");
		email.sendKeys("enid@gmail.com");
		password.sendKeys("enid123456");
		adress.sendKeys("Dhaka, Bangladesh");
		Thread.sleep(4000);
		submit.click();
		Thread.sleep(4000);
		
		
	}
	@Test(priority = 2)
	
	
	public void checkBoxradioButton() throws InterruptedException {
		
		
		WebElement gender 	= 		driver.findElement(By.id("female"));
		WebElement day1 	= 		driver.findElement(By.id("tuesday"));
		WebElement day2 	= 		driver.findElement(By.id("sunday"));
		WebElement experience = 	driver.findElement(By.xpath("//label[contains(text(),'1 year')]"));
		WebElement tools =driver.findElement(By.xpath("//label[contains(text(),'TestNG')]"));
		
		gender.click();
		day1.click();
		day2.click();
		experience.click();
		tools.click();
		Thread.sleep(5000);
		
	}
	@Test (priority = 3)
	public void DropDown() throws InterruptedException {
		
		WebElement travel = driver.findElement(By.xpath("//body/div[1]/div[4]/div[2]/div[1]/select[1]"));
		
		Select select = new Select(travel);
		select.selectByIndex(8);
		Thread.sleep(4000);


	}

}
