package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public Boolean isElementVisible(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	public Boolean isElementEnabled(By locator) {
		return driver.findElement(locator).isEnabled();
	}
	
	public Boolean isElementSelected(By locator) {
		return driver.findElement(locator).isSelected();
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	
	//*********************************Drop Down Utils *****************************
	public void doSelectDropDownVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);

	}
	
	public void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public void selectDropDownValue(By locator, String value) {
		List<WebElement> optionsList = getElements(locator);

		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println("----------------------");
			System.out.println(text);
			

			if (text.equals(value)) {
				e.click();
				break;
			}
		}
		
	}
//----------------------------------------------------------
	public void IdentifyAndClickByIndex(By locator, String value) {
		List<WebElement> optionsList = getElements(locator);

		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println("----------------------");
			System.out.println(text);
			

			if (text.contains(value)) {
				e.click();
				break;
			}
		}
		
	}
	
//	public void selectDate(String value) {
//		List<WebElement> optionsList = getElements(locator);
//		System.out.println(optionsList.size());
//		for (WebElement e : optionsList) {
//			String text = e.getText();
//			System.out.println(text);
//		}		
//	}
	
	public void searchSuggest(By locator) {
		List<WebElement> optionsList = getElements(locator);
		System.out.println(optionsList.size());
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
		}		
	}
	
	public ArrayList<String> linkList(By locator) {
		List<WebElement> optionsList = getElements(locator);
		ArrayList<String> linklist = new ArrayList<String>();
		System.out.println("Total links: " + optionsList.size());
		for (WebElement e : optionsList) {
			String link = e.getAttribute("href");
			System.out.println(link);
			linklist.add(link);
		}	
		return linklist;
	}
	
	public ArrayList<String> linkTextList(By locator) {
		List<WebElement> optionsList = getElements(locator);
		ArrayList<String> linktextList = new ArrayList<String>();
		System.out.println("Total link text: " + optionsList.size());
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			linktextList.add(text);
		}	
		return linktextList;
	}
	
//----------------------Juqery drop down selection-----------------------------------
	/**
	 * Pass the single String value for single selection,
	 * Pass the multiple String values for multiple selection,
	 * Pass "ALL" for all selection values from dropdown
	 * @param locator
	 * @param value
	 */
	
	public void selectChoiceFromJqueryBasedDropDown(By locator, String... value) {
		//Storing the drop down options in a list of web elements
		//List<WebElement> choiceList = driver.findElements(locator);
		List<WebElement> choiceList = getElements(locator);
		//Check the count of options in the drop down
		System.out.println(choiceList.size());
		//Get the name of the options in the drop down
		if (!value[0].equalsIgnoreCase("All")) {
			for (int i = 0; i < choiceList.size(); i++) {
				String optionName = choiceList.get(i).getText();
				//System.out.println(optionName);
				for (int j = 0; j < value.length; j++) {		
					//Selecting based on a user provided choice
					if (optionName.equals(value[j])) {
						choiceList.get(i).click();
						break;
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