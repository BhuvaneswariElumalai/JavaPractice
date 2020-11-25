package testCases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonUtilities.CommonFunctions;
import junit.framework.Assert;
import pageObjects.PageObjectsStaySearch;

public class StaysSearch extends CommonFunctions {

	public void goingTo() {
		PageObjectsStaySearch.Goingto.click();
		extentTest.log(Status.INFO, "Clicked on Going to field");
		String partialText = " Chenn";
		PageObjectsStaySearch.Goingto.sendKeys(partialText);
		PageObjectsStaySearch.GoingToData.click();
		extentTest.log(Status.INFO, "Entered GoingTo Data");
		
	}

	public void datesSelection() throws Exception {
		PageObjectsStaySearch.checkIn.click();
		extentTest.log(Status.INFO, "Clicked on Checkin button");
		PageObjectsStaySearch.checkInDate.click();
		extentTest.log(Status.INFO, "Clicked on Checkin date");
		Thread.sleep(3000);
		PageObjectsStaySearch.doneButton.click();
		extentTest.log(Status.INFO, "Clicked on Done button");
		PageObjectsStaySearch.checkOut.click();
		extentTest.log(Status.INFO, "Clicked on CheckOut button");
		Thread.sleep(3000);
		PageObjectsStaySearch.checkOutDate.click();
		extentTest.log(Status.INFO, "Clicked on CheckOut date");

		Thread.sleep(3000);
		PageObjectsStaySearch.doneButton.click();
		extentTest.log(Status.INFO, "Clicked on Done button");

	}

	public void travellersButton() throws Exception {
		String tagList = PageObjectsStaySearch.travellersLink.getAttribute("innerHTML");
		if (tagList.contains("a href")) {
			PageObjectsStaySearch.travellersFinalLink.click();
			extentTest.log(Status.INFO, "Clicked Travellers Link");
		} else {
			PageObjectsStaySearch.travellersButton.click();
			extentTest.log(Status.INFO, "Clicked Travellers button");
		}
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.doubleClick(PageObjectsStaySearch.childrenAdd).perform();
		extentTest.log(Status.INFO, "Added Children");
		Thread.sleep(3000);
	}

	public void childDropdown() throws Exception {
		Select child1 = new Select(PageObjectsStaySearch.child1dropdown);
		child1.selectByIndex(3);
		extentTest.log(Status.INFO, "Added Child1 Age");
		Thread.sleep(3000);
		Select child2 = new Select(PageObjectsStaySearch.child2dropdown);
		child2.selectByIndex(5);
		extentTest.log(Status.INFO, "Added Child2 Age");
		Thread.sleep(3000);
		PageObjectsStaySearch.travellersDoneButton.click();
		extentTest.log(Status.INFO, "Clicked on Travellers Done button");
	}

	@Test
	public void staysSearch() throws Exception {

		PageFactory.initElements(driver, PageObjectsStaySearch.class);
		extentTest = extent.createTest("Stays Search");
		PageObjectsStaySearch.signIn.click();
		extentTest.log(Status.INFO, "Clicked on Sign in button");
		Thread.sleep(3000);
		boolean staysResult = PageObjectsStaySearch.stays.isSelected();
		Thread.sleep(5000);
		if (staysResult) {
			goingTo();
		} else {
			PageObjectsStaySearch.stays.click();
			extentTest.log(Status.INFO, "Clicked on Stays tab");
			goingTo();
		}
		datesSelection();
		travellersButton();
		childDropdown();
		PageObjectsStaySearch.finalSearchButton.click();
		extentTest.log(Status.INFO, "Clicked on Search button");
		Thread.sleep(5000);
		extentTest.log(Status.PASS, "Stays Search Success");
	}

	@AfterClass
	public void cleanUp() {
		extent.flush();
	}

}
