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
import java.util.List;

import org.testng.annotations.Test;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;

public class _03_AndroidFindElements_UIAutomator {

	// UIAutomator -> Specific to Android

	@Test
	public void TC__01_AndroidFindElement() throws MalformedURLException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForAndroid();

		MobileElement myElement = (MobileElement) ((FindsByAndroidUIAutomator) driver).
		// findElementByAndroidUIAutomator("new UISelector().text(\"Animation\")");
				findElementByAndroidUIAutomator("text(\"Animation\")");
		// By myElement = MobileBy.AndroidUIAutomator("");
		System.out.println("text(): " + myElement.getText());

		myElement = (MobileElement) ((FindsByAndroidUIAutomator) driver)
				.findElementByAndroidUIAutomator("className(\"android.widget.TextView\")");
		System.out.println("className(): " + myElement.getText());

		myElement = (MobileElement) ((FindsByAndroidUIAutomator) driver)
				.findElementByAndroidUIAutomator("description(\"Accessibility\")");
		System.out.println("description(): " + myElement.getText());

		myElement = (MobileElement) ((FindsByAndroidUIAutomator) driver)
				.findElementByAndroidUIAutomator("resourceId(\"android:id/text1\")");
		System.out.println("resourceId(): " + myElement.getText());

		System.out.println( "---------------------------------------------");

		List<MobileElement> elements = (List<MobileElement>) ((FindsByAndroidUIAutomator) driver)
				.findElementsByAndroidUIAutomator("className(\"android.widget.TextView\")");
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i).getText());
		}

	}

}
