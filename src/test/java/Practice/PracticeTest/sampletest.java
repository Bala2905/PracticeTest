package Practice.PracticeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampletest {
	
	public static WebDriver driver;
	static String URL= "https://freecrm.co.in/";
	
	@BeforeTest
		public void openbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bala\\eclipse-workspace\\PracticeTest\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get(URL);
			
		}
				
	@Test
	public void createsignin() throws InterruptedException {
		
	driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
	driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("balaflux@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Freecrm@123");
	driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button'] ")).click();
	Thread.sleep(5000);
				
	}
	
	@AfterTest
	public void close() {
		driver.quit();
		
	}
	
	
	

}
