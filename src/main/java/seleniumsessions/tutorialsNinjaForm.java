package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tutorialsNinjaForm {

	public static void main(String[] args) {
		String browserName = "chrome";
		
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By subscribeYes = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By subscribeNo = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		By privacyPolicy = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By continueButton = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		df.launchUrl("http://tutorialsninja.com/demo/index.php?route=account/register");
		
		ElementUtil elementutils = new ElementUtil(driver);
		elementutils.doSendKeys(firstname, "sanjiv");
		elementutils.doSendKeys(lastname, "mathur");
		elementutils.doSendKeys(email, "learnsanjeev@gmail.com");
		elementutils.doSendKeys(telephone, "9818202558");
		elementutils.doSendKeys(password, "tester123");
		elementutils.doSendKeys(confirmPassword, "tester123");
		elementutils.doClick(subscribeNo);
		elementutils.doClick(privacyPolicy);
		elementutils.doClick(continueButton);
		
	}

	
	
}



