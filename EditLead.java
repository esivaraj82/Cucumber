package testSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditLead extends LoginBase{

	/*public ChromeDriver driver;
	
	@Given("Open the Chrome Browser")
	public void openTheBrowser() {
	 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();		
	}

	@Given("Max the Chrome Browser")
	public void maxTheBrowser() {
		driver.manage().window().maximize();
		
	}

	@Given("Set the Chrome TimeOut")
	public void setTheTimeOut() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("Navigate to Chrome URL")
	public void navigateToURL() {
		driver.get("http://leaftaps.com/opentaps/");
	}

	@Given("Enter the Chrome UserName as DemoSalesManager")
	public void enterTheUserName() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}

	@Given("Enter the Chrome Password as crmsfa")
	public void enterThePassword() {
		driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("Click on Chrome Login Button")
	public void clickOnLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@When("Click on Chrome CRM\\/SFA Link")
	public void clickOnCRMSFALink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
*/
	@And ("click Edit Leads Button")
	public void clickLeadsButton() {
		driver.findElementByLinkText("Leads").click();
		
	}
	
	@When ("click Find Leads Button")
	public void clickFindLeadsButton() {
		driver.findElementByLinkText("Find Leads").click();
	}
	
	@When ("Enter First Name as (.*)")
	public void EnterFirstNameasfirstName(String firstName) {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(firstName);
	}
	
	@When ("click Find Button")
	public void clickFindButton() throws InterruptedException {
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(3000);
	}
	@When ("click First Lead ID link")
	public void clickFirstLeadIDlink() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").click();
	}
	@When ("click Edit Button")
	public void clickEditButton() {
		driver.findElementByXPath("//a[contains(text(),'Edit')]").click();	
	}
	@When ("clear the company name")
	public void clearthecompanyname() {
		driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
	}
	
	@When ("Enter the new company name as (.*)")
	public void EnterthenewcompanynameascompanyName(String companyName) {
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys(companyName);
	}
	@When ("click update Button")
	public void clickupdateButton() {
		driver.findElementByName("submitButton").click();
	}	
	
	@Then("Close edit Browser")
	public void closeTheBrowser() {
		driver.close();
	}
	
	
	
	
	
	
}
