package Start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.*;

public class Assignment1 {
	
	
public static void main(String[] args) throws InterruptedException {
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\nidhi\\Desktop\\Selenium\\Selenium-learning\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//implement all methods of WebDriver
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");// Open given URL
	 WebElement SD= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select dropdown = new Select(SD);
	dropdown.selectByIndex(2);
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000L);
	int i=1;
			while(i<5)
			{
				driver.findElement(By.id("hrefIncAdt")).click();
				i++;
				
			}
			driver.findElement(By.id("btnclosepaxoption")).click();
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); 
			Thread.sleep(3000);
			// driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.xpath("//a[@value='DEL']")).click();
			driver.findElement(By.xpath("//a[@value='TRV']")).click();
			
			/*driver.findElement(By.id("checkBoxOption1")).click();
     Assert.assertTrue( driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
     System.out.println(By.cssSelector("input[Type='checkbox']").size());*/
     driver.close();
}
}
