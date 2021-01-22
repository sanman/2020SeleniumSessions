package seleniumassignments;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumsessions.ElementUtil;

public class gymBooking {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://myfit4less.gymmanager.com/portal/login.asp");
		driver.manage().window().maximize();
        //This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		By email = By.id("emailaddress");
		By password = By.id("password");
		By login = By.id("loginButton");
		By selectClub = By.id("btn_club_select");
		
		
		
		//Creating an ElementUtil object and an object reference variable
		ElementUtil elements = new ElementUtil(driver);
		elements.doSendKeys(email, "amit_fogat@hotmail.com");
		elements.doSendKeys(password, "Mahindra@1");
//		elements.doSendKeys(email, "sanjeev.mathurr@gmail.com");
//		elements.doSendKeys(password, "Brooke@123");
		elements.doClick(login);
		Thread.sleep(3000);	
		//Actions actions = new Actions(driver);
		//actions
		
		//This will scroll the page till the element is found		
        //js.executeScript("arguments[0].scrollIntoView();", selectClub);
		js.executeScript("window.scrollBy(0,175)", "");
        elements.doClick(selectClub);
        Thread.sleep(3000);
        
        By club = By.xpath("//div[@id='modal_clubs']//div[@class='modal-body']/div[@class='dialog-content']/div[@id='club_688A3ACF-D535-468F-9C50-F126EAA4929D']");

        //By club = By.xpath("//div[@id='modal_clubs']//div[@class='modal-body']/div[@class='dialog-content']/div[@id='club_ED845FB7-F4BF-4B8F-9255-9BB118CE8C22']");
        elements.doClick(club);
        Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,175)", "");
        By selectDate = By.xpath("//div[@id='btn_date_select']");
        elements.doClick(selectDate);
        Thread.sleep(3000);
        //Need to change the date
        By date= By.xpath("//div[@id='date_2020-12-11']");
        elements.doClick(date);
        js.executeScript("window.scrollBy(0,175)", "");
        By slot = By.xpath("//body/div[@class='content']/div[@class='container']/div[@class='row']/div[@class='col-md-12']/div[@class='content-box']/form[@id='doorPolicyForm']/div[3]/div");
        //elements.IdentifyAndClickByIndex(slot, "at 8:30 AM");
        if (elements.isElementVisible(slot)) {
            elements.IdentifyAndClickByIndex(slot, "Click to reserve");
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            By bookYes = By.xpath("//button[@id='dialog_book_yes']");
            elements.doClick(bookYes);
		} else {
			System.out.println("Time slot is not available on the page");
		}

        

        		
		
	}
}