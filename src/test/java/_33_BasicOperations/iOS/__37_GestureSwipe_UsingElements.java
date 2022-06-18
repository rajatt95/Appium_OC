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
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class __37_GestureSwipe_UsingElements {

	@Test
	public void TC__37_GestureSwipe_UsingElements() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForiOS();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/* Specific to Native apps */
		By steppers = MobileBy.AccessibilityId("Steppers");
		By activityIndicators = MobileBy.AccessibilityId("Activity Indicators");

//		driver.findElement(steppers).click();

		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(ElementOption.element(driver.findElement(steppers))).
		/* It'll take 2 seconds to complete swipe operation */
				waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
				.moveTo(ElementOption.element(driver.findElement(activityIndicators)))
				.release()
				.perform();

	}
}
