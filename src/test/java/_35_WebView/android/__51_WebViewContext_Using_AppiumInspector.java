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

public class __51_WebViewContext_Using_AppiumInspector {

	// This way is not recommended
	// We should not use Appium Inspector for finding Web View elements

	@Test
	public void TC__51_WebViewAutomation() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateDriverSession.initializeDriverForAndroid();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		By views = MobileBy.AccessibilityId("Views");
		By webView2 = MobileBy.AccessibilityId("WebView2");

		/* Found by Appium Inspector - Not Recommended */
		// Because this element is present under WebView
		By thisPageIsSecondSeleniumSandbox = MobileBy.xpath("//android.webkit.WebView/android.view.View[1]");

		driver.findElement(views).click();

		scroll3TimesLecture(driver);

		System.out.println("Clicking on webView");
		driver.findElement(webView2).click();
		Thread.sleep(3000);

		System.out.println("driver.findElement(thisPageIsSecondSeleniumSandbox).getText(): "
				+ driver.findElement(thisPageIsSecondSeleniumSandbox).getText());

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
