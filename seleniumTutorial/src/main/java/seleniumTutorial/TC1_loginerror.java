/**
 * 
 */
package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 */
public class TC1_loginerror {

			static WebDriver driver;

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://login.salesforce.com");
			driver.manage().window().maximize();
			
			WebElement uname=driver.findElement(By.id("username"));
			uname.sendKeys("chindhu.kamalesh@gmail.com");
			WebElement pwd = driver.findElement(By.id("password"));
			pwd.sendKeys("K@malesh82");
			pwd.clear();
			WebElement login =driver.findElement(By.xpath("//*[@id='Login')]"));
			login.click();
			

				

			
		
			
		
			
			


	}

		private static void clickObj(WebElement login, String string) {
			// TODO Auto-generated method stub
			
		}

		private static void enterText(WebElement uname, String string, String string2) {
			// TODO Auto-generated method stub
			
		}

}
