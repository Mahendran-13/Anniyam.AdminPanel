package adminpanelscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminSettings {
	static WebDriver driver;

	public WebDriver settings() throws InterruptedException {
		AdminModelChange modelchangeobj = new AdminModelChange();
		driver= modelchangeobj.modelchang();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Settings ']")).click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		Thread.sleep(2000);
		
		//group 
		driver.findElement(By.xpath("//a[text()=' Group ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Add New ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='groupname']")).sendKeys("Testing");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Submit']")).click();
		
		
		//Role
//		driver.findElement(By.xpath("//a[text()=' Role ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' Add New ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='groupname']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' Testing ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='rolename']")).sendKeys("Anniyam Designation");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(2000);
		
		//parent Menu
//		driver.findElement(By.xpath("//a[text()=' Parent Menu ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' Add New ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='groupname']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' Testing ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='parentMenuName']")).sendKeys("Junior Tester");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		
		//menu 
//		driver.findElement(By.xpath("//a[text()=' Menu ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' Add New ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='roleGroupName']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' Testing ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='parentMenuName']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' Junior Tester ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='masterMenuName']")).sendKeys("Test Method");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='navigationUrl']")).sendKeys("");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='iconName']")).click();
//		Thread.sleep(2000);
//		WebElement iconname= driver.findElement(By.xpath("(//span[@class='mat-option-text'])[9]"));
//		js.executeScript("arguments[0].scrollIntoView();", iconname);
//		Thread.sleep(2000);
//		iconname.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		
		//menu Order
//		driver.findElement(By.xpath("//a[text()=' Menu order ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='roleGroupId']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' Testing']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		return driver;
	}

}
