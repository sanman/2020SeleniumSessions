package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	public static void main(String[] args) {
		
		String browserName = "chrome";
		
		By domain = By.id("Form_submitForm_subdomain");
		By firstname = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		By submitButton = By.id("Form_submitForm_action_request");
		
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		df.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		String title = df.doGetPageTitle();
		System.out.println("Page title is: " + title);
		
		if(title.contains("Human Resource")) {
			System.out.println("correct page title.....");
		}
		
		ElementUtil elementUtil = new ElementUtil(driver);
		
		elementUtil.doSendKeys(domain, "sanman.com");
		elementUtil.doSendKeys(firstname, "Sanjiv");
		elementUtil.doSendKeys(lastname, "Mathur");
		elementUtil.doClick(submitButton);
	}

}
