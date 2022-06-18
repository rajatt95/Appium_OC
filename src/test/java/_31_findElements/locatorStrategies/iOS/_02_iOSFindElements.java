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
import java.util.List;

import org.testng.annotations.Test;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class _02_iOSFindElements {

	@Test
	public void TC_02_iOSFindElement() throws MalformedURLException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForiOS();

		// Use Type Attribute for className in iOS

		List<MobileElement> elements = (List<MobileElement>) driver
				.findElementsByClassName("XCUIElementTypeStaticText");
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i).getText());
		}

	}

}
