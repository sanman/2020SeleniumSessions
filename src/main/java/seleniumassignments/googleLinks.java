//Function which will return the list of footer links in google.com
package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumsessions.ElementUtil;

public class googleLinks {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By googleFootNav = By.xpath("//div[@class='EvHmz f6F9Be hRvfYe']/div[@class='fbar']//a");
		
		//Creating an ElementUtil object and an object reference variable
		ElementUtil elements = new ElementUtil(driver);
				
		//Accessing methods from ElementUtil class instance
		System.out.println("Footer nav links: " + elements.linkList(googleFootNav));				

		
	}


}
