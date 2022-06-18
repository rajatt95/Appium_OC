/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Appium Mobile Automation - Android & iOS + Frameworks + CICD (https://www.udemy.com/course/the-complete-appium-course-for-ios-and-android/)
 * Tutor: Omprakash Chavan (https://www.udemy.com/user/omprakash-chavan/)
 */

/***************************************************/

package _36_AutomateBrowser.android;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import _01_com.learning.utils.CreateBrowserSession;
import io.appium.java_client.AppiumDriver;

public class __62_AutomateBrowser_Tesla {

	@Test
	public void TC__62_AndAutomateBrowser_Tesla() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateBrowserSession.initializeDriverforAndroid();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.tesla.com/");
		Thread.sleep(5000);

		By menuIcon = By.xpath("//button/span[text()='Menu']");
		By menuModelX = By.xpath("//span[text()='Model X']");
//		By buttonOrderNow = By.xpath("//*[@id=\"tesla-hero-showcase-6682\"]//a[@title='Order Now']");
		By buttonOrderNow = By.xpath("//a[@data-gtm-drawer='hero']");
		
		By buttonContinueToPayment = By.xpath("//button[@data-id='btn-navigation']");

		/* Appium does not convert Locators internally due to limitations. */
		// driver.findElement(By.name("q")).sendKeys("Hello, Test Automation Engineer");

		driver.findElement(menuIcon).click();
		driver.findElement(menuModelX).click();
		driver.findElement(buttonOrderNow).click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(buttonContinueToPayment);

		System.out.println("Scroll to Element");
		jse.executeScript("arguments[0].scrollIntoView(true);", element);

		driver.findElement(buttonContinueToPayment).click();
		Thread.sleep(5000);

	}
}
