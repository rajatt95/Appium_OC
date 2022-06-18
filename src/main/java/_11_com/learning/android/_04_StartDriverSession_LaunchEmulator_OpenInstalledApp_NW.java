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

package _11_com.learning.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class _04_StartDriverSession_LaunchEmulator_OpenInstalledApp_NW {

	private static final String APPIUM_URL = "http://localhost:4723/wd/hub";
	static String appLocation;

	// No need to make sure Device is ready, we will launch it programatically

	public static void main(String[] args) throws MalformedURLException {
		setCaps_LaunchEmulator_OpenApp_StartSessionForAndroid();
	}

	private static void setCaps_LaunchEmulator_OpenApp_StartSessionForAndroid() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities(); //
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
	//	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");

		caps.setCapability("avd", "Pixel_3");
		// Default time is 60 seconds
		// We are setting it as 180 seconds
		caps.setCapability("avdLaunchTimeout", "180000");

		//Driver session will be active for 1 min  - Not Working
		caps.setCapability("newCommandTimeout", "60000");

		caps.setCapability("appPackage", "io.appium.android.apis");
		caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		// caps.setCapability("appActivity",
		// "io.appium.android.apis.ApiDemos.media.VideoViewDemo");

		URL url = new URL(APPIUM_URL);

		/* This will create the new Driver session by using the above capabilities */
		AppiumDriver driver = new AndroidDriver(url, caps);
		System.out.println("driver.getSessionId(): " + driver.getSessionId());

	}

}
