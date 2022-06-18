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

package _33_BasicOperations.iOS;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class __33_GestureLongPress {

	@Test
	public void TC__33_GestureLongPress() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForiOS();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/* Specific to Native apps */
		By search = MobileBy.AccessibilityId("Search");
		By _default = MobileBy.AccessibilityId("Default");
		By scopeTwo = MobileBy.AccessibilityId("Scope Two");

		TouchAction touchAction = new TouchAction(driver);
		touchAction.longPress(ElementOption.element(driver.findElement(search))).
		/* It'll keep the element in press state */
		// waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).
				waitAction(WaitOptions.waitOptions(Duration.ofMillis(10000))).
				/* Releasing the press */
				release().
				/* Performing the whole action */
				perform();

		/* 150,1750 -> Co-ordinates found using Appium Inspector */
		// touchAction.tap(PointOption.point(150, 1750)).perform();

		// touchAction.tap(ElementOption.element(driver.findElement(animation))).perform();
		touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(_default))))
				.perform();

		touchAction.tap(ElementOption.element(driver.findElement(scopeTwo))).perform();
	}
}
