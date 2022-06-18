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

package _32_DefiningElements.android;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class __11_DifferentWaysOfDefiningElements {

	@Test
	public void TC__01_AndroidFindElement() throws MalformedURLException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForAndroid();

		/* Web apps */
		By elementBy = By.xpath("//*[@text=\"Accessibility\"]");

		/* Specific to Native apps */
		By elementMobileBy = MobileBy.AccessibilityId("Accessibility");

		System.out.println("elementBy: " + driver.findElement(elementBy).getText());
		System.out.println("elementMobileBy: " + driver.findElement(elementMobileBy).getText());

		/*****************************************/

		MobileElement mobileElement = (MobileElement) driver.findElementByAccessibilityId("Graphics");
		System.out.println("mobileElement: " + mobileElement.getText());

		WebElement webElement = driver.findElementByAccessibilityId("Graphics");
		System.out.println("webElement: " + webElement.getText());

	}

}
