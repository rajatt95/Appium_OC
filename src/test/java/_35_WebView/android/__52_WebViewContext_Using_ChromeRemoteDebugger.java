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

package _35_WebView.android;

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

public class __52_WebViewContext_Using_ChromeRemoteDebugger {

	@Test
	public void TC__52_WebViewAutomation() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForAndroid();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Clicking on Views");
		driver.findElement(MobileBy.AccessibilityId("Views")).click();

		scroll3TimesLecture(driver);

		System.out.println("Clicking on webView");
		driver.findElement(MobileBy.AccessibilityId("WebView")).click();
		Thread.sleep(3000);

		Set<String> contextHandles = driver.getContextHandles();
		System.out.println("---------------");
		for (String contextHandle : contextHandles) {
			System.out.println("contextHandle: " + contextHandle);
		}
		switchToWebView(driver, contextHandles);

		System.out.println("getText(): " + driver.findElement(By.cssSelector("body > h1")).getText());

		driver.findElement(By.xpath("//*[@id=\"i_am_a_textbox\"]")).sendKeys("Hi, Test Automatio Engineer");

		switchToNativeView(driver);

		System.out.print("Succcess");
	}

	private void switchToNativeView(AppiumDriver driver) {

		// To switch the context to Native View
		// NATIVE_APP -> This will always be same for Native elements
		driver.context("NATIVE_APP");

	}

	private void switchToWebView(AppiumDriver driver, Set<String> contextHandles) {
		System.out.println("---------------switchToWebView (START)");
		System.out.println("Switching to WebView");

//		driver.context("WEBVIEW"); // -> This also Works fine

		String webViewContext = contextHandles.toArray()[1].toString();
		System.out.println("webViewContext: " + webViewContext);
		driver.context(webViewContext);

		System.out.println("---------------switchToWebView (END)");
	}

	private void scroll3TimesLecture(AppiumDriver driver) {

		Dimension dimension = driver.manage().window().getSize();
		int startX = dimension.width / 2;
		int endX = startX;
		int startY = (int) (dimension.height * 0.8);
		int endY = (int) (dimension.height * 0.2);

		for (int i = 0; i < 3; i++) {
			TouchAction touchAction = new TouchAction(driver);
			touchAction.
			/*
			 * Using the PointOption is worst practice : Varies with device-to-device
			 * (Screen resolution)
			 */
			// press(PointOption.point(477, 1891)).
					press(PointOption.point(startX, startY)).
					/* It'll take 2 seconds to complete swipe operation */
					waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).
					// moveTo(PointOption.point(494, 386))
					moveTo(PointOption.point(endX, endY)).release().perform();
		}

	}
}
