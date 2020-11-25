package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonUtilities.CommonFunctions;
import pageObjects.PageObjectsSignIn;

public class LoginInValid extends CommonFunctions {

	private JavascriptExecutor js;

	@Test
	@Parameters({ "Email", "Password" })
	public void loginValid(String Email, String Password) throws Exception {
		PageFactory.initElements(driver, PageObjectsSignIn.class);
		extentTest = extent.createTest("Login Valid");
		PageObjectsSignIn.signIn.click();
		extentTest.log(Status.INFO, "Clicked on SignIn link");
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", PageObjectsSignIn.signInButton);
		extentTest.log(Status.INFO, "Clicked on SignIn button in the pop-up");
		/*String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);
		extentTest.log(Status.INFO, "Switched to signIn window");*/
		js.executeScript("arguments[0].click()", PageObjectsSignIn.emailAddress);
		PageObjectsSignIn.emailAddress.sendKeys(Email);
		extentTest.log(Status.INFO, "Entering Email Address");
		js.executeScript("arguments[0].click()", PageObjectsSignIn.password);
		PageObjectsSignIn.password.sendKeys(Password);
		extentTest.log(Status.INFO, "Entering Password");
		extentTest.log(Status.PASS, "LoginValid successful");
	}

	@AfterClass
	public void cleanUp() {
		extent.flush();
	}

}
