package webTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		String value = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[7]/td[4]")).getText();
		System.out.println(value);
		
		String value1 = driver.findElement(By.xpath("//a[contains(text(),'Shree Rama Newsprint')]/parent::*/following-sibling::td[3]")).getText();
		System.out.println(value1);
	}

}
