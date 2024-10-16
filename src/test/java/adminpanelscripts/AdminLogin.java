package adminpanelscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminLogin {

	public WebDriver login() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uatmpadmin.anniyam.in/#/admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//valiadating without entering username and password 
		WebElement	login =driver.findElement(By.xpath("//button[@id='loginvalue4']"));
		Thread.sleep(4000);
		login.click();
		driver.navigate().refresh();
		Thread.sleep(4000);

		//validating with valid username and invalid password 
		driver.findElement(By.xpath("//input[@id='loginvalue2']")).sendKeys("mahendran@anniyam.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mahendran");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='loginvalue4']")).click();
		driver.navigate().refresh();

		//validating with invalid user name and valid password 
		driver.findElement(By.xpath("//input[@id='loginvalue2']")).sendKeys("mahen@anniyam.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Anniyam@123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='loginvalue4']")).click();
		driver.navigate().refresh();

		//validating with invalid user and invalid password 
		driver.findElement(By.xpath("//input[@id='loginvalue2']")).sendKeys("mahen@anniyam.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Anniy@123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='loginvalue4']")).click();
		driver.navigate().refresh();
		
		//validating with valid user and valid password 
		driver.findElement(By.xpath("//input[@id='loginvalue2']")).sendKeys("mahendran@anniyam.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Anniyam@123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//mat-icon[text()='visibility_off']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='loginvalue4']")).click();

		String title= driver.getTitle();
		System.out.println("the title of current page is " + title);
		return driver; 
	}

}
