package testCases;

import org.testng.annotations.Test;
import org.apache.logging.log4j.*;

import pageObjects.HomePage;
import resources.Base;

public class ValidateLoginTest extends Base {

	public static Logger log = LogManager.getLogger(Base.class.getName());

	@Test
	public void logintest() throws Exception {

		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		log.info("Page is Loaded successfully");

		HomePage hp = new HomePage(driver);
		hp.abc().click();
		hp.def().sendKeys("test");
		hp.ghi().sendKeys("password");
		hp.jkl().click();
		log.debug("Clicking on the Log in button");

	}

}
