package TestCase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://stage.o2btechnologies.com/");
		driver.manage().window().maximize();
		
		// scroll to the bottom // type caste driver interface to JavascriptExecutor interface
		JavascriptExecutor bottom = (JavascriptExecutor) driver;
		bottom.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Set<String> win_id = driver.getWindowHandles();
		Iterator<String> itr  = win_id.iterator();
		String parent= itr.next();// hold main page handle
		
		driver.findElement(By.xpath("//i[@class='bx bxl-facebook']")).click();
		
		win_id=driver.getWindowHandles();
		itr=win_id.iterator();//hold 2 window handle(main + facebook)
	
		
driver.switchTo().window(parent);

driver.findElement(By.xpath("//i[@class='bx bxl-twitter']")).click();
win_id=driver.getWindowHandles();		// hold window handle for twitter
itr=win_id.iterator();// hold 3 window id(main + facebook + twitter)
parent= itr.next();
String child= itr.next();// hold facebook window handle
String twitter_id = itr.next();
System.out.println(parent);
System.out.println(child);
System.out.println(twitter_id);
// now close one by one tab
driver.switchTo().window(parent);
driver.close();
driver.switchTo().window(child);
driver.close();
driver.switchTo().window(twitter_id);
driver.close();

	}
}