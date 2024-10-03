package adminpanelscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminDelete {
	static WebDriver driver;

	public WebDriver delete() throws InterruptedException {
		AdminCreate createobj= new AdminCreate();
		driver = createobj.create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//span[text()='Delete ']")).click();
		Thread.sleep(2000);
		
		//group delete
		driver.findElement(By.xpath("//a[text()=' SHG / JLG Group ']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='state_name']")).click();
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
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='shpi']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' YESTEAM FOUNDATION ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='animatorname']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' MAHENDRAN V']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Submit']")).click();
//		Thread.sleep(2000);
//		WebElement scrolldown= driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
//		js.executeScript("arguments[0].scrollIntoView();", scrolldown);
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-2']")).click();
//		Thread.sleep(2000);
//		scrolldown.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[text()='YES']")).click();
		
		
		//member delete
		driver.findElement(By.xpath("//a[text()=' Member ']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='state_name']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='district_name']")).click();
//		Thread.sleep(2000);
//		WebElement memdistrictname= driver.findElement(By.xpath("//span[text()=' KARUR ']"));
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].scrollIntoView();", memdistrictname);
//		Thread.sleep(2000);
//		memdistrictname.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='shpi']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' YESTEAM FOUNDATION ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='animatorname']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' MAHENDRAN V ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Submit']")).click();
//		Thread.sleep(2000);
//		WebElement selecticon = driver.findElement(By.xpath("//button[@id='selectBtn']"));
//		js.executeScript("arguments[0].scrollIntoView();", selecticon);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[2]")).click();
//		Thread.sleep(3000);
//		selecticon.click();
//		WebElement finalsubmit=  driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
//		js.executeScript("arguments[0].scrollIntoView();", finalsubmit);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[10]")).click();
//		Thread.sleep(2000);
//		finalsubmit.click();
//		driver.findElement(By.xpath("//span[text()='NO']")).click();
		return driver;
		



	}

}
