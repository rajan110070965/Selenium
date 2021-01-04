package TestCase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
	
		// webdriver interface typecaste to takescreenshot interface
TakesScreenshot screen	=  (TakesScreenshot)driver;
//File src = screen.getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(src, new File("./target/screenshot/fullpage.png"));
//System.out.println("done");

// take screenshot when error occur not before so put in try catch block
try {
driver.findElement(By.xpath("//a[@href1='#checkbox']"));
driver.findElement(By.xpath("//a[@href='#checkbox']")).click();
}
catch(Throwable e)
{
	File src = screen.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("./target/screenshot/error1.png"));	
	System.out.println("not found");
}
driver.close();

		
}
}