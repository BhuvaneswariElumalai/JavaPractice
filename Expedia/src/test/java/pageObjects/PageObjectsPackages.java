package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectsPackages {

	@FindBy(xpath="//div[@class='global-nav-header-links__item uitk-cell all-cell-shrink all-x-padding-four all-y-padding-three']//a[@target='_self' and @href='/Vacation-Packages']")
	public static WebElement packages;
	
	
	@FindBy(xpath="//button[@data-testid='submit-button']")
	public static WebElement packagesSearch;
	
	@FindBy(xpath="//div[@class='uitk-error-summary']//h3[@class='uitk-error-summary-heading']")
	public static WebElement packagesError;
	
	
	
	
}
