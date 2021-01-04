package TestCase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajan\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

// System.setProperty("webdriver.gecko.driver","C:\\Users\\Rajan\\Downloads\\Compressed\\geckodriver-v0.28.0-win64\\geckodriver.exe");

 
		//WebDriverManager.chromedriver().setup();		

		//ChromeDriver chrome = new ChromeDriver();
		// driver.get("https://www.argpack.in");
		// driver.close();

		//chrome.get("https://www.o2btechnologies.com");
		//chrome.close();
		
		
WebDriverManager.firefoxdriver().setup();		
FirefoxDriver driver = new FirefoxDriver();
driver.get("https://www.utest.com/");



driver.close();
		


		
		

	}

}
