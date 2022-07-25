import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class WebNavigationStepDefinitions {
	
	WebDriver driver;

	@Before
	public void setup()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student\\Desktop\\Latest ChromeDriver\\chromedriver.exe");
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Given("^I have a browser open$")
	public void i_have_a_browser_open() throws Throwable {
		driver = new ChromeDriver();
		 
	}

	@When("^I enter \"([^\"]*)\"$")
	public void i_enter(String url) throws Throwable {
		driver.get(url);
	    
	}

	@Then("^I am on page \"([^\"]*)\"$")
	public void i_am_on_page(String pageTitle) throws Throwable {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains(pageTitle));
	    
	}
	
	@When("^I click on the \"([^\"]*)\" link$")
	public void i_click_on_the_link(String linkText) throws Throwable {
		driver.findElement(By.partialLinkText(linkText)).click();
	    
	}

	@When("^I click on the button by ID$")
	public void i_click_on_the_button_by_ID() throws Throwable {
		driver.findElement(By.id("idExample")).click();
	   
	}

}
