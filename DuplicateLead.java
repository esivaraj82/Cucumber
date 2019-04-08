package testSteps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DuplicateLead {

	public ChromeDriver driver;
	
	@Given("Open the dup Browser")
	public void openTheDupBrowser() {
	 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();		
	}

	@Given("Max the dup Browser")
	public void maxTheDupBrowser() {
	 
		driver.manage().window().maximize();
	}

	@Given("Set the dup TimeOut")
	public void setTheDupTimeOut() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("Navigate to dup URL")
	public void navigateToDupURL() {
		driver.get("http://leaftaps.com/opentaps/");
	}

	@Given("Enter the dup UserName as DemoSalesManager")
	public void enterTheDupUserNameAsDemoSalesManager() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}

	@Given("Enter the dup Password as crmsfa")
	public void enterTheDupPasswordAsCrmsfa() {
		driver.findElementById("password").sendKeys("crmsfa");
	}

	@Given("Click on dup Login Button")
	public void clickOnDupLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Given("Click on dup CRM\\/SFA Link")
	public void clickOnDupCRMSFALink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("Click Leads button for Duplicate")
	public void clickLeadsButtonForDuplicate() {
		driver.findElementByLinkText("Leads").click();
	}

	@Given("Click Find Leads Button Duplicate")
	public void clickFindLeadsButtonDuplicate() throws InterruptedException {
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//span[@class ='x-tab-strip-text '])[3]").click();
	}

	@Given("Click Email tab as (.*)")
	public void clickEmailTabAsEMaiLID(String eMailID) {
	   
		driver.findElementByXPath("(//input[@name='emailAddress'])[1]").sendKeys(eMailID);
	}

	@Given("Click Find Leads Button for Search Duplicate")
	public void clickFindLeadsButtonForSearchDuplicate() throws InterruptedException {
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(2000);  
	}

	@Given("Get the First name for result")
	public void getTheFirstNameForResult() {
		WebElement emailID = driver.findElementByXPath("(//div[@class ='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");
		String text = emailID.getText();
		System.out.println(text);
	}

	@Given("Click the first result link")
	public void clickTheFirstResultLink() {
		driver.findElementByXPath("(//div[@class ='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();  
	}

	@Given("Click the Duplicate Lead button")
	public void clickTheDuplicateLeadButton() throws InterruptedException {
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		Thread.sleep(2000);  
	}

	@Given("Get the Browser Title")
	public void getTheBrowserTitle() {
		String DuplicteTitle = driver.getTitle();
		System.out.println(DuplicteTitle);
	}

	@When("Get the CreateLead form name")
	public void getTheCreateLeadFormName() {
		WebElement firstName = driver.findElementById("createLeadForm_firstName");
		String name = firstName.getText();
		System.out.println(name);
	}

	@Then("Close the duplicate Lead browser")
	public void closeTheDuplicateLeadBrowser() {
	 driver.close();  
	}

	
	
}
