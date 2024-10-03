package adminpanelscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminProfile {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		AdminReports reportsobj= new AdminReports();
		driver=reportsobj.reports();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[@id='personname']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Edit Profile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='FirstName'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='FirstName'])[1]")).sendKeys("Mahendran");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='personname']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Logout'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='YES']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
