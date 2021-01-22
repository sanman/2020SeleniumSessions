//Return the list of all footer links for freshworks.com


package seleniumassignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumsessions.ElementUtil;

public class listAllFooterLinks {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		//Creating an ElementUtil object and an object reference variable
		ElementUtil elements = new ElementUtil(driver);
		
		By footnav = By.xpath("//div[@class='footer-main']//ul[@class='footer-nav']//li");
		//Accessing methods from ElementUtil class instance
		System.out.println("Footer nav link text: " + elements.linkTextList(footnav));			
	}
}
