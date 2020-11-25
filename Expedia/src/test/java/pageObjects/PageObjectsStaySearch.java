package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectsStaySearch {
	
	@FindBy(xpath ="//div[text()='Sign in']")
	public static WebElement signIn;
	@FindBy(xpath = "//span[text()='Stays']")
	public static WebElement stays;
	@FindBy(xpath ="//div[@class='uitk-typeahead-menu uitk-menu uitk-menu-mounted']//button[@class='uitk-faux-input']")
	public static WebElement Goingto;
	@FindBy(xpath ="//strong[text()='Chennai (MAA - Chennai Intl.)']")
	public static WebElement GoingToData;
	@FindBy(id ="d1-btn")
	public static WebElement checkIn;
	@FindBy(xpath="//div[@class='uitk-new-date-picker-month'][position()=1]//button[@data-day='19']")
	public static WebElement checkInDate;
	@FindBy(id ="d2-btn")
	public static WebElement checkOut;
	@FindBy(xpath="//div[@class='uitk-new-date-picker-month'][position()=1]//button[@data-day='30']")
	public static WebElement checkOutDate;
	@FindBy(xpath="//span[text()='Done']")
	public static WebElement doneButton;
	
	@FindBy(xpath="//div[@id='adaptive-menu']")
	public static WebElement travellersLink;
	
	@FindBy(xpath="//a[@data-testid='travelers-field']")
	public static WebElement travellersFinalLink;
	@FindBy(xpath="//button[text()='1 room, 2 travelers']")
	public static WebElement travellersButton;
	
	@FindBy(xpath="//*[name()='svg' and contains(@aria-labelledby,'uitk-step-increase-children') ]")	
	public static WebElement childrenAdd;
	@FindBy(id ="child-age-input-0-0")
	public static WebElement child1dropdown;
	@FindBy(id ="child-age-input-0-1")
	public static WebElement child2dropdown;
	
	@FindBy(xpath="//button[text()='Done']")
	public static WebElement travellersDoneButton;
	
	
	@FindBy(xpath="//button[@data-testid='submit-button']")
	public static WebElement finalSearchButton;
	
	
	
	
	
}
