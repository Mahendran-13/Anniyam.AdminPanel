package adminpanelscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminStatement {
	public static WebDriver driver;

	public WebDriver statement() throws InterruptedException 
	{
		AdminSettings settingsobj = new AdminSettings();
		driver = settingsobj.settings();
		driver.findElement(By.xpath("//span[text()='Statement ']")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor) driver;

		//SHG and Payout
		driver.findElement(By.xpath("//a[text()=' SHG and Payout ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id='type']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' All ']")).click();
		Thread.sleep(2000);
		AdminDates datesobj= new AdminDates();
		Thread.sleep(2000);
		driver =datesobj.date(driver);



		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(4000);
		WebElement scrolldown= driver.findElement(By.xpath("//span[text()=' Export to excel']"));
		js.executeScript("arguments[0].scrollIntoView();", scrolldown);
		Thread.sleep(3000);


		//dmt
		driver.findElement(By.xpath("//a[text()=' DMT ']")).click();
		Thread.sleep(2000);
		driver =datesobj.date(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(2000);
		WebElement dmtscroll= driver.findElement(By.xpath("//span[text()=' Export to excel']"));
		js.executeScript("arguments[0].scrollIntoView();", dmtscroll);
		Thread.sleep(2000);

		//BBPS
		driver.findElement(By.xpath("//a[text()=' BBPS ']")).click();
		Thread.sleep(2000);
		driver =datesobj.date(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(2000);
		WebElement Bbpsscroll= driver.findElement(By.xpath("//span[text()=' Export to excel']"));
		js.executeScript("arguments[0].scrollIntoView();", Bbpsscroll);

		//recharge
		driver.findElement(By.xpath("//a[text()=' Recharge ']")).click();
		Thread.sleep(2000);
		driver= datesobj.date(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(2000);
		WebElement rechargescroll= driver.findElement(By.xpath("//span[text()=' Export to excel']"));
		js.executeScript("arguments[0].scrollIntoView();", rechargescroll);
		Thread.sleep(2000);

		//AePS and MATM
		driver.findElement(By.xpath("//a[text()=' AePS and MATM ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id='type']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' All ']")).click();
		Thread.sleep(4000);
		String monthyear="MAY 2022";
		String date="1";
		int i=1;
		while(true)
		{
			if(i==1)
			{
				driver.findElement(By.xpath("//input[@name='fromdate']")).click();
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
			driver.findElement(By.xpath("//input[@name='todate']")).click();
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
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Submit']")).click();
			Thread.sleep(2000);
			WebElement Aepsscroll= driver.findElement(By.xpath("//span[text()=' Export to excel']"));
			js.executeScript("arguments[0].scrollIntoView();", Aepsscroll);
			Thread.sleep(2000);


			//wallet History
			driver.findElement(By.xpath("//a[text()=' Wallet History ']")).click();
			Thread.sleep(2000);
			driver= datesobj.date(driver);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Submit']")).click();
			Thread.sleep(8000);
			WebElement wallethistoryscroll= driver.findElement(By.xpath("//span[text()=' Export to excel']"));
			js.executeScript("arguments[0].scrollIntoView();", wallethistoryscroll);
			Thread.sleep(2000);

			//wallet details 
			driver.findElement(By.xpath("//a[text()=' Wallet Details ']")).click();
			Thread.sleep(2000);
			driver= datesobj.date(driver);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Submit']")).click();

			//wallet Topup
			driver.findElement(By.xpath("//a[text()=' Wallet Topup ']")).click();
			Thread.sleep(2000);
			driver= datesobj.date(driver);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Submit']")).click();
			WebElement topupscroll= driver.findElement(By.xpath("//span[text()=' Export to excel']"));
			js.executeScript("arguments[0].scrollIntoView();", topupscroll);
			Thread.sleep(2000);

			//wallet Incentive
			driver.findElement(By.xpath("//a[text()=' Wallet Incentive ']")).click();
			Thread.sleep(2000);
			driver= datesobj.date(driver);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Submit']")).click();
			Thread.sleep(2000);
			WebElement incentivescroll= driver.findElement(By.xpath("//span[text()=' Export to excel']"));
			js.executeScript("arguments[0].scrollIntoView();", incentivescroll);

			//pan
			driver.findElement(By.xpath("//a[text()=' PAN ']")).click();
			Thread.sleep(2000);
			driver= datesobj.date(driver);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Submit']")).click();

			//digital gold
			driver.findElement(By.xpath("//a[text()=' Digital Gold ']")).click();
			Thread.sleep(2000);
			driver= datesobj.date(driver);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Submit']")).click();

			//Wallet Balance
			driver.findElement(By.xpath("//a[text()=' Wallet Balance ']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//mat-select[@id='state_name']")).click();
			Thread.sleep(2000);
			//WebElement walletbalancestate= 	driver.findElement(By.xpath("//span[text()=' PUDUCHERRY ']"));
			//js.executeScript("arguments[0].scrollIntoView();", walletbalancestate);
			Thread.sleep(2000);
			//walletbalancestate.click();
			driver.findElement(By.xpath("//span[text()=' PUDUCHERRY ']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//mat-select[@id='district_name']")).click();
			Thread.sleep(2000);
			WebElement walletbalancedistrict= driver.findElement(By.xpath("//span[text()=' KARAIKAL ']"));
			js.executeScript("arguments[0].scrollIntoView();", walletbalancedistrict);
			walletbalancedistrict.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//mat-select[@id='ia']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()=' DEMO ']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//mat-select[@id='merchantID']")).click();
			Thread.sleep(2000);
			WebElement merchantname= driver.findElement(By.xpath("//span[text()=' Prabhu ']"));
			js.executeScript("arguments[0].scrollIntoView();", merchantname);
			merchantname.click();
			Thread.sleep(2000);
			driver=datesobj.date(driver);
			Thread.sleep(2000);
			WebElement submiticon= driver.findElement(By.xpath("//span[text()='Submit']"));
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView();", submiticon);
			Thread.sleep(2000);
			submiticon.click();
			Thread.sleep(2000);
			WebElement balance= driver.findElement(By.xpath("//th[text()='Balance ']"));
			js.executeScript("arguments[0].scrollIntoView();", balance);
			Thread.sleep(2000);
			WebElement exportexcel=	driver.findElement(By.xpath("//span[text()=' Export to excel']"));
			js.executeScript("arguments[0].scrollIntoView();", exportexcel);

			//reports Download
			driver.findElement(By.xpath("//a[text()=' Reports Download ']")).click();
			Thread.sleep(2000);
			driver=datesobj.date(driver);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[text()='Download']")).click();
			Thread.sleep(7000);

			return driver;


		}

	}
}

