package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com"); // Enter Url

		String title = driver.getTitle(); // get the title
		System.out.println("page title is: " + title);

		// verification point//checkpoint: (Actual vs Expected Result)
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("in-correct title");
		}

		System.out.println(driver.getCurrentUrl());

		driver.close();


	}

}
