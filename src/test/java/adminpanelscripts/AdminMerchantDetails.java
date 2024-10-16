package adminpanelscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminMerchantDetails {
	static WebDriver driver;
	public WebDriver merchant() throws InterruptedException {
		BankBranchDetails bankbranchobj = new BankBranchDetails();
		driver= bankbranchobj.bankbranch();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//span[text()='Merchant Details ']")).click();
		Thread.sleep(3000);
		
		//without entering mandatory filed
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		//by select state and district
		driver.findElement(By.xpath("//mat-select[@id='state_name']")).click();
		WebElement statename= driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']"));
		js.executeScript("arguments[0].scrollIntoView;", statename);
		statename.click();
		driver.findElement(By.xpath("//mat-select[@id='district_name']")).click();
		WebElement districtname= driver.findElement(By.xpath("//span[text()=' KARUR ']"));
		js.executeScript("arguments[0].scrollIntoView;", districtname);
		districtname.click();
		driver.findElement(By.xpath("//mat-select[@id='ia']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' YESTEAM FOUNDATION ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id='merchantID']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' MAHENDRAN V ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");      // scroll bottom of the page
		
		//by using mobile number 
		driver.findElement(By.xpath("//input[@id='merchantID']")).sendKeys("9786094689");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		return driver;
		



	}

}
