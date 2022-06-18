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

package _34_DriverCommands.android;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class __46_QueryAppState {

	@Test
	public void TC__46_QueryAppState() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForAndroid();
		/* Specific to Native apps */
		By views = MobileBy.AccessibilityId("Views");

		driver.findElement(views).click();

		System.out.println(
				"driver.queryAppState(\"io.appium.android.apis\"): " + driver.queryAppState("io.appium.android.apis"));

		System.out.println(
				"driver.queryAppState(\"com.android.settings\"): " + driver.queryAppState("com.android.settings"));

		System.out.println(
				"driver.queryAppState(\"com.android.contacts\"): " + driver.queryAppState("com.android.contacts"));

		System.out.println("driver.queryAppState(\"com.google.android.calendar\"): "
				+ driver.queryAppState("com.google.android.calendar"));

		System.out.println("App queryAppState success");
	}
}