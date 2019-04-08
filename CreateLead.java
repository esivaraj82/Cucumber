package testSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead extends LoginBase{

	//public ChromeDriver driver;
	
	/*@Given("Open the Browser")
	public void openTheBrowser() {
	 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();		
	}

	@Given("Max the Browser")
	public void maxTheBrowser() {
		driver.manage().window().maximize();
		
	}

	@Given("Set the TimeOut")
	public void setTheTimeOut() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("Navigate to URL")
	public void navigateToURL() {
		driver.get("http://leaftaps.com/opentaps/");
	}

	@Given("Enter the UserName as DemoSalesManager")
	public void enterTheUserName() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}

	@Given("Enter the Password as crmsfa")
	public void enterThePassword() {
		driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("Click on Login Button")
	public void clickOnLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@When("Click on CRM\\/SFA Link")
	public void clickOnCRMSFALink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
*/
	@And("click Leads Button")
	public void clickLeadsButton() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@When("Enter the CompanyName as (.*)")
	public void enterTheCompanyName(String cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	}

	@When("Enter the FirstName as (.*)")
	public void enterTheFirstName(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}

	@When("Enter the LastName as (.*)")
	public void enterTheLastName(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}

	@When("Enter PhoneNumber as (.*)")
	public void enterPhoneNumber(String pNumber) {
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(pNumber);
	}

	@When("Enter EmailID as (.*)")
	public void enterEmailID(String eMail) {
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(eMail);
	}

	@When("Click submitButton")
	public void clickSubmitButton() {
		driver.findElementByClassName("smallSubmit").click();
	}
	
	@Then("Close the Browser")
	public void closetheBrowser() {
		driver.close();
	}
}
