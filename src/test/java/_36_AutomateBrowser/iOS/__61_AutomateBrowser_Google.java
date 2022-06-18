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

package _36_AutomateBrowser.iOS;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import _01_com.learning.utils.CreateBrowserSession;
import io.appium.java_client.AppiumDriver;

public class __61_AutomateBrowser_Google {

	@Test
	public void TC__61_AndAutomateBrowser_Google() throws MalformedURLException, InterruptedException {
		AppiumDriver driver = CreateBrowserSession.initializeDriverForiOS();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");
		Thread.sleep(5000);

		/* Appium does not convert Locators internally due to limitations. */
		// driver.findElement(By.name("q")).sendKeys("Hello, Test Automation Engineer");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello, Test Automation Engineer");
		Thread.sleep(5000);

	}
}
