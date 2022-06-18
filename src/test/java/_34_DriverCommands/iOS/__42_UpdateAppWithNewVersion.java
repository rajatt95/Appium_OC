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

import java.io.File;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.appmanagement.AndroidInstallApplicationOptions;

public class __42_UpdateAppWithNewVersion {

	@Test
	public void TC__42_UpdateAppWithNewVersion() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForiOS();

		/* Specific to Native apps */
		By activityIndicators = MobileBy.AccessibilityId("Activity Indicators");

		driver.findElement(activityIndicators).click();

		String iOSAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
				+ File.separator + "resources" + File.separator + "UIKitCatalog-iphonesimulator.app";
		driver.installApp(iOSAppUrl, new AndroidInstallApplicationOptions().withReplaceEnabled());
		System.out.println("Application upgraded successfully.");
	}
}