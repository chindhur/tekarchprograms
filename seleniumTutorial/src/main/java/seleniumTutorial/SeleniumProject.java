package seleniumTutorial;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumProject {
		static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		
		driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();	

		
		WebElement Uname= driver.findElement(By.id("username"));
		enterText(Uname,"chindhu.kamalesh@gmail.com","UserNametextbox");
		WebElement pwd =driver.findElement(By.id("password"));
		enterText(pwd,"K@malesh@82","password");

		//driver.findElement(By.id("Login")).click();
		WebElement login =driver.findElement(By.xpath("//*[@id='Login')]"));
		clickObj(login,"login");
	//	String actualtext = driver.findElement(By.xpath("//div[@id='error']")).getText();
	//	String expectedtext="Please check your username and password.If you still can't log in, contact your Salesforce administrator";
		// Assert.assertEquals(actualtext,expectedtext);
		//Thread.sleep(5000);
		
		
	}

	private static void clickObj(WebElement login, String string) {
		// TODO Auto-generated method stub
		
	}

	private static void enterText(WebElement uname, String string, String string2) {
		// TODO Auto-generated method stub
		
	}

}
//*[@id="login_div"]/button
