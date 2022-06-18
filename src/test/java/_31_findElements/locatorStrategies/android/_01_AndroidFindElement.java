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

package _31_findElements.locatorStrategies.android;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class _01_AndroidFindElement {

	@Test
	public void TC__01_AndroidFindElement() throws MalformedURLException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForAndroid();

		// Casting
		MobileElement acessibilityElement = (MobileElement) driver.findElementByAccessibilityId("Graphics");
		System.out.println(" -> getText(): " + acessibilityElement.getText() + "\t -> findEl ementByAccessibilityId()");

		acessibilityElement = (MobileElement) driver.findElementById("android:id/text1");
		System.out.println(" -> getText(): " + acessibilityElement.getText() + "\t -> findElementById()");

		acessibilityElement = (MobileElement) driver.findElementByClassName("android.widget.TextView");
		System.out.println(" -> getText(): " + acessibilityElement.getText() + "\t -> findElementByClassName()");

		acessibilityElement = (MobileElement) driver
				.findElementByXPath("//android.widget.TextView[@content-desc=\"Graphics\"]");
		System.out.println(" -> getText(): " + acessibilityElement.getText() + "\t -> findElementByXPath()");

		acessibilityElement = (MobileElement) driver.findElementByXPath("//*[@text=\"Accessibility\"]");
		System.out.println(" -> getText(): " + acessibilityElement.getText() + "\t -> findElementByXPath()");

	}

}
