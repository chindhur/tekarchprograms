package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc2_login {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		WebElement uname=driver.findElement(By.id("username"));
		uname.sendKeys("chindhu.kamalesh@gmail.com");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("K@malesh82");
		WebElement login =driver.findElement(By.xpath("//*[@id='Login')]"));
		login.click();
		

	}

}
