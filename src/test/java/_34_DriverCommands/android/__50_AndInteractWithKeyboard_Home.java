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
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;

public class __50_AndInteractWithKeyboard_Home {

	@Test
	public void TC__50_AndInteractWithKeyboard_Home() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForAndroid();
		
		/* Specific to Native apps */
		By views = MobileBy.AccessibilityId("Views");
		By textFields = MobileBy.AccessibilityId("TextFields");
		By editText = MobileBy.id("io.appium.android.apis:id/edit");

		driver.findElement(views).click();

		scroll3Times(driver);

		driver.findElement(textFields).click();
		Thread.sleep(2000);
		System.out.println("((AndroidDriver) driver).isKeyboardShown(): " + ((AndroidDriver) driver).isKeyboardShown());

		// driver.findElement(editText).sendKeys("Hello, Test Automation Engineer");
		((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.Q));
		((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.W));
		((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.E));
		((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.R));
		((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.T));
		((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.Y));
		((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		// driver.findElement(editText).sendKeys("Hello, Test Automation Engineer");

		// ((AndroidDriver) driver).pressKey(new
		// KeyEvent().withKey(AndroidKey.CALCULATOR));
		Thread.sleep(2000);
		// ((AndroidDriver) driver).hideKeyboard();
		// driver.hideKeyboard();
		Thread.sleep(2000);
		System.out.println("((AndroidDriver) driver).isKeyboardShown(): " + ((AndroidDriver) driver).isKeyboardShown());
	}

	private void scroll3Times(AppiumDriver driver) {
		/* This is the optimized way - We'll see it later */
		(new TouchAction(driver)).press(new PointOption().withCoordinates(507, 1679))
				.moveTo(new PointOption().withCoordinates(520, 625)).release().perform();

		(new TouchAction(driver)).press(new PointOption().withCoordinates(494, 1713))
				.moveTo(new PointOption().withCoordinates(499, 560)).release().perform();

		(new TouchAction(driver)).press(new PointOption().withCoordinates(503, 1713))
				.moveTo(new PointOption().withCoordinates(494, 525)).release().perform();
	}

}
