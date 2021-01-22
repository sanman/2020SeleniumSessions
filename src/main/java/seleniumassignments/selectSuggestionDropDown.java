//Finding all the suggested search result values for a keyword search on 
//http://automationpractice.com/index.php?id_product=6&controller=product

package seleniumassignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumsessions.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectSuggestionDropDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_product=6&controller=product");
		
		//Assigning web elements to variables
		By searchboxBy = By.name("search_query");
		By acresults = By.xpath("//div[@class='ac_results']//li");
		
		//Creating an ElementUtil object and an object reference variable
		ElementUtil elements = new ElementUtil(driver);
		
		//Accessing methods from ElementUtil class instance
		elements.doSendKeys(searchboxBy, "dress");
		Thread.sleep(3000);
		elements.selectDropDownValue(acresults, "Summer Dresses > Printed Summer Dress");		

	}
}


