package adminpanelscripts;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminUnMapping {
	static WebDriver driver;

	public WebDriver unmapping() throws InterruptedException {
		AdminDelete deleteobj = new AdminDelete();
		driver= deleteobj.delete();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//span[text()='Unmapping ']")).click();
		driver.findElement(By.xpath("//mat-select[@id='state_name']")).click();
		driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id='district_name']")).click();
		Thread.sleep(2000);
		WebElement districtname= driver.findElement(By.xpath("//span[text()=' KARUR ']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", districtname);
		Thread.sleep(2000);
		districtname.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id='ia']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' YESTEAM FOUNDATION ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id='merchantID']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' MAHENDRAN V ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(2000);
		WebElement reqicon= driver.findElement(By.xpath("//span[text()=' New request ']"));
		js.executeScript("arguments[0].scrollIntoView();", reqicon);
		reqicon.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='NO']")).click();
		return driver;


	}

}
