package seleniumTutorial;

import org.openqa.selenium.WebElement;

public class Tc3_RememberPassword {
				static WebDriver driver;
	public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.login.salesforce.com");

	        WebElement usernameField = driver.findElement(By.id("username"));
	        WebElement passwordField = driver.findElement(By.id("password"));
	        WebElement rememberUsernameCheckbox = driver.findElement(By.id("rememberUn"));
	        WebElement loginButton = driver.findElement(By.id("Login"));

	        usernameField.sendKeys("your_valid_username");
	        passwordField.sendKeys("your_valid_password");
	        rememberUsernameCheckbox.click();
	        loginButton.click();

	        WebElement userMenuDropdown = driver.findElement(By.id("userNav"));
	        userMenuDropdown.click();

	        WebElement logoutLink = driver.findElement(By.linkText("Logout"));
	        logoutLink.click();

	    	WebElement displayedUsername = driver.findElement(By.id("username"));
	        String displayedUsernameText = displayedUsername.getAttribute("value");

	        System.out.println("Displayed Username: " + displayedUsernameText);

	        driver.quit();
	    }
	}

	
		
		// TODO Auto-generated method stub

	}

}
