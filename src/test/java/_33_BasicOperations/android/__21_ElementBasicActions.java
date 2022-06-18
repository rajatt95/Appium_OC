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

package _33_BasicOperations.android;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class __21_ElementBasicActions {

	// click, sendKeys, clear

	@Test 
	public void TC__21_ElementBasicActions() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForAndroid();

		/* Specific to Native apps */
		By views = MobileBy.AccessibilityId("Views");
		By textFields = MobileBy.AccessibilityId("TextFields");
		By editText = MobileBy.id("io.appium.android.apis:id/edit");

		driver.findElement(views).click();

		scroll3Times(driver);

		driver.findElement(textFields).click();
		driver.findElement(editText).sendKeys("Hello, Test Automation Engineer");
		Thread.sleep(3000);
		driver.findElement(editText).clear();
		Thread.sleep(3000);
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
