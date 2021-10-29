package example;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
  @Test
  public void facebook() {
 System.setProperty("webdriver.chrome.driver","C:\\browser drivers\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("http://www.fb.com");	
  }
  @Test
  public void google() {
 System.setProperty("webdriver.chrome.driver","C:\\browser drivers\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("http://www.google.com");	
  }
  @Test
  public void gmail() {
 System.setProperty("webdriver.chrome.driver","C:\\browser drivers\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("http://www.gmail.com");	
  }
  @Test
  public void amazon() {
 System.setProperty("webdriver.chrome.driver","C:\\browser drivers\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("http://www.amazon.com");	
  }
  @Test
  public void guru99() {
 System.setProperty("webdriver.chrome.driver","C:\\browser drivers\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("http://www.guru99.com");	
  }
  @Test
  public void flipkart() {
 System.setProperty("webdriver.chrome.driver","C:\\browser drivers\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("http://www.flipkart.com");	
  }
  @Test
  public void selenium() {
 System.setProperty("webdriver.chrome.driver","C:\\browser drivers\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("http://www.selenium.dev");	
  }
}
