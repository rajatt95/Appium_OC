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

public class _02_StartDriverSession_OpenInstalledApp {

	private static final String APPIUM_URL = "http://localhost:4723/wd/hub";
	static String appLocation;

	// Make sure Device is ready

	public static void main(String[] args) throws MalformedURLException {
		setCaps_OpenApp_StartSessionForAndroid();
	}

	private static void setCaps_OpenApp_StartSessionForAndroid() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities(); //
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		caps.setCapability("appPackage", "io.appium.android.apis");
		caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		// caps.setCapability("appActivity",
		// "io.appium.android.apis.ApiDemos.media.VideoViewDemo");

		
		URL url = new URL(APPIUM_URL);

		/* This will create the new Driver session by using the above capabilities */
		AppiumDriver driver = new AndroidDriver(url, caps);
		System.out.println("driver.getSessionId(): " + driver.getSessionId());

//		{
//		  "platformName": "Android",
//		  "appium:deviceName": "Pixel 3",
//		  "appium:automationName": "UiAutomator2",
//		  "appium:udid": "emulator-5554",
//		  "appium:appPackage": "io.appium.android.apis",
//		  "appium:appActivity": "io.appium.android.apis.ApiDemos",
//		}
	}

}
