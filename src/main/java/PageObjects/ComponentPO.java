package PageObjects;

import org.openqa.selenium.WebDriver;

import PageUIs.CommonPageUI;
import commons.ReuseFunctions;

public class ComponentPO extends ReuseFunctions {

	WebDriver driver;
	public ComponentPO(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void openMultiplePages(String pageName) {
		waitForElementVisible(CommonPageUI.DYNAMIC_LINK, pageName);
		clickToElement(CommonPageUI.DYNAMIC_LINK, pageName);
	}

	public boolean isDynamicHeaderOrMessageDisplayed(String headerOrMessage) {
		waitForElementVisible(CommonPageUI.DYNAMIC_HEADER_OR_MESSAGE_DISPLAY, headerOrMessage);
		return isElementDisplay(CommonPageUI.DYNAMIC_HEADER_OR_MESSAGE_DISPLAY, headerOrMessage);
	}
	public void openMultiplePagesJS(String pageName) {
		waitForElementVisible(CommonPageUI.DYNAMIC_LINK, pageName);
		clickToElementByJS(CommonPageUI.DYNAMIC_LINK, pageName);
	}

	public void inputToDynamicTextbox(String textboxID, String textValue) {
		waitForElementVisible(CommonPageUI.DYNAMIC_TEXTBOX, textboxID);
		sendKeyToElement(CommonPageUI.DYNAMIC_TEXTBOX, textValue, textboxID);
	}

	public void inputToDynamicTextarea(String textareaID, String textValue) {
		waitForElementVisible(CommonPageUI.DYNAMIC_TEXTAREA, textareaID);
		sendKeyToElement(CommonPageUI.DYNAMIC_TEXTAREA, textValue, textareaID);
	}

	public void clickToDynamicButton(String buttonValue) {
		waitForElementVisible(CommonPageUI.DYNAMIC_BUTTON, buttonValue);
		clickToElement(CommonPageUI.DYNAMIC_BUTTON, buttonValue);
	}

	public void clickToDynamicRadioButton(String buttonID) {
		waitForElementVisible(CommonPageUI.DYNAMIC_RADIO_BUTTON, buttonID);
		clickToElement(CommonPageUI.DYNAMIC_RADIO_BUTTON, buttonID);
	}

	public void clickToDynamicLink(String linkName) {
		waitForElementVisible(CommonPageUI.DYNAMIC_LINK, linkName);
		clickToElement(CommonPageUI.DYNAMIC_LINK, linkName);
	}

	public void selectDynamicDropdownListByID(String dropdownlistID, String valueItem) {
		waitForElementVisible(CommonPageUI.DYNAMIC_DROPDOWN_LIST, dropdownlistID);
		selectItemInDropdown(CommonPageUI.DYNAMIC_DROPDOWN_LIST, valueItem, dropdownlistID);
	}
	

	public String getDynamicTextbox(String textboxID) {
		waitForElementVisible(CommonPageUI.DYNAMIC_TEXTBOX, textboxID);
		return getTextElement(CommonPageUI.DYNAMIC_TEXTBOX, textboxID);
	}

	public void checkToDynamicCheckbox(String checkboxID) {
		waitForElementVisible(CommonPageUI.DYNAMIC_TEXTBOX, checkboxID);
		checkToCheckbox(CommonPageUI.DYNAMIC_TEXTBOX, checkboxID);
	}
	
	public boolean isCheckboxChecked(String checkboxID) {
		waitForElementVisible(CommonPageUI.DYNAMIC_CHECKBOX, checkboxID);
		return isElementSelected(CommonPageUI.DYNAMIC_CHECKBOX, checkboxID);
	}
	
	public void uncheckToDynamicCheckbox(String checkboxID) {
		waitForElementVisible(CommonPageUI.DYNAMIC_CHECKBOX, checkboxID);
		uncheckToCheckbox(CommonPageUI.DYNAMIC_CHECKBOX, checkboxID);
	}
	
	public boolean isLinkDisplayed(String linkName) {
		waitForElementVisible(CommonPageUI.DYNAMIC_LINK,linkName);
		return isElementDisplay(CommonPageUI.DYNAMIC_LINK,linkName);
	}

	public String getDynamicTextboxAttributeValue(String textboxID, String AttrValue) {
		waitForElementVisible(CommonPageUI.DYNAMIC_TEXTBOX, textboxID);
		return getAttributeValue(CommonPageUI.DYNAMIC_TEXTBOX, AttrValue, textboxID);
	}
	
	public String getTextInDynamicTable(String rowName) {
		waitForElementVisible(CommonPageUI.DYNAMIC_TABLE_ROWNAME, rowName);
		return getTextElement(CommonPageUI.DYNAMIC_TABLE_ROWNAME, rowName);
	}
}
