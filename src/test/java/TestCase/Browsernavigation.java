package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsernavigation {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.selenium.dev/");
		driver.findElement(By.xpath("//a[contains(text(),'Projects')]")).click();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();

	}

}
