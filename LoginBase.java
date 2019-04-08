package testSteps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginBase{
	
public static ChromeDriver driver;
	
	@Given("Open the Browser")
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


}
