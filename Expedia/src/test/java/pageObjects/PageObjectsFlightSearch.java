package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectsFlightSearch {

	
	@FindBy(xpath="//div[@class='global-nav-header-links__item uitk-cell all-cell-shrink all-x-padding-four all-y-padding-three']//a[@href='/Flights']")
	public static WebElement flightsTab;
	@FindBy(xpath="//span[text()='Roundtrip']")
	public static WebElement roundTripTab;
	@FindBy(xpath="//div[@class='uitk-field has-floatedLabel-label has-icon has-no-placeholder']//button[@class='uitk-faux-input' and @aria-label='Leaving from']")
	public static WebElement leavingFrom;
	@FindBy(xpath="//strong[text()='Bengaluru (BLR - Kempegowda Intl.)']")
	public static WebElement leavingFromData;
	
	@FindBy(xpath="//div[@class='uitk-field has-floatedLabel-label has-icon has-no-placeholder']//button[@aria-label='Going to']")
	public static WebElement gointTo;
	@FindBy(xpath="//strong[text()='Chennai (MAA - Chennai Intl.)']")
	public static WebElement goingToData;
	
	@FindBy(id ="d1-btn")
	public static WebElement departing;
	@FindBy(xpath ="//div[@class='uitk-new-date-picker-menu-months-container']")
	public static WebElement departingMonth;
	
	@FindBy(xpath ="//div[@class='uitk-new-date-picker-month'][position()=1]//button[@class='uitk-new-date-picker-day']")
	public static WebElement departingMonthEnabled;
	
	@FindBy(xpath ="//span[text()='Done']")
	public static WebElement departingDone;
	
	@FindBy(id ="d2-btn")
	public static WebElement returning;
	@FindBy(xpath ="//div[@class='uitk-new-date-picker-menu-months-container']")
	public static WebElement returningMonth;
	
	@FindBy(xpath ="//div[@class='uitk-new-date-picker-month'][position()=1]//button[@class='uitk-new-date-picker-day']")
	public static WebElement returningMonthEnabled;
	
	@FindBy(xpath ="//span[text()='Done']")
	public static WebElement returningDone;
	
	@FindBy(xpath ="//button[text()='Search']")
	public static WebElement finalSearch;
	
	
}

