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
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class __36_GestureSwipe_ForLoop {

	@Test
	public void TC__36_GestureSwipe_ForLoop() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForAndroid();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/* Specific to Native apps */
		By views = MobileBy.AccessibilityId("Views");
		By textFields = MobileBy.AccessibilityId("TextFields");
		By editText = MobileBy.id("io.appium.android.apis:id/edit");

		driver.findElement(views).click();

		//scroll3Times(driver);
		scroll3TimesLecture(driver);
		
//		driver.findElement(textFields).click();
//		driver.findElement(editText).sendKeys("Hello, Test Automation Engineer");
//		Thread.sleep(3000);
//		driver.findElement(editText).clear();
//		Thread.sleep(3000);
	}

	private void scroll3TimesLecture(AppiumDriver driver) {
		
		
		Dimension dimension = driver.manage().window().getSize();
		int startX = dimension.width/2;
		int endX = startX;
		int startY = (int)(dimension.height * 0.8);
		int endY= (int)(dimension.height * 0.2);
		
		
		for(int i=0;i<4;i++) {
			TouchAction touchAction = new TouchAction(driver);
			touchAction.
				/*Using the PointOption is worst practice : Varies with device-to-device (Screen resolution)*/
				//press(PointOption.point(477, 1891)).
				press(PointOption.point(startX, startY)).
				/*It'll take 2 seconds to complete swipe operation*/
				waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).
				//moveTo(PointOption.point(494, 386))
				moveTo(PointOption.point(endX, endY))
				.release()
				.perform();
		}
	
		
		/* This is not the optimized way - We'll see it later */
//		(new TouchAction(driver)).
//				press(new PointOption().withCoordinates(507, 1679)).
//				moveTo(new PointOption().withCoordinates(520, 625)).
//				release().perform();
//
//		(new TouchAction(driver)).
//				press(new PointOption().withCoordinates(494, 1713)).
//				moveTo(new PointOption().withCoordinates(499, 560)).
//				release().perform();
//
//		(new TouchAction(driver)).
//				press(new PointOption().withCoordinates(503, 1713)).
//				moveTo(new PointOption().withCoordinates(494, 525)).release().perform();
	

	}

	
	private void scroll3Times(AppiumDriver driver) {
		/* This is not the optimized way - We'll see it later */
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
