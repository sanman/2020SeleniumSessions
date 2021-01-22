package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(2000);
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
		By dropdownChoices = By.xpath("//span[@class=\"comboTreeItemTitle\"]");
		
		//Selecting multiple values by using the method multiple times or passing multiple parameters
		// in the method is not an efficient solution
		//Using String 3 dot parameter (String... value) to pass multiple values in a method
		//1. Single Selection
		//selectChoiceFromJqueryBasedDropDown(dropdownChoices, "choice 1");
		//2. Multiple Selection
		ElementUtil elements = new ElementUtil(driver);
		elements.selectChoiceFromJqueryBasedDropDown(dropdownChoices, "choice 1", "choice 6 2", "choice 6 2 3", "choice 7");
		//3. All Selection
		//selectChoiceFromJqueryBasedDropDown(dropdownChoices, "All");
//		selectChoiceFromJqueryBasedDropDown(dropdownChoices, "choice 1");
//		selectChoiceFromJqueryBasedDropDown(dropdownChoices, "choice 6 2");		

	}
	
	

}
