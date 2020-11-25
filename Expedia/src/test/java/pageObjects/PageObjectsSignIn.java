package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectsSignIn {
	
	@FindBy(xpath ="//button[@aria-expanded='false']//*[contains(text(),'Sign')]")
	public static WebElement signIn;
	
	@FindBy(xpath ="//a[starts-with(@class,'uitk-button uitk-button-small ') and contains(@class,'uitk-button-primary')]")
	public static WebElement signInButton;
	
	@FindBy(id="gss-signin-email")
	public static WebElement emailAddress;
	
	@FindBy(id="gss-signin-password")
	public static WebElement password;
	
	/*@FindBy(xpath="(//input[@type='email'])[1]")
	public static WebElement emailAddress;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	public static WebElement password;
	
	*/
}
