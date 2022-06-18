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

public class _04_AndroidFindElementFindByAccessibilityId {

	@Test
	public void TC_01_AndroidFindElementFindByAccessibilityId() throws MalformedURLException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForAndroid();

		// WebElement acessibility =
		// driver.findElementByAccessibilityId("Accessibility");
		MobileElement acessibilityFindByAccessibilityId = (MobileElement) driver
				.findElementByAccessibilityId("Accessibility");

		System.out
				.println("acessibilityFindByAccessibilityId.getText(): " + acessibilityFindByAccessibilityId.getText());
		getAttribute(acessibilityFindByAccessibilityId, "package");
		getAttribute(acessibilityFindByAccessibilityId, "class");
		getAttribute(acessibilityFindByAccessibilityId, "text");
		getAttribute(acessibilityFindByAccessibilityId, "content-desc");
		getAttribute(acessibilityFindByAccessibilityId, "resource-id");
		getAttribute(acessibilityFindByAccessibilityId, "bounds");

	}

	private void getAttribute(MobileElement mobileElement, String attributeName) {
		System.out.println("acessibilityFindByAccessibilityId.getAttribute(\"" + attributeName + "\"): "
				+ mobileElement.getAttribute(attributeName));
	}
}
