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
import io.appium.java_client.FindsByIosNSPredicate;
import io.appium.java_client.MobileElement;

public class _03_iOSFindElements_iOS_PredicateString {

	// iOS Predicate String -> Specific to iOS
	// iOS Predicate String - powered by Apple
	// Faster than XPath and iOS class chain

	// Fast -> Slow
	// iOS Predicate String -> iOS class chain -> XPath

	@Test
	public void TC_03_iOSFindElements_iOS_PredicateString() throws MalformedURLException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForiOS();

		MobileElement myElement = (MobileElement) ((FindsByIosNSPredicate) driver)
				.findElementByIosNsPredicate("label == \"SliderViewController\"");
		System.out.println(" -> getText(): " + myElement.getText() + "\t -> FindsByIosNSPredicate()");

		myElement = (MobileElement) ((FindsByIosNSPredicate) driver)
				.findElementByIosNsPredicate("name == \"SearchViewControllers\" AND name =\"SearchViewControllers\"");
		System.out.println(" -> getText(): " + myElement.getText() + "\t -> FindsByIosNSPredicate()");

		myElement = (MobileElement) ((FindsByIosNSPredicate) driver)
				.findElementByIosNsPredicate("value == \"SegmentedControlViewController\"");
		System.out.println(" -> getText(): " + myElement.getText() + "\t -> FindsByIosNSPredicate()");

		// Use Type Attribute for className in iOS
		myElement = (MobileElement) ((FindsByIosNSPredicate) driver)
				.findElementByIosNsPredicate("type == \"XCUIElementTypeStaticText\"");
		System.out.println(" -> getText(): " + myElement.getText() + "\t -> FindsByIosNSPredicate()");

	}

}
