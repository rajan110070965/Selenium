package TestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findlinkableelement {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		List<WebElement> link = driver.findElements(By.tagName("a"));// it will print all links in anchor tag
		System.out.println(link.size());
		for(int i=0;i<link.size();i++) {
			System.out.println(link.get(i).getAttribute("href"));
		}
driver.close();
	}

}
