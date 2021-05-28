package webdriver.selfies;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Selfy2 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.linkText("Rajinikanth"));
		if(links.size()==0)
		{
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(srcFile, new File("C:\\Users\\DELL\\Desktop\\selfy2.jpeg"));
		}
		
		
		/*
		 * String link = driver.findElement(By.linkText("Customer Service")).getText();
		 * System.out.println(link);
		 * 
		 * System.out.println("---------------");
		 */
		
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		/*
		 * for(int i=0;i<links.size();i++) { System.out.println(links.get(i).getText());
		 * }
		 */
		
		/*
		 * for( WebElement l:links) { System.out.println(l.getText()); }
		 */
		
		/*
		 * List<WebElement> links =
		 * driver.findElements(By.xpath("//div[@id='nav-xshop']/a")); for(WebElement l
		 * :links) { System.out.println(l.getText()); }
		 */
		

	}

}
