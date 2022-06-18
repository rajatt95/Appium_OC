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
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class __45_RunAppInBackground {

	@Test
	public void TC__45_RunAppInBackground() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForAndroid();
		/* Specific to Native apps */
		By views = MobileBy.AccessibilityId("Views");

		driver.findElement(views).click();

		/* App will run in Background for 5 seconds and will come in foreground after 5 seconds*/
		driver.runAppInBackground(Duration.ofMillis(5000));

		System.out.println("App ran in background success");
	}
}