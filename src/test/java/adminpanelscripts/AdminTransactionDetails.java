package adminpanelscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminTransactionDetails {
	static WebDriver driver;
	

	public WebDriver transactiondetails() throws InterruptedException {
		AdminMerchantDetails merchantobj = new AdminMerchantDetails();
		driver=merchantobj.merchant();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//span[text()='Transaction Details ']")).click();
		Thread.sleep(2000);

		//without entering mandatory filed 
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]")).click();
		Thread.sleep(2000);
		WebElement exportexcel= driver.findElement(By.xpath("//span[text()=' Export to excel']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", exportexcel);
		return driver;
		
		
		
		
		

	}

}
