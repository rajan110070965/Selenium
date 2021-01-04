package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		// above page contain 3 iframe
		
		int count = driver.findElements(By.tagName("iframe")).size();
		System.out.println(count);
	
		// driver not perform any action directly on element of particulat iframe. so driver has to switch to particular frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='overview-summary.html']"));
		System.out.println("test");
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//body/main[1]/div[1]/div[2]/iframe[1]")).click();
		driver.close();

	}

}
