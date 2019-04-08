package testSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteLead {

	public ChromeDriver driver;
	
	@Given("Open the delete Browser")
	public void openTheBrowser() {
	 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();		
	}

	@Given("Max the delete Browser")
	public void maxTheBrowser() {
		driver.manage().window().maximize();
		
	}

	@Given("Set the delete TimeOut")
	public void setTheTimeOut() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("Navigate to delete URL")
	public void navigateToURL() {
		driver.get("http://leaftaps.com/opentaps/");
	}

	@Given("Enter the delete UserName as DemoSalesManager")
	public void enterTheUserName() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}

	@Given("Enter the delete Password as crmsfa")
	public void enterThePassword() {
		driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("Click on delete Login Button")
	public void clickOnLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@When("Click on delete CRM\\/SFA Link")
	public void clickOnCRMSFALink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@When ("Click Leads button for Delete")
	public void clickLeadsButton() {
		driver.findElementByLinkText("Leads").click();		
	}
	
	@When ("Click Find Leads Button")
	public void clickFindLeadsButton() throws InterruptedException {
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(3000);
	}
	
	@When ("Click Phone Number Tab as (.*)")
	public void EnterFirstNameasfirstName(String pNum) throws InterruptedException {
		driver.findElementByXPath("(//span[@class ='x-tab-strip-text '])[2]").click();
		driver.findElementByXPath("(//input[@name = 'phoneNumber'])[1]").sendKeys(pNum);
		Thread.sleep(3000);
	}
	
	@When ("Click Find Leads Button for Search")
	public void clickFindButton() throws InterruptedException {
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(3000);
	}
	@When ("Click the First Lead ID after Search")
	public void clickFirstLeadIDlink() {
		WebElement leadID = driver.findElementByXPath("(//div[@class ='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		String text = leadID.getText();
		System.out.println("First Lead ID "+text);
		String replaceText = text.replaceAll("[^0-9]", "");
		System.out.println(replaceText);
		driver.findElementByXPath("(//div[@class ='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
	}
	@When ("click Delete Button")
	public void clickEditButton() {
		driver.findElementByLinkText("Delete").click();			
	}
	
	@When ("Click Find Leads in LNav")
	public void clearthecompanyname() throws InterruptedException {
		driver.findElementByXPath("//a[@href = '/crmsfa/control/findLeads']").click();
		Thread.sleep(3000);
	}
	
	@When ("Enter the Lead ID as (.*)")
	public void EnterthenewcompanynameascompanyName(String LeadID) {
		driver.findElementByXPath("(//label[contains(text(), 'Lead ID')]/following::input)[1]").sendKeys(LeadID);
		
	}
	@When ("Click Find Lead button in bottom")
	public void clickupdateButton() throws InterruptedException {
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(2000);
	}	
	
	@When("verify the error message")
	public void verifyTheErrorMessage() {
		String errorMessage = driver.findElementByXPath("//div[@class = 'x-paging-info']").getText();
		System.out.println("The Error Message  "+errorMessage);
	}
	
	@Then("Close delete Browser")
	public void closedeleteBrowser() {
		driver.close();
	}
	
	
}
