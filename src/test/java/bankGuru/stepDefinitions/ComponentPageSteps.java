package bankGuru.stepDefinitions;

import org.openqa.selenium.WebDriver;

import PageObjects.ComponentPO;
import commons.BaseTest;
import commons.PageGeneratorManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;

public class ComponentPageSteps extends BaseTest {

	private WebDriver driver;
	private ComponentPO componentPO;
	private int emailRandom;
	public ComponentPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		emailRandom = randomNumber();
		componentPO = PageGeneratorManager.getComponentPage(driver);
	}

	@Given("^Click to dynamic \"([^\"]*)\" button$")
	public void clickToDynamicButton(String buttonValue) {
		componentPO.clickToDynamicButton(buttonValue);
	}

	@Given("^Click to dynamic \"([^\"]*)\" page$")
	public void clickToDynamicPage(String linkName) {
		componentPO.clickToDynamicLink(linkName);
	}

	@When("^Select in dynamic dropdown \"([^\"]*)\" with item \"([^\"]*)\"$")
	public void selectInDynamicDropdownWithItem(String dropdownlistID, String valueItem) {
		componentPO.selectDynamicDropdownListByID(dropdownlistID, valueItem);
	}

	@When("^Sendkey to dynamic textbox \"([^\"]*)\" with value \"([^\"]*)\"$")
	public void sendkeyToDynamicTextboxWithValue(String textboxName, String textValue) {
		if(textboxName.contains("email")) {
			textValue = textValue + emailRandom + "@hotmail.com";
		}
		componentPO.inputToDynamicTextbox(textboxName, textValue);
	}

	@When("^Sendkey to dynamic textarea \"([^\"]*)\" with value \"([^\"]*)\"$")
	public void sendkeyToDynamicTextareaWithValue(String textareaName, String textValue) {
		componentPO.inputToDynamicTextarea(textareaName, textValue);
	}

	@When("^Click to dynamic \"([^\"]*)\" radio$")
	public void clickToDynamicRadio(String buttonID) {
		componentPO.clickToDynamicRadioButton(buttonID);
	}

	@When("^Click to dynamic \"([^\"]*)\" checbox$")
	public void clickToDynamicChecbox(String checkboxID) {
		componentPO.checkToDynamicCheckbox(checkboxID);
	}

	@Then("^Verify text value \"([^\"]*)\" in column \"([^\"]*)\" in table$")
	public void verifyTextInDynamicColumn(String textValue, String rowName) {
		if(rowName.contains("Email")) {
			textValue = textValue + emailRandom + "@hotmail.com";
		}
		verifyEquals(textValue, componentPO.getTextInDynamicTable(rowName));
	}

	@Then("^Verify dynamic header or message \"([^\"]*)\" is displayed$")
	public void isDynamicHeaderOrMessageDisplayed(String headerOrMessage) {
		verifyTrue(componentPO.isDynamicHeaderOrMessageDisplayed(headerOrMessage));
	}
}
