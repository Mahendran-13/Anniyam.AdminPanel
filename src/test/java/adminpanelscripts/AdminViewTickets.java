package adminpanelscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminViewTickets {
	public static WebDriver driver;

	public WebDriver viewticket() throws InterruptedException {
		AdminUserRegistration userregobj = new AdminUserRegistration();
		driver = userregobj.userreg();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.findElement(By.xpath("//span[text()='View Tickets ']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		//without entering details and selecting submit iocn 
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(8000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", " ");
		Thread.sleep(3000);

		//by entering details and select submit icon 
		WebElement servicetype = driver.findElement(By.xpath("//mat-select[@id='serviceType']"));
		servicetype.click();
		Thread.sleep(3000);
		
		WebElement dpfield = driver.findElement(By.xpath("//span[text()=' eKYC']"));
		dpfield.click();

		//from date 
		String yearmonth = "MAY 2023";
		String date = "13";
		int i = 1;
		while (true) 
		{
			if (i == 1) 
			{
				driver.findElement(By.xpath("//input[@data-mat-calendar='mat-datepicker-0']")).click();
				Thread.sleep(2000);
			}
			String currentyearmonth = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[6]")).getText();
			if (currentyearmonth.equalsIgnoreCase(yearmonth)) 
			{
				break;
			} 
			else 
			{
				driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
			}
			i = i + 1;
		}

		List<WebElement> currentdates = driver.findElements(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator']"));
		for (WebElement dt : currentdates)
		{
			if (dt.getText().equalsIgnoreCase(date))
				
			{
				dt.click();
				break;
			}
		}

		Thread.sleep(3000);
		// To date 
		String todate ="1";
		driver.findElement(By.xpath("//input[@data-mat-calendar='mat-datepicker-1']")).click();
		Thread.sleep(3000);
		List<WebElement> todates = driver.findElements(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator']"));
		for(WebElement dtdate: todates)
		{
			if(dtdate.getText().equalsIgnoreCase(todate))
			{
				dtdate.click();
				break;
			}
		}
		Thread.sleep(3000);
		// status 
		driver.findElement(By.xpath("//mat-select[@id='status']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' All']")).click();
		Thread.sleep(2000);
		WebElement submitiocn= driver.findElement(By.xpath("//span[text()='Submit']"));
		submitiocn.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", " ");       // to scroll upto end of the page 
		
		Thread.sleep(8000);
		//by using ticket id 
		driver.findElement(By.xpath("//input[@id='ticketId']")).sendKeys("MPT0000123");
		Thread.sleep(2000);
		submitiocn.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//mat-icon[@mattooltip='Close Ticket']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='NO']")).click();
		return driver;
	}

}
