package TestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		
		// apply scrolling by pixel so driver interface is type casted into JavascriptExecuter interface
				JavascriptExecutor js=(JavascriptExecutor)driver;  
				js.executeScript("window.scrollBy(0,400)", "");
				
				List<WebElement> checkbox = driver.findElements(By.name("color"));
				System.out.println(checkbox.size());
				for(int i=0;i<checkbox.size();i++) {
					checkbox.get(i).click();
					System.out.println(checkbox.get(i).getAttribute("value"));
				
					System.out.println(checkbox.get(i).isSelected());
					System.out.println(checkbox.get(i).isDisplayed());
					System.out.println(checkbox.get(i).isEnabled());
				}
				
				
						
					driver.close();

	}

}
