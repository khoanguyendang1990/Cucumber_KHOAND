package commons;

import org.openqa.selenium.WebDriver;

import PageObjects.ComponentPO;
import PageObjects.HomePO;
import PageObjects.LoginPO;

public class PageGeneratorManager {

	public static HomePO getHomePage(WebDriver driver) {
		return new HomePO(driver);
	}
	
	public static LoginPO getLoginPage(WebDriver driver) {
		return new LoginPO(driver);
	}

	public static ComponentPO getComponentPage(WebDriver driver) {
		return new ComponentPO(driver);
	}
	
}
