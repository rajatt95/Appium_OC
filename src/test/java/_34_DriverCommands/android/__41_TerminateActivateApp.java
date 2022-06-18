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

public class __41_TerminateActivateApp {

	@Test
	public void TC__41_TerminateActivateApp() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForAndroid();
		/* Specific to Native apps */
		By views = MobileBy.AccessibilityId("Views");

		driver.findElement(views).click();

		Thread.sleep(2000);
		/* io.appium.android.apis -> Package ID */
		driver.terminateApp("io.appium.android.apis");
		System.out.println("Application - APKInfo terminated successfully");

		driver.activateApp("com.android.settings");
		System.out.println("Application - Settings activated successfully");
		Thread.sleep(2000);
		driver.terminateApp("com.android.settings");
		System.out.println("Application - Settings terminated successfully");
		Thread.sleep(2000);
		driver.activateApp("com.google.android.calendar");
		System.out.println("Application - Calendar activated successfully");
		Thread.sleep(2000);
		driver.activateApp("com.android.contacts");
		System.out.println("Application - Contacts activated successfully");

		
	}
}