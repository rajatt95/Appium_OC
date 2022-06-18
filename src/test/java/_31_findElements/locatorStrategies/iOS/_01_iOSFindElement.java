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

package _31_findElements.locatorStrategies.iOS;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class _01_iOSFindElement {

	@Test
	public void TC__01_iOS_FindElement() throws MalformedURLException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForiOS();

		// Casting
		MobileElement myElement = (MobileElement) driver.findElementByAccessibilityId("Activity Indicators");
		System.out.println(" -> getText(): " + myElement.getText() + "\t -> findElementByAccessibilityId()");

		// Use Type Attribute for className in iOS
		myElement = (MobileElement) driver.findElementByClassName("XCUIElementTypeStaticText");
		System.out.println(" -> getText(): " + myElement.getText() + "\t -> findElementByClassName()");

		myElement = (MobileElement) driver.findElementByName("SliderViewController");
		System.out.println(" -> getText(): " + myElement.getText() + "\t -> findElementByName()");

		myElement = (MobileElement) driver
				.findElementByXPath("//XCUIElementTypeStaticText[@name=\"SliderViewController\"]");
		System.out.println(" -> getText(): " + myElement.getText() + "\t -> findElementByXPath()");

	}

}
