package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboardevent {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.utest.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='unauthenticated-nav-bar__link']")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath("//a[@class='unauthenticated-nav-bar__link']")).sendKeys(Keys.PAGE_UP);
	
		
		

	}

}
