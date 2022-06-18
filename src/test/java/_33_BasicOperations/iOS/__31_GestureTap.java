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
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class __31_GestureTap {

	//Tap, Press, Long Press, WaitAction, Release, Perform, MoveTo
	
	@Test
	public void TC__31_GestureTap() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForiOS();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/* Specific to Native apps */
		By search = MobileBy.AccessibilityId("Search");
		By _default = MobileBy.AccessibilityId("Default");
		By scopeTwo = MobileBy.AccessibilityId("Scope Two");

		TouchAction touchAction = new TouchAction(driver);
		// touchAction.tap(ElementOption.element(driver.findElement(views))).perform();

		/* 150,1750 -> Co-ordinates found using Appium Inspector */
		touchAction.tap(PointOption.point(90, 458)).perform();

		//touchAction.tap(ElementOption.element(driver.findElement(animation))).perform();
		touchAction.tap(TapOptions.tapOptions().withElement
				(ElementOption.element(driver.findElement(_default)))).perform();
		
		touchAction.tap(ElementOption.element(driver.findElement(scopeTwo))).perform();
	}
}
