package adminpanelscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminDates {


	public WebDriver date(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		String monthyear="MAY 2022";
		String date="1";
		int i=1;
		while(true)
		{
			if(i==1)
			{
				//driver.findElement(By.xpath("//input[@name='fromdate']")).click();
				driver.findElement(By.xpath("//input[@name='fromDate']")).click();
				Thread.sleep(2000);
			}
			String currentmonthyear= driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[6]")).getText();
			if(currentmonthyear.equalsIgnoreCase(monthyear))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
			}
			i=i+1;

		}
		Thread.sleep(2000);

		List<WebElement> caldates= driver.findElements(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator']"));
		for(WebElement dt:caldates)
		{
			if(dt.getText().equalsIgnoreCase(date))
				dt.click();
			break;
		}
		Thread.sleep(3000);
		{
			//driver.findElement(By.xpath("//input[@name='todate']")).click();
			driver.findElement(By.xpath("//input[@name='toDate']")).click();
			Thread.sleep(3000);
			List<WebElement>  todates= driver.findElements(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator']"));
			Thread.sleep(2000);
			for(WebElement at:todates)
			{
				if(at.getText().equalsIgnoreCase(date))
				Thread.sleep(2000);
				at.click();
				break;
			}
			return driver;

		}
	}

}
