package testsFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	
	@Before
	public void setUp()
	{
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\SA\\workspace\\SeleniumProject\\BDD\\chromedriver.exe");	
	   this.driver = new ChromeDriver();
	   driver.manage().window().maximize();
	}

	@Given("^User navigates to stackoverflow Website$")
	public void user_navigates_to_stackoverflow_Website() throws Throwable {
		driver.get("https://www.stackoverflow.com");
	   
	}

	@And("^User clicks login button on homepage$")
	public void user_clicks_login_button_on_homepage() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
	}

	@And("^User enters valid username$")
	public void user_enters_valid_username() throws Throwable {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mubeenaafreen6@gmail.com");
		
	}

	@And("^user enters valid password$")
	public void user_enters_valid_password() throws Throwable {
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("amturraheem6");
	}

	@When("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
	   driver.findElement(By.xpath("//button[@id='submit-button']")).click();
	}

	@Then("^User should be taken to successful login page$")
	public void user_should_be_taken_to_successful_login_page() throws Throwable {
		
	
	}

}
