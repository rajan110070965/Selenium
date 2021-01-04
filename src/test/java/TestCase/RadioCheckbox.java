package TestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioCheckbox {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		// apply scrolling by pixel so driver interface is type casted into JavascriptExecuter interface
		JavascriptExecutor js=(JavascriptExecutor)driver;  
		js.executeScript("window.scrollBy(0,1200)", "");
		
List<WebElement> radio = driver.findElements(By.name("browser")); // store all radio button
System.out.println(radio.size());
//System.out.println(radio.get(0).getText()); 
for(int i=0;i<radio.size();i++) {
		
radio.get(i).click();
	
}	
	driver.close();	

	}

}
