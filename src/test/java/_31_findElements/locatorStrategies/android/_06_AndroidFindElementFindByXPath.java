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

public class _06_AndroidFindElementFindByXPath {

	@Test
	public void TC_03_AndroidFindElementFindByXPath() throws MalformedURLException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForAndroid();

		MobileElement acessibilityFindByXPath = (MobileElement) driver
				.findElementByXPath("//android.widget.TextView[@content-desc=\"Accessibility\"]");
		System.out.println("acessibili tyFindByXPath.getText(): " + acessibilityFindByXPath.getText());
		getAttribute(acessibilityFindByXPath, "package");
		getAttribute(acessibilityFindByXPath, "class");
		getAttribute(acessibilityFindByXPath, "text");
		getAttribute(acessibilityFindByXPath, "content-desc");
		getAttribute(acessibilityFindByXPath, "resource-id");
		getAttribute(acessibilityFindByXPath, "bounds");

	}

	private void getAttribute(MobileElement mobileElement, String attributeName) {
		System.out.println("acessibilityFindByXPath.getAttribute(\"" + attributeName + "\"): "
				+ mobileElement.getAttribute(attributeName));
	}
}
