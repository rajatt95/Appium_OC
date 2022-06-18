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

package _35_WebView.iOS;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Set;
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

public class __52_WebViewContext_Using_SafariWebInspector_Tutor {

	@Test
	public void TC__52_WebViewAutomation() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForiOS();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Dimension size = driver.manage().window().getSize();

		for (int i = 0; i < 1; i++) {
			TouchAction t = new TouchAction(driver);
			t.press(PointOption.point(size.width / 2, (int) (size.height * 0.8)))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
					.moveTo(PointOption.point(size.width / 2, (int) (size.height * 0.2))).release().perform();
		}

		driver.findElement(MobileBy.AccessibilityId("Web View")).click();
		// Thread.sleep(10000);

		Set<String> contextHandles = driver.getContextHandles();
		for (String contextHandle : contextHandles) {
			System.out.println(contextHandle);
		}

		driver.context(contextHandles.toArray()[1].toString());
		System.out.println(driver.findElement(By.cssSelector("body > h1")).getText());
		System.out.println(driver.findElement(By.xpath("//h1")).getText());
		System.out.println(driver.findElement(By.tagName("h1")).getText());

		driver.context("NATIVE_APP");
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//XCUIElementTypeButton[@name=\"UIKitCatalog\"]")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Activity Indicators")).click();
		Thread.sleep(3000);

		driver.quit();

	}

}