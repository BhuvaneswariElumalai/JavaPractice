package commonUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import commonUtilities.ExcelUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions {

	public static Properties prop = null;
	public static WebDriver driver;
	public static Logger log = LogManager.getLogger(CommonFunctions.class.getName());

	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest extentTest;

	public Properties loadProperties() throws IOException {

		String path = "C:\\Users\\Admin\\workspace\\Expedia\\Expedia\\configuration.properties";
		FileInputStream fs = new FileInputStream(path);
		prop = new Properties();
		prop.load(fs);

		return prop;

	}

	/*
	 * public static String getCurrentDateTime() { DateFormat customformat = new
	 * SimpleDateFormat("MM_dd_yyyy_HH_mm_ss"); Date currentDate = new Date();
	 * return customformat.format(currentDate); }
	 */

	public String getScreenShot(String methodName) throws Exception {
		String filename = getScreenshotFileName(methodName);
		String path = System.getProperty("user.dir") + "/screenshotsDump/" + filename;

		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(path));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return path;
	}

	public String getScreenshotFileName(String methodName) {
		Date d = new Date();
		String filename = methodName + "_" + d.toString().replace(":", "_").replace(" ", "_") + ".png";
		return filename;
	}

	public WebElement waitForElement(WebElement desiredElement, int timeout) {

		WebElement element = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.visibilityOf(desiredElement));
			extentTest.log(Status.INFO, "Element is located");
		} catch (Exception e) {
			extentTest.log(Status.FAIL, "Element is not located");

		}
		return element;

	}

	@BeforeSuite
	public void launchBrowser() throws Exception {

		String path = "C:\\Users\\Admin\\Desktop\\";
		String filename = "Expedia.xlsx";
		htmlReporter = new ExtentSparkReporter("./reports/extentreport.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Expedia Report");
		htmlReporter.config().setDocumentTitle("Expedia Regression Run");
		htmlReporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.setSystemInfo("Project", "Expedia");
		extent.setSystemInfo("Browser", "Chrome");
		extent.attachReporter(htmlReporter);

		loadProperties();
		log.info("Launching the Browswer");
		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		log.info("Launching the Url");
		ExcelUtility.setExcelFile(path + filename, "Package");

	}

	@AfterSuite
	public void tearDown() {
		// driver.quit();
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws Exception {
		String methodName = result.getMethod().getMethodName();
		if (result.getStatus() == ITestResult.FAILURE) {
			String path = getScreenShot(methodName);
			try {
				extentTest.fail("Test case failed", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			} catch (Exception e) {
				extentTest.fail("Test failed,cannot take Screenshot");
			}

		}

	}

}
