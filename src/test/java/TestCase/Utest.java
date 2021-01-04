package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.utest.com/");
		driver.findElement(By.xpath("//a[@class='unauthenticated-nav-bar__link']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("kumarfreelancer01@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("KumarFreelancer@12345");
		driver.findElement(By.xpath("//button[@id='kc-login']")).click();
		// work on notification
		driver.findElement(By.xpath("//a[@aria-label='Notifications']")).click();
		
		driver.findElement(By.xpath("//button[@aria-label='Expand to see User menu']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Sign Out')]")).click();
		driver.close();
		

	}

}
