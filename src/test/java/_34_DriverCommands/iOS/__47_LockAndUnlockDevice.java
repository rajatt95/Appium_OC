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
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class __47_LockAndUnlockDevice {

	@Test
	public void TC__47_LockAndUnlockDevice() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForiOS();

		/* Specific to Native apps */
		By activityIndicators = MobileBy.AccessibilityId("Activity Indicators");

		driver.findElement(activityIndicators).click();

		/* This will lock the device and un-lock it after 5 seconds */
		((IOSDriver) driver).lockDevice(Duration.ofSeconds(5));

		System.out.println("Device lock and un-lock success");

	}

}