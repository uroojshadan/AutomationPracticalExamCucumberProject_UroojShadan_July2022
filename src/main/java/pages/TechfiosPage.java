package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosPage {

	WebDriver driver;

	@FindBy(how = How.CSS, using = "button:nth-child(12)")
	WebElement SETSKYBLUEBACKGROUND_BUTTON_ELEMENT;
	@FindBy(how = How.CSS, using = "button:nth-child(13)")
	WebElement SETWHITEBACKGROUND_BUTTON_ELEMENT;

	public TechfiosPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean checkIfSkyBlueBackgroundButtonExists() {

		boolean result = SETSKYBLUEBACKGROUND_BUTTON_ELEMENT.isDisplayed();
		return result;
	}

	public void clickOnSetSkyBlueBackgroundButton() {

		SETSKYBLUEBACKGROUND_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean checkIfWhiteBackgroundButtonExists() {

		boolean result = SETWHITEBACKGROUND_BUTTON_ELEMENT.isDisplayed();
		return result;
	}

	public void clickOnSetWhiteBackgroundButton() {

		SETWHITEBACKGROUND_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
