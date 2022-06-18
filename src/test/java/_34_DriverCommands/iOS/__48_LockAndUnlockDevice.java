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
import io.appium.java_client.ios.IOSDriver;

public class __48_LockAndUnlockDevice {

	@Test
	public void TC__48_LockAndUnlockDevice() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForiOS();

		/* Specific to Native apps */
		By activityIndicators = MobileBy.AccessibilityId("Activity Indicators");

		driver.findElement(activityIndicators).click();

		System.out.println("Lock device");
		((IOSDriver) driver).lockDevice();
		Thread.sleep(2000);
		System.out.println("((IOSDriver)driver).isDeviceLocked(): " + ((IOSDriver) driver).isDeviceLocked());
		Thread.sleep(2000);
		System.out.println("UnLock device");
		((IOSDriver) driver).unlockDevice();

		System.out.println("Device lock and un-lock success");

	}

}