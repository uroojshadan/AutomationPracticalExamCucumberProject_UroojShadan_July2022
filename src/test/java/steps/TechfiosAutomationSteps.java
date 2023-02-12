package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TechfiosPage;
import pages.TestBase;

public class TechfiosAutomationSteps extends TestBase {

	TechfiosPage techfiosPage;
	

	@Before
	public void setUp() {
		initDriver();
		techfiosPage = PageFactory.initElements(driver, TechfiosPage.class);
		
	}

	@Given("I am On Techfios practical Exam page")
	public void user_is_on_techfios_practical_exam_page() {
		driver.get("http://techfios.com/test/101/");
	}

	@Given("{string} button exists")
	public void button_exists(String button) {

		if (button.equalsIgnoreCase("Set SkyBlue Background")) {
			boolean result = techfiosPage.checkIfSkyBlueBackgroundButtonExists();
			System.out.println("Set SkyBlue Background button exists");
			Assert.assertTrue("The SetSkyBlueBackgroundButton does not exist", result);
		} else if (button.equalsIgnoreCase("Set White Background")) {
			boolean result = techfiosPage.checkIfWhiteBackgroundButtonExists();
			System.out.println("Set White Background button exists");
			Assert.assertTrue("The SetWhiteBackgroundButton does not exist", result);

		}
		else {
			System.out.println("None of the specified buttons exist");
		}

	}

	
	
	@When("I click on the {string}")
	public void i_click_on_the_button(String buttonName) {
		if(buttonName.equalsIgnoreCase("SetSkyBlueBackgroundButton")) {
			techfiosPage.clickOnSetSkyBlueBackgroundButton();
			
		}else if(buttonName.equalsIgnoreCase("SetWhiteBackgroungButton")) {
			techfiosPage.clickOnSetWhiteBackgroundButton();
		}
		else {
			System.out.println("Wrong selection! Error in clicking button");
		}
	}

	@Then("The background color will change to {string}")
	public void the_background_color_will_change_color(String color) {
		if(color.equalsIgnoreCase("sky blue")) {
		String attributeName = driver.findElement(By.cssSelector("body")).getAttribute("style");
		System.out.println("Attribute name :" + attributeName);
		Assert.assertEquals("Background color not set as blue", "background-color: skyblue;", attributeName);
		}else if(color.equalsIgnoreCase("white")) {
			String attributeName = driver.findElement(By.cssSelector("body")).getAttribute("style");
			System.out.println("Attribute name :" + attributeName);
			Assert.assertEquals("Background color not set as white", "background-color: white;", attributeName);
		}
		else {
			System.out.println("Error ! No change of color");
		}
		takeScreenShot(driver);
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
