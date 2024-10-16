package adminpanelscripts;

import java.time.Duration;
import java.util.List;

import javax.swing.JScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

public class AdminIaView {
	public static WebDriver driver;

	public WebDriver iaview() throws InterruptedException {

		AdminViewTickets viewticketobj = new AdminViewTickets();
		driver= viewticketobj.viewticket();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.findElement(By.xpath("//span[text()='IA View ']")).click();
		JavascriptExecutor js= (JavascriptExecutor) driver;

		Thread.sleep(2000);
		//without entering mandatory filed selecting submit iocn 
		WebElement submitiocn =driver.findElement(By.xpath("//span[text()='Submit']"));
		submitiocn.click();

		//by entering state district and select submit iocn 
		driver.findElement(By.xpath("//mat-select[@id='state_name']")).click();
		Thread.sleep(2000);
		WebElement statename= driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']"));
		js.executeScript("arguments[0].scrollIntoView;", statename);
		statename.click();
		driver.findElement(By.xpath("//mat-select[@id='district_name']")).click();
		WebElement districtname= driver.findElement(By.xpath("//span[text()=' KARUR ']"));
		js.executeScript("arguments[0].scrollIntoview;", districtname);
		districtname.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(2000);

		// Add Ia
		driver.findElement(By.xpath("//span[text()='Add New ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name_of_SHPI']")).sendKeys("New IA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id='category']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' NGO ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='reg_No']")).sendKeys("1234567890");
		Thread.sleep(2000);
		String monthyear="MAY 2024";
		String date ="1";
		int i =1;
		while (true)
		{
			if (i==1)
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='reg_Date']")).click();
				Thread.sleep(3000);
			}
			String currentmyear = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[5]")).getText();
			System.out.println(currentmyear);
			if(currentmyear.equalsIgnoreCase(monthyear)) 
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
			}
			i= i+1;
		}

		List<WebElement> dates =driver.findElements(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator']"));
		for(WebElement dt :dates)
		{
			if (dt.getText().equalsIgnoreCase(date)) 
			{
				dt.click();
				break; 
			}

		}
		driver.findElement(By.xpath("//mat-select[@id='state']")).click();
		Thread.sleep(2000);
		WebElement state= driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']"));
		js.executeScript("arguments[0].scrollIntoView;", state);
		state.click();
		driver.findElement(By.xpath("//mat-select[@name='district_name']")).click();
		Thread.sleep(2000);
		WebElement district= driver.findElement(By.xpath("//span[text()=' KARUR ']"));
		js.executeScript("arguments[0].scrollIntoView;", district);
		district.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name_of_CEO']")).sendKeys("Mahendran");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='conNo_CEO']")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name_of_Secretary']")).sendKeys("mahen");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name_of_MIS_Operator']")).sendKeys("Adminuser");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='conNo_MIS_Operator']")).sendKeys("9786543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email_ID1_SHPI']")).sendKeys("mahen@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email_ID2_SHPI']")).sendKeys("mahendran1@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("mahendranTest");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys("Test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-slide-toggle-content'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-slide-toggle-content'])[2]")).click();
		Thread.sleep(4000);
		
		WebElement toggle3= driver.findElement(By.xpath("//mat-slide-toggle[@id='mat-slide-toggle-3']"));
		js.executeScript("arguments[0].scrollIntoView;", toggle3);
		toggle3.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-slide-toggle-content'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-slide-toggle-content'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		return driver;

	}

}
