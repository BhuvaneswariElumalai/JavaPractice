package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectsPackagesSearch {

	@FindBy(xpath="//button[@data-stid='location-field-origin-menu-trigger']")
	public static WebElement PackagesLeavingFrom;
	
	
	@FindBy(xpath="//input[@data-stid='location-field-origin-menu-input']")
	public static WebElement PackagesLeavingFromData;
	
	@FindBy(xpath="//ul[@data-stid='location-field-origin-results']")
	public static WebElement PackagesLeavingFromList;
	
	@FindBy(xpath="//button[@data-stid='location-field-destination-menu-trigger']")
	public static WebElement PackagesGoingTo;
	
	
	@FindBy(xpath="//input[@data-stid='location-field-destination-menu-input']")
	public static WebElement PackagesGoingtoData;
	
	
	@FindBy(xpath="//ul[@data-stid='location-field-destination-results']")
	public static WebElement PackagesGoingToFromList;
	
	@FindBy(xpath="//button[@data-testid='submit-button']")
	public static WebElement PackagesSearch;
	
	@FindBy(xpath="//ol[@class='results-list no-bullet']")
	public static WebElement packagesOrderedList;
	
	
	@FindBy(xpath="//h3[text()='Four Seasons Hotel Bengaluru at Embassy One']")
	public static WebElement desiredPackage;
	
	
}
