package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webElementConceptPractice {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		
		
		//Rule to get selenium work - First get the element (By using locator) than action (sendkeys, click, gettext ect)
		
		//1. By id
		//driver.findElement(By.id("Form_submitForm_subdomain")).sendKeys("SanjivTesting");
		//driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("Sanjiv");
		//driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("Mathur");
		//driver.findElement(By.id("Form_submitForm_action_request")).click();
		
		// Another approach - Capture web-element in a variable and perform action on the variable
//		WebElement domain = driver.findElement(By.id("Form_submitForm_subdomain"));
//		WebElement firstname = driver.findElement(By.id("Form_submitForm_FirstName"));
//		WebElement lastname = driver.findElement(By.id("Form_submitForm_LastName"));
//		domain.sendKeys("SanjivTesting");
//		firstname.sendKeys("Manan");
//		lastname.sendKeys("Mathur");
//		WebElement submit = driver.findElement(By.id("Form_submitForm_action_request"));
//		submit.click();
		
		
		//By locator - Object Repository
		By domain = By.id("Form_submitForm_subdomain");
		By firstname = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		
	}

}
