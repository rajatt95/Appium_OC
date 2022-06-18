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

package _34_DriverCommands.iOS;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;

public class __49_AndInteractWithKeyboard {

	@Test
	public void TC__49_InteractWithKeyboard() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForiOS();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/* Specific to Native apps */
		By textFields = MobileBy.AccessibilityId("Text Fields");
		By textField_Default = MobileBy.xpath(
				"//XCUIElementTypeApplication[@name=\"UIKitCatalog\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField");

		By textField_Default_Q = MobileBy.AccessibilityId("q");
		By textField_Default_W = MobileBy.AccessibilityId("w");
		By textField_Default_E = MobileBy.AccessibilityId("e");
		By textField_Default_R = MobileBy.AccessibilityId("r");
		By textField_Default_T = MobileBy.AccessibilityId("t");
		By textField_Default_Y = MobileBy.AccessibilityId("y");
		By textField_Default_Done = MobileBy.AccessibilityId("Done");

		driver.findElement(textFields).click();
		driver.findElement(textField_Default).click();

		Thread.sleep(5000);

		System.out.println("((IOSDriver) driver).isKeyboardShown(): " + ((IOSDriver) driver).isKeyboardShown());

		driver.findElement(textField_Default_Q).click();
		driver.findElement(textField_Default_W).click();
		driver.findElement(textField_Default_E).click();
		driver.findElement(textField_Default_R).click();
		driver.findElement(textField_Default_T).click();
		driver.findElement(textField_Default_Y).click();

		Thread.sleep(2000);
		driver.findElement(textField_Default_Done).click();

		//driver.hideKeyboard();
		
		Thread.sleep(2000);
		System.out.println("((IOSDriver) driver).isKeyboardShown(): " + ((IOSDriver) driver).isKeyboardShown());

	}

}
