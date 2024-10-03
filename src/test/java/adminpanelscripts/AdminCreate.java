package adminpanelscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminCreate {
	static WebDriver driver; 

	public WebDriver create() throws InterruptedException {
		AdminTransactionDetails transactionobj = new AdminTransactionDetails();
		driver = transactionobj.transactiondetails();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//span[text()='Create ']")).click();
		Thread.sleep(2000);

		//Bank Branch 
		driver.findElement(By.xpath("//a[text()=' Bank Branch ']")).click();
		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		//		Thread.sleep(2000);
		//		driver.navigate().refresh();
		//		driver.findElement(By.xpath("//mat-select[@id='state_name']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//input[@id='input']")).sendKeys("Tamil Nadu");
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//mat-select[@id='district_name']")).click();
		//		Thread.sleep(2000);
		//		WebElement districtname= driver.findElement(By.xpath("//span[text()=' KARUR ']"));
		//		Thread.sleep(2000);
		//		js.executeScript("arguments[0].scrollIntoView();", districtname);
		//		Thread.sleep(2000);
		//		districtname.click();
		//		driver.findElement(By.xpath("//mat-select[@id='bank_agency']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//span[text()=' COMMERCIAL ']")).click();
		//		
		//		driver.findElement(By.xpath("//mat-select[@id='bank']")).click();
		//		Thread.sleep(2000);
		//		WebElement bankname= driver.findElement(By.xpath("//span[text()=' INDIAN BANK ']"));
		//		js.executeScript("arguments[0].scrollIntoView();", bankname);
		//		bankname.click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//input[@id='brancH_NAME']")).sendKeys("KARUR");
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//input[@id='ifsC_CODE']")).sendKeys("IDFB000K017");
		//		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Submit']")).click();

		//panchyat
		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//a[text()=' Panchayat ']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		//		Thread.sleep(2000);
		//		driver.navigate().refresh();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//mat-select[@id='state_name']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//input[@id='input']")).sendKeys("Tamil Nadu");
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//mat-select[@id='district_name']")).click();
		//		Thread.sleep(2000);
		//		WebElement panchyatdistrictname= driver.findElement(By.xpath("//span[text()=' KARUR ']"));
		//		Thread.sleep(2000);
		//		js.executeScript("arguments[0].scrollIntoView();", panchyatdistrictname);
		//		Thread.sleep(2000);
		//		panchyatdistrictname.click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//mat-select[@id='block_name']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//span[text()=' KARUR']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//input[@id=' village_panchayat_name']")).sendKeys("Rayanoor");
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//input[@id='village_name']")).sendKeys("Anna Nagar");
		//		Thread.sleep(2000);
		//		//driver.findElement(By.xpath("//span[text()='Submit']")).click();
		//
		//		//village 
		//		driver.findElement(By.xpath("//span[text()='Create ']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//a[text()=' Village ']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		//		Thread.sleep(2000);
		//		driver.navigate().refresh();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//mat-select[@id='state_name']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//input[@id='input']")).sendKeys("Tamil Nadu");
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//mat-select[@id='district_name']")).click();
		//		Thread.sleep(2000);
		//		WebElement villagedistrictname= driver.findElement(By.xpath("//span[text()=' KARUR ']"));
		//		Thread.sleep(2000);
		//		js.executeScript("arguments[0].scrollIntoView();", villagedistrictname);
		//		Thread.sleep(2000);
		//		villagedistrictname.click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//mat-select[@id='block_name']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//span[text()=' KARUR']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//mat-select[@id='village_panchayat_name']")).click();
		//		Thread.sleep(2000);
		//		//driver.findElement(By.xpath("//input[@id='input']")).sendKeys("Rayanoor");
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//span[text()=' RAYANOOR']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//input[@id='village_name']")).sendKeys("Anna Nagar");
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		return driver;



	}

}
