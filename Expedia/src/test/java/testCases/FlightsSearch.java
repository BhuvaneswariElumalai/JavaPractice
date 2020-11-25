package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonUtilities.CommonFunctions;
import pageObjects.PageObjectsFlightSearch;

public class FlightsSearch extends CommonFunctions {

	public void travelDates() throws Exception {

		PageObjectsFlightSearch.departing.click();
		extentTest.log(Status.INFO, "Clicked on Departing field");
		WebElement departing = PageObjectsFlightSearch.departingMonth;
		List<WebElement> departingdates = departing.findElements(By.xpath(
				"//div[@class='uitk-new-date-picker-month'][position()=1]//button[@class='uitk-new-date-picker-day']"));
		int lengthdeparting = departingdates.size();
		System.out.println(lengthdeparting);
		departingdates.get(0).click();
		extentTest.log(Status.INFO, "Selected Departing date");

		PageObjectsFlightSearch.departingDone.click();
		extentTest.log(Status.INFO, "Clicked on  Departing done");
		PageObjectsFlightSearch.returning.click();
		extentTest.log(Status.INFO, "Clicked on returning field");
		WebElement returning = PageObjectsFlightSearch.returningMonth;
		List<WebElement> returningdates = returning.findElements(By.xpath(
				"//div[@class='uitk-new-date-picker-month'][position()=1]//button[@class='uitk-new-date-picker-day']"));
		int lengthreturning = returningdates.size();
		System.out.println(lengthreturning);
		returningdates.get(2).click();
		extentTest.log(Status.INFO, "Selected returning date");

		PageObjectsFlightSearch.returningDone.click();
		extentTest.log(Status.INFO, "Clicked on  Returning done");

		Thread.sleep(3000);

		PageObjectsFlightSearch.finalSearch.click();
		extentTest.log(Status.INFO, "Clicked on Search button");
	}

	public void leavingFrom() throws Exception {

		String partialtext = "Banga";
		PageObjectsFlightSearch.leavingFrom.sendKeys(partialtext);
		extentTest.log(Status.INFO, "Clicked on LeavingFrom field");
		Thread.sleep(2000);
		PageObjectsFlightSearch.leavingFromData.click();
		extentTest.log(Status.INFO, "Entered LeavingFrom data");
	}

	public void goingTo() throws Exception {
		String partialtext = "Chenn";
		PageObjectsFlightSearch.gointTo.sendKeys(partialtext);
		extentTest.log(Status.INFO, "Clicked on GoingTo field");
		Thread.sleep(2000);
		PageObjectsFlightSearch.goingToData.click();
		extentTest.log(Status.INFO, "Entered GoingTo data");

	}

	@Test
	public void flightsSearch() throws Exception {
		PageFactory.initElements(driver, PageObjectsFlightSearch.class);
		extentTest = extent.createTest("Flights Search");

		PageObjectsFlightSearch.flightsTab.click();
		extentTest.log(Status.INFO, "Clicked on Flights tab");
		PageObjectsFlightSearch.roundTripTab.click();
		extentTest.log(Status.INFO, "Clicked on RoundTrip tab");

		Thread.sleep(3000);
		leavingFrom();
		goingTo();
		travelDates();

		Thread.sleep(5000);
		extentTest.log(Status.PASS, "Flights Search Success");
	}

	@AfterClass
	public void cleanUp() {
		extent.flush();
	}

}
