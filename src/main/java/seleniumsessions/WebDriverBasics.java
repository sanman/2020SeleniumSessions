package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//http/https protocol is required
		driver.get("http://www.amazon.ca");
		
		String title = driver.getTitle();
		System.out.println("Page title is :" + title);
		
		if(title.equals("Google")) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Incorrect Title");
		}
		
		driver.quit();

	}

}

