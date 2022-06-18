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

package _12_com.learning.iOS;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class _02_StartDriverSession_OpenInstalledApp {

	private static final String APPIUM_URL = "http://localhost:4723/wd/hub";
	static String appLocation;

	// Make sure Device is ready

	public static void main(String[] args) throws MalformedURLException {
		setCaps_OpenApp_StartSessionForiOS();
	}

	private static void setCaps_OpenApp_StartSessionForiOS() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		caps.setCapability(MobileCapabilityType.UDID, "18FB4726-3A15-498D-8F7E-84965AB706EF");
		caps.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");

		URL url = new URL(APPIUM_URL);

		/* This will create the new Driver session by using the above capabilities */
		AppiumDriver driver = new IOSDriver(url, caps);
		System.out.println("driver.getSessionId(): " + driver.getSessionId());

//		{
//		  "platformName": "iOS",
//		  "appium:deviceName": "iPhone 13",
//		  "appium:automationName": "XCUITest",
//		  "appium:udid": "18FB4726-3A15-498D-8F7E-84965AB706EF",
//		  "appium:bundleId": "com.example.apple-samplecode.UICatalog"
//		}
	}

}
