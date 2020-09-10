package E2E.mavenProject;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

   
	
	private static final String TIMEUNITS = null;

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "E://Chrome driver//chromedriver_win32//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.mail-tester.com/");
		 //IMPLICIT WAIT//
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 //EXPLICIT WAIT//
		 WebDriverWait wait=new WebDriverWait(driver, 20);
	
		 //FLUENT WAIT //
		 Wait wait1=new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS);
				 
		 driver.close();
	}
}
