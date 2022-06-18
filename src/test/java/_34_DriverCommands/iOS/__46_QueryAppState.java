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

package _34_DriverCommands.iOS;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class __46_QueryAppState {

	@Test
	public void TC__46_QueryAppState() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForiOS();
		/* Specific to Native apps */
		By activityIndicators = MobileBy.AccessibilityId("Activity Indicators");

		driver.findElement(activityIndicators).click();

		System.out.println("driver.queryAppState(\"com.example.apple-samplecode.UICatalog\"): "
				+ driver.queryAppState("com.example.apple-samplecode.UICatalog"));

		driver.terminateApp("com.example.apple-samplecode.UICatalog");
		System.out.println("Application terminated successfully");

		System.out.println("driver.queryAppState(\"com.example.apple-samplecode.UICatalog\"): "
				+ driver.queryAppState("com.example.apple-samplecode.UICatalog"));

		System.out.println("------------");
		System.out.println(
				"driver.queryAppState(\"com.apple.MobileSMS\"): " + driver.queryAppState("com.apple.MobileSMS"));

		System.out.println("driver.queryAppState(\"com.apple.Bridge\"): " + driver.queryAppState("com.apple.Bridge"));

		System.out.println("App queryAppState success");
	}
}