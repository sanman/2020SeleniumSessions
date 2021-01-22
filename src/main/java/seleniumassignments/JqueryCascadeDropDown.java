package seleniumassignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumsessions.ElementUtil;

public class JqueryCascadeDropDown {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(2000);
		driver.findElement(By.id("justAnInputBox1")).click();
		Thread.sleep(2000);
		By dropdownChoices = By.xpath("//span[@class=\"comboTreeItemTitle\"]");
		

		//1. Single Selection
		//selectChoiceFromJqueryCascadeDropDown(dropdownChoices, "choice 1");
		//2. Multiple Selection
		//ElementUtil elements = new ElementUtil(driver);
		selectChoiceFromJqueryCascadeDropDown(dropdownChoices, "choice 1", "choice 6 2", "choice 6 2 2", "choice 6 2 3", "choice 7");
		//3. All Selection
		//selectChoiceFromJqueryCascadeDropDown(dropdownChoices, "All");
	

	}
	
	
	public static void selectChoiceFromJqueryCascadeDropDown(By locator, String... value) {
		//Storing the drop down options in a list of web elements
		//List<WebElement> choiceList = driver.findElements(locator);
		ElementUtil elements = new ElementUtil(driver);
		List<WebElement> choiceList = elements.getElements(locator);
		//Check the count of options in the drop down
		System.out.println(choiceList.size());
		//Get the name of the options in the drop down
		if (!value[0].equalsIgnoreCase("All")) {
			for (int i = 0; i < choiceList.size(); i++) {
				String optionName = choiceList.get(i).getText();
				System.out.println(optionName);
				for (int j = 0; j < value.length; j++) {		
					//Selecting based on a user provided choice
					if (optionName.equals(value[j])) {
						//if(!choiceList.get(i).isSelected()) {
						System.out.println(choiceList.get(i).isSelected());
							choiceList.get(i).click();
							System.out.println(choiceList.get(i).isSelected());
							break;
						//}
						
					}
				}
			}
		}
		else {
			try {
				for (WebElement e : choiceList) {
					//if(e.isDisplayed()) {
					e.click();
					//}
				}
			} catch (Exception e) {
			}
			
		}
	}

	

}
