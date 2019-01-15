package testCases;

import org.testng.Assert;
import org.apache.logging.log4j.*;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SelectFlight;
import resources.Base;

public class ValidateErrorTest extends Base {

	public static Logger log = LogManager.getLogger(Base.class.getName());

	@Test
	public void errorMessage() throws Exception {
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		log.info("Page is Loaded successfully");

		HomePage hm = new HomePage(driver);
		hm.depart().sendKeys("DAL");
		hm.arrive().sendKeys("HOU");
		hm.search().click();
		log.debug("Clicking on the Search button");

		SelectFlight sf = new SelectFlight(driver);
		sf.abc().click();
		log.debug("Clicking on the Continue button");

		Assert.assertEquals(sf.def().getText(), "Sorry, we found some errors...");

	}

}
