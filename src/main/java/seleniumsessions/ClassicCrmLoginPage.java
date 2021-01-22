package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassicCrmLoginPage {

	public static void main(String[] args) {
		
		String browserName = "firefox";
		
		By username = By.name("username");
		By password = By.name("password");
		By loginButton = By.xpath("//*[@id=\"loginForm\"]/div/div/input");
		
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		df.launchUrl("http://classic.crmpro.com/");
		
		ElementUtil elementutils = new ElementUtil(driver);
		elementutils.doSendKeys(username, "sanjiv");
		elementutils.doSendKeys(password, "tester123");
		elementutils.doClick(loginButton);
		
		

	}

}
