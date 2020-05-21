package PageUIs;

public class CommonPageUI {

	// Dynamic Element Component
	public static final String DYNAMIC_LINK="//a[text()='%s']";
	public static final String DYNAMIC_TEXTBOX="//input[@name='%s']";
	public static final String DYNAMIC_TEXTAREA="//textarea[@name='%s']";
	public static final String DYNAMIC_BUTTON="//input[@value='%s']";
	public static final String DYNAMIC_CHECKBOX="//input[@name='%s']";
	public static final String DYNAMIC_RADIO_BUTTON="//input[@type='radio' and @value='%s']";
	public static final String DYNAMIC_HEADER_OR_MESSAGE_DISPLAY="//p[@class='heading3' and text()='%s']";
	public static final String DYNAMIC_TABLE_ROWNAME="//td[contains(text(),'%s')]/following-sibling::td";
	public static final String DYNAMIC_DROPDOWN_LIST="//select[@name='%s']";
}
