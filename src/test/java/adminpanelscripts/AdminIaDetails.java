package adminpanelscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminIaDetails {
	public static WebDriver driver;

	public WebDriver iadetails()  throws InterruptedException {
		AdminIaView iaviewobj = new AdminIaView();
		driver=iaviewobj.iaview();
//		driver.findElement(By.xpath("//span[text()='IA Details ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='state_name']")).click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement statename=  driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']"));
//		js.executeScript("arguments[0].scrollIntoView;", statename);
//		statename.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='district_name']")).click();
//		WebElement districtname= driver.findElement(By.xpath("//span[text()=' KARUR ']"));
//		js.executeScript("arguments[0].scrollIntoView;", districtname);
//		districtname.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id='name_of_SHPI']")).click();
//		WebElement ianame= driver.findElement(By.xpath("//span[text()=' NEW ']"));
//		js.executeScript("arguments[0].scrollIntoView;", ianame);
//		ianame.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@id='subBtn']")).click();
		return driver;
		
		

	}

}
