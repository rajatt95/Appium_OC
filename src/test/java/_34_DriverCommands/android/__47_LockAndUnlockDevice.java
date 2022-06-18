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
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class __47_LockAndUnlockDevice {

	@Test
	public void TC__47_LockAndUnlockDevice() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForAndroid();
		
		/* Specific to Native apps */
		By views = MobileBy.AccessibilityId("Views");
		driver.findElement(views).click();

		/*This will lock the device and un-lock it after 5 seconds*/
		((AndroidDriver)driver).lockDevice(Duration.ofSeconds(5));
		
		scroll3Times(driver);
		
		System.out.println("Device lock and un-lock success");

	}

	private void scroll3Times(AppiumDriver driver) {
		/* This is the optimized way - We'll see it later */
		(new TouchAction(driver)).
				press(new PointOption().withCoordinates(507, 1679)).
				moveTo(new PointOption().withCoordinates(520, 625)).
				release().perform();

		(new TouchAction(driver)).
				press(new PointOption().withCoordinates(494, 1713)).
				moveTo(new PointOption().withCoordinates(499, 560)).
				release().perform();

		(new TouchAction(driver)).
				press(new PointOption().withCoordinates(503, 1713)).
				moveTo(new PointOption().withCoordinates(494, 525)).release().perform();
	}


}