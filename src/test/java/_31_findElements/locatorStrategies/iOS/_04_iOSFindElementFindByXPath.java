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

public class _04_iOSFindElementFindByXPath {

	@Test
	public void TC_03_iOSFindElementFindByXPath() throws MalformedURLException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForiOS();

		MobileElement sliderViewController = (MobileElement) driver
				.findElementByXPath("//XCUIElementTypeStaticText[@name=\"SliderViewController\"]");
		System.out.println("acessibilityFindByXPath.getText(): " + sliderViewController.getText());
		getAttribute(sliderViewController, "type");
		getAttribute(sliderViewController, "value");
		getAttribute(sliderViewController, "name");
		getAttribute(sliderViewController, "accessible");

	}

	private void getAttribute(MobileElement mobileElement, String attributeName) {
		System.out.println("acessibilityFindByXPath.getAttribute(\"" + attributeName + "\"): "
				+ mobileElement.getAttribute(attributeName));
	}
}
