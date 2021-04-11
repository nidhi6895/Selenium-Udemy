package Start;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class Assignment3 {
	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nidhi\\Desktop\\Selenium\\Selenium-learning\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

WebDriverWait w =new WebDriverWait(driver,5);

		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};

		
		Thread.sleep(3000);
		
		addItems(driver,itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
			driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
			
			w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

			driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

			driver.findElement(By.cssSelector("button.promoBtn")).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

			System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
			driver.quit();
			
	}

	private static void addItems(WebDriver driver, String[] itemsNeeded) {
		// TODO Auto-generated method stub
		int j=0;
		
				List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
				
				for(int i=0;i<products.size();i++)
				{

					String[] name=products.get(i).getText().split("-");
					
					String formattedName=name[0].trim();
					
					List itemsNeededList = Arrays.asList(itemsNeeded); 
					
					if(itemsNeededList.contains(formattedName))
							
					{
						j++;
						driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
						if(j==itemsNeeded.length) {
							break;
						}
						
						}
					}
}
}