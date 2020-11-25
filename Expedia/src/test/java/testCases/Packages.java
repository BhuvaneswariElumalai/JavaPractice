package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonUtilities.CommonFunctions;
import junit.framework.Assert;
import pageObjects.PageObjectsPackages;

public class Packages extends CommonFunctions {
	
	@Test
	public void packagesSearch() throws Exception {
		PageFactory.initElements(driver, PageObjectsPackages.class);
		extentTest=extent.createTest("Packages Search");
		PageObjectsPackages.packages.click();
		
		extentTest.log(Status.INFO,"Clicked on Packages tab");
		Thread.sleep(3000);

		PageObjectsPackages.packagesSearch.click();
		extentTest.log(Status.INFO,"Clicked on the Search button");
		String expectedText="To continue, please correct the 3 errors below.";
		String actualText = PageObjectsPackages.packagesError.getText();
		Assert.assertEquals(expectedText, actualText);
}
	
	@AfterClass
	public void cleanUp() {
		extent.flush();
	}
	
}
