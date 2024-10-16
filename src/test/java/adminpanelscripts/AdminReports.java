package adminpanelscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminReports {
	static WebDriver driver;

	public WebDriver reports() throws InterruptedException {
		AdminStatement statementobj= new AdminStatement();
		driver=statementobj.statement();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//span[text()='Reports ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' Group Count ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id='state_name']")).click();
		Thread.sleep(2000);
		//WebElement statename= driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']"));
		Thread.sleep(2000);
		//js.executeScript("arguments[0].scrollIntoView();", statename);
		Thread.sleep(2000);
		//statename.click();
		driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id='district_name']")).click();
		Thread.sleep(2000);
		WebElement districtname= driver.findElement(By.xpath("//span[text()=' KARUR ']"));
		js.executeScript("arguments[0].scrollIntoView();", districtname);
		districtname.click();
		driver.findElement(By.xpath("//mat-select[@id='name_of_SHPI']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' YESTEAM FOUNDATION ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		return driver;
		
		
	}

}
