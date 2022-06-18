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

package _33_BasicOperations.iOS;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class __22_ElementAttributes {

	@Test
	public void TC__22_ElementAttributes() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForiOS();

		/* MobileBy - Specific to Native apps */
		By by = MobileBy.AccessibilityId("Activity Indicators");
		MobileElement element = (MobileElement) driver.findElement(by);

		
		System.out.println("getText(): " + element.getText());
		System.out.println("isDisplayed(): " + element.isDisplayed());
		System.out.println("isEnabled(): " + element.isEnabled());
		System.out.println("isSelected(): " + element.isSelected());

		System.out.println("------------------------");

		getAttribute(element, "type");
		getAttribute(element, "value");
		getAttribute(element, "name");
		getAttribute(element, "label");
		getAttribute(element, "accessible");
		getAttribute(element, "enabled");
		getAttribute(element, "visible");
	}

	private void getAttribute(MobileElement mobileElement, String attributeName) {
		System.out.println("getAttribute(\"" + attributeName + "\"): " + mobileElement.getAttribute(attributeName));
	}

}
