package testNG;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import Glowship_test.Driver;

public class FirstTestngFile {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    public WebDriver driver; 
     
  @Test
  public void verifyHomepageTitle() {
       
      System.out.println("launching chrome browser"); 
      System.setProperty("webdriver.chrome.driver",".\\lib\\chromedriver.exe");
      driver = Driver.getDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
//      driver.close();
  }
}