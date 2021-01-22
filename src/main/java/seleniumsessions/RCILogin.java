package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RCILogin {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://testing.riskcontrol.expert/alligatorsandbox/Portal.bsd");

		// driver.switchTo().frame(2);
		// driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("MainWin")));

		WebElement username = driver.findElement(By.id("UserName"));
		WebElement password = driver.findElement(By.id("Password"));
		WebElement login_btn = driver.findElement(By.xpath("//div[@class=\"form-action align-middle\"]/button[@class=\"btn btn-green\"]"));
		username.sendKeys("admin");
		password.sendKeys("e1Ri8M5UsK");
		login_btn.click();
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.name("HeaderWin")));
		WebElement surveys = driver.findElement(By.xpath("//div[@id=\"main_menu\"]//li[@id=\"inspection\"]"));
		surveys.click();
		//driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//type="file" must be there to use sendKeys with file path.
		//driver.findElement(By.name("upfile")).sendKeys("/Users/naveenautomationlabs/Documents/POM_July.png");

		//driver.switchTo().defaultContent();
	}

}

