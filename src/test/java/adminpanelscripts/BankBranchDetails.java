package adminpanelscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BankBranchDetails {
	public static WebDriver driver;

	public WebDriver bankbranch() throws InterruptedException {
		AdminIaDetails iadetailsobj = new AdminIaDetails();
		driver= iadetailsobj.iadetails();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("//span[text()='Bank Branch Details ']")).click();
		Thread.sleep(3000);
		
		//By username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SBIN0000001");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		
		//By usertype userlevel
		driver.findElement(By.xpath("//mat-select[@id='stakeholderName']")).click();
		Thread.sleep(2000);
		WebElement usertype= driver.findElement(By.xpath("//span[text()=' BANKS ']"));
		js.executeScript("arguments[0].scrollIntoView;", usertype);
		usertype.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id='userLevel']")).click();
		WebElement userlevel=  driver.findElement(By.xpath("//span[text()=' BRANCH ']"));
		js.executeScript("arguments[0].scrollIntoView;", userlevel);
		userlevel.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		return driver;
		
		
		

	}

}
