package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseaction {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://stage.o2btechnologies.com/");
		Actions move = new Actions(driver);
	WebElement product_menu = driver.findElement(By.xpath("//a[@class='hidden-xs-minep'][contains(text(),'Products')]"));
	try {
		Thread.sleep(2000L);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	WebElement crm = driver.findElement(By.xpath("//span[contains(text(),'CRM')]"));
	move.moveToElement(product_menu).build().perform();
	move.click(crm).build().perform();
	

	}

}
