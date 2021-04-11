package Start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args)throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nidhi\\Desktop\\Selenium\\Selenium-learning\\chromedriver.exe");

WebDriver driver= new ChromeDriver();

WebDriverWait w=new WebDriverWait(driver,5);

driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");

driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#results")));
System.out.println(driver.findElement(By.cssSelector("div#results")).getText());
	}
}
