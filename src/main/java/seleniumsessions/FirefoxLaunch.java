package seleniumsessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
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
