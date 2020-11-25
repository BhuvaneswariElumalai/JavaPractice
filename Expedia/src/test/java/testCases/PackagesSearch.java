package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonUtilities.ExcelUtility;
import pageObjects.PageObjectsPackagesSearch;
import commonUtilities.CommonFunctions;

public class PackagesSearch extends CommonFunctions{
	
	@DataProvider(name="Packages")
	public Object[][] getData(){
		Object[][] testdata = ExcelUtility.getTestData("Expedia");
		return testdata;
	}
	@Test(dataProvider = "Packages")
	public void packagesSerachValid(String LeavingFrom,String GoingTo) throws Exception{
		PageFactory.initElements(driver, PageObjectsPackagesSearch.class);
		extentTest=extent.createTest("Packages Search Valid");
		
		PageObjectsPackagesSearch.PackagesLeavingFrom.click();
		PageObjectsPackagesSearch.PackagesLeavingFromData.sendKeys(LeavingFrom);
		extentTest.log(Status.INFO, "Entering Valid Leaving From data");
		Thread.sleep(4000);
		List<WebElement> listLeavingFrom = PageObjectsPackagesSearch.PackagesLeavingFromList.findElements(By.tagName("li"));
		listLeavingFrom.get(0).click();
		
		PageObjectsPackagesSearch.PackagesGoingTo.click();
		PageObjectsPackagesSearch.PackagesGoingtoData.sendKeys(GoingTo);
		Thread.sleep(4000);
		List<WebElement> listGoingTo = PageObjectsPackagesSearch.PackagesGoingToFromList.findElements(By.tagName("li"));
		listGoingTo.get(0).click();
		extentTest.log(Status.INFO, "Entering Valid Going To data");
		Thread.sleep(2000);
		PageObjectsPackagesSearch.PackagesSearch.click();
		extentTest.log(Status.INFO, "Clicked on Search button");
		Thread.sleep(30000);
		
		
		
		
		WebElement packageWait = waitForElement(PageObjectsPackagesSearch.desiredPackage,20);
		if(packageWait.isDisplayed()){
			extentTest.log(Status.PASS, "Desired Package is available");
		}else{
			extentTest.log(Status.FAIL, "Desired Package is not available");
		}
	}

@AfterClass
public void cleanUp() {
	extent.flush();
}
}
