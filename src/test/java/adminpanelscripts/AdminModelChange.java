package adminpanelscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminModelChange {
	static WebDriver driver;

	public WebDriver modelchang() throws InterruptedException {
		AdminUnMapping unmappingobj = new AdminUnMapping();
		driver = unmappingobj.unmapping();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//span[text()='Model Change ']")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//mat-select[@id='state_name']")).click();
//		driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='district_name']")).click();
//		Thread.sleep(2000);
//		WebElement districtname= driver.findElement(By.xpath("//span[text()=' KARUR ']"));
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].scrollIntoView();", districtname);
//		Thread.sleep(2000);
//		districtname.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='ia']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' YESTEAM FOUNDATION ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='merchantID']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' MAHENDRAN V ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Submit']")).click();
//		Thread.sleep(2000);
//		WebElement newreq=	driver.findElement(By.xpath("//span[text()='New Request ']"));
//		js.executeScript("arguments[0].scrollIntoView();", newreq);
//		Thread.sleep(3000);
//		newreq.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//mat-select[@id='modelchanged']")).click();
//		Thread.sleep(3000);
//      driver.findElement(By.xpath("//span[text()=' Premium ']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='Change Model']")).click();
		return driver;
	}


}
