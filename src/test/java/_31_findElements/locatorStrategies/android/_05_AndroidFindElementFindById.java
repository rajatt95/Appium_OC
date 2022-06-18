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

public class _05_AndroidFindElementFindById {

	@Test
	public void TC_02_AndroidFindElementFindById() throws MalformedURLException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForAndroid();

		//android:id/text1 -> resource-id
		MobileElement acessibilityFindById = (MobileElement) driver.findElementById("android:id/text1");
		System.out.println("acessibilityFindById.getText(): " + acessibilityFindById.getText());
		getAttribute(acessibilityFindById, "package");
		getAttribute(acessibilityFindById, "class");
		getAttribute(acessibilityFindById, "text");
		getAttribute(acessibilityFindById, "content-desc");
		getAttribute(acessibilityFindById, "resource-id");
		getAttribute(acessibilityFindById, "bounds");

	}

	private void getAttribute(MobileElement mobileElement, String attributeName) {
		System.out.println(
				"acessibilityFindById.getAttribute(\"" + attributeName + "\"): " + mobileElement.getAttribute(attributeName));
	}
}
