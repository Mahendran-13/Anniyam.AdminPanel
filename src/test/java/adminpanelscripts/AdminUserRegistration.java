package adminpanelscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminUserRegistration {
	private static WebDriver driver;

	public WebDriver userreg()throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		AdminLogin loginobj = new AdminLogin();
		driver=loginobj.login();

		Thread.sleep(6000);

		driver.findElement(By.xpath("//span[text()='User Registration ']")).click();
		
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("mahendran");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("V");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mahen13@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9876451230");
//		WebElement groupdropdown =driver.findElement(By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c53-11 ng-star-inserted']"));
//		groupdropdown.click();
//		driver.findElement(By.xpath("//span[text()=' Office Staffs']")).click();
//		WebElement roledropdown=driver.findElement(By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c53-13 ng-star-inserted']"));
//		roledropdown.click();
//		driver.findElement(By.xpath("//span[text()=' Support ']")).click();
//		WebElement menudropdown= driver.findElement(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-0']"));
//		menudropdown.click();
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement drop= driver.findElement(By.xpath("//mat-panel-title[text()=' Reports ']"));
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].scrollIntoView();", drop);
//		Thread.sleep(6000);
//
//		//driver.findElement(By.xpath("//span[text()='Register']")).click();
		return driver;



	}


}
