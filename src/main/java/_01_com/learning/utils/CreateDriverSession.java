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

package _01_com.learning.utils;

import static _01_com.learning.utils.FrameworkConstants.APPIUM_URL;
import static _01_com.learning.utils.FrameworkConstants.Capability_AVD;
import static _01_com.learning.utils.FrameworkConstants.Capability_Android_AVD;
import static _01_com.learning.utils.FrameworkConstants.Capability_Android_AppActivity;
import static _01_com.learning.utils.FrameworkConstants.Capability_Android_AppPackage;
import static _01_com.learning.utils.FrameworkConstants.Capability_Android_Automation_Name;
import static _01_com.learning.utils.FrameworkConstants.Capability_Android_Device_Name;
import static _01_com.learning.utils.FrameworkConstants.Capability_Android_UDID;
import static _01_com.learning.utils.FrameworkConstants.Capability_AppActivity;
import static _01_com.learning.utils.FrameworkConstants.Capability_AppPackage;
import static _01_com.learning.utils.FrameworkConstants.Capability_BundleID;
import static _01_com.learning.utils.FrameworkConstants.Capability_iOS_AutomationName;
import static _01_com.learning.utils.FrameworkConstants.Capability_iOS_BundleID;
import static _01_com.learning.utils.FrameworkConstants.Capability_iOS_Device_Name;
import static _01_com.learning.utils.FrameworkConstants.Capability_iOS_Platform_Name;
import static _01_com.learning.utils.FrameworkConstants.Capability_iOS_UDID;
import static _01_com.learning.utils.FrameworkConstants.iOSApp_UiCatalog_Location;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CreateDriverSession {

	public static AppiumDriver initializeDriverForAndroid() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities(); //
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, Capability_Android_Device_Name);
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, Capability_Android_Automation_Name);
		caps.setCapability(MobileCapabilityType.UDID, Capability_Android_UDID);
		caps.setCapability(Capability_AVD, Capability_Android_AVD);
		caps.setCapability(Capability_AppPackage, Capability_Android_AppPackage);
		caps.setCapability(Capability_AppActivity, Capability_Android_AppActivity);

		URL url = new URL(APPIUM_URL);

		/* This will create the new Driver session by using the above capabilities */
		AppiumDriver driver = new AndroidDriver(url, caps);
		System.out.println("driver.getSessionId(): " + driver.getSessionId());
		return driver;
	}

	public static AppiumDriver initializeDriverForiOS() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Capability_iOS_Platform_Name);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, Capability_iOS_Device_Name);
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, Capability_iOS_AutomationName);
		caps.setCapability(MobileCapabilityType.UDID, Capability_iOS_UDID);
		caps.setCapability(Capability_BundleID, Capability_iOS_BundleID);

		// caps.setCapability("includeSafariInWebiews", true );
		// caps.setCapability("webviewConnectTimeout", "90000" ); //90 seconds

		// This is required when you want to install the application using Appium
		// caps.setCapability(MobileCapabilityType.APP, iOSApp_UiCatalog_Location);

		URL url = new URL(APPIUM_URL);

		/* This will create the new Driver session by using the above capabilities */
		AppiumDriver driver = new IOSDriver(url, caps);
		System.out.println("driver.getSessionId(): " + driver.getSessionId());

		return driver;
	}
}
