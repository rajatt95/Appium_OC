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

import static _01_com.learning.utils.FrameworkConstants.Capability_AVD;
import static _01_com.learning.utils.FrameworkConstants.Capability_Android_AVD;
import static _01_com.learning.utils.FrameworkConstants.Capability_Android_Automation_Name;
import static _01_com.learning.utils.FrameworkConstants.Capability_Android_Device_Name;
import static _01_com.learning.utils.FrameworkConstants.Capability_Android_UDID;
import static _01_com.learning.utils.FrameworkConstants.Capability_iOS_AutomationName;
import static _01_com.learning.utils.FrameworkConstants.Capability_iOS_Device_Name;
import static _01_com.learning.utils.FrameworkConstants.Capability_iOS_Platform_Name;
import static _01_com.learning.utils.FrameworkConstants.Capability_iOS_UDID;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CreateBrowserSession {

	private static final String APPIUM_URL = "http://localhost:4723/wd/hub";

	public static AppiumDriver initializeDriverforAndroid() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities(); //
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, Capability_Android_Device_Name);
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, Capability_Android_Automation_Name);
		caps.setCapability(MobileCapabilityType.UDID, Capability_Android_UDID);
		caps.setCapability(Capability_AVD, Capability_Android_AVD);
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		/**
		 * MANUAL - Android: Using Compatible Chrome Driver
		 * 
		 * Here, we are commanding Appium not to use the default ChromeDriver bundled
		 * with Appium setup
		 * 
		 * Instead, use ChromeDriver which I've downloaded manually and that is present
		 * in this location
		 */
		// caps.setCapability("chromeDriverExecutable",
		// "C:/Users/rajatverma01/Downloads/chromedriver_win32/chromedriver.exe");

		/**
		 * AUTOMATIC -
		 * 
		 * Another way : Terminal/Command Prompt -> appium --allow-insecure
		 * chromedriver_autodownload
		 * 
		 * Appium will download the compatible ChromeDriver and put it under the default
		 * location of Appium
		 */

		/**
		 * AUTOMATIC -
		 * 
		 * Appium will download the compatible ChromeDriver executables
		 * 
		 * And, will download ChromeDriver in this custom path and use it for execution
		 * 
		 * This feature is called 'Automated ChromeDrivers Download Server Feature'
		 *
		 *
		 */
		// caps.setCapability("chromeDriverExecutableDir",
		// "D:/ChromeDriverDir");

		URL url = new URL(APPIUM_URL);

		/* This will create the new Driver session by using the above capabilities */
		AppiumDriver driver = new AndroidDriver(url, caps);
		System.out.println("driver.getSessionId(): " + driver.getSessionId());
		return driver;

	}

	public static AppiumDriver initializeDriverForiOS() throws MalformedURLException {

		/**
		 * Simulator:
		 * 
		 * Settings -> Developer -> UI Automation (Enable this option)
		 * 
		 * 
		 * Real Device:
		 * 
		 * Settings -> Safari -> Advanced -> Web Inspector (Enable this option)
		 */
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Capability_iOS_Platform_Name);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, Capability_iOS_Device_Name);
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, Capability_iOS_AutomationName);
		caps.setCapability(MobileCapabilityType.UDID, Capability_iOS_UDID);
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");

		// caps.setCapability("simulatorStartupTimeout", 180000);

		// Chrome -> only with Android OS
		// caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		URL url = new URL(APPIUM_URL);

		/* This will create the new Driver session by using the above capabilities */
		AppiumDriver driver = new IOSDriver(url, caps);
		System.out.println("driver.getSessionId(): " + driver.getSessionId());

		return driver;
	}

}
