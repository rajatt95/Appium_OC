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

public class __41_TerminateActivateApp {

	@Test
	public void TC__41_TerminateActivateApp() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForiOS();
		/* Specific to Native apps */
		By activityIndicators = MobileBy.AccessibilityId("Activity Indicators");

		driver.findElement(activityIndicators).click();

		Thread.sleep(2000);
		/*  com.example.apple-samplecode.UICatalog -> Bundle ID */
		driver.terminateApp("com.example.apple-samplecode.UICatalog");
		System.out.println("Application - UIKitCatalog terminated successfully");

		driver.activateApp("com.apple.MobileSMS");
		System.out.println("Application - SMS activated successfully");
		Thread.sleep(2000);
		driver.terminateApp("com.apple.MobileSMS");
		System.out.println("Application - SMS terminated successfully");
		Thread.sleep(2000);

		driver.activateApp("com.apple.Bridge");
		System.out.println("Application - Bridge activated successfully");
		Thread.sleep(2000);
		driver.terminateApp("com.apple.Bridge");
		System.out.println("Application - Bridge terminated successfully");
		Thread.sleep(2000);
		
		
	}
}