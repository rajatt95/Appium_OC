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

public class FrameworkConstants {

	public static String APPIUM_URL = "http://localhost:4723/wd/hub";

	public static String Platform_Android = "Android";
	public static String Platform_iOS = "iOS";

	public static String Capability_AppPackage = "appPackage";
	public static String Capability_AppActivity = "appActivity";
	public static String Capability_AVD = "avd";
	public static String Capability_BundleID = "bundleId";	


	public static String Capability_Android_AVD = "Pixel_3";
	public static String Capability_Android_Device_Name = "Pixel 3";
	public static String Capability_Android_Automation_Name = "UiAutomator2";
	public static String Capability_Android_UDID = "emulator-5554";
	public static String Capability_Android_AppPackage = "io.appium.android.apis";
	public static String Capability_Android_AppActivity = "io.appium.android.apis.ApiDemos";

	
	
	public static String Capability_iOS_Platform_Name = "iOS";
	public static String Capability_iOS_Device_Name = "iPhone 13";
	public static String Capability_iOS_AutomationName = "XCUITest";
	public static String Capability_iOS_UDID = "18FB4726-3A15-498D-8F7E-84965AB706EF";	
	public static String Capability_iOS_BundleID ="com.example.apple-samplecode.UICatalog";

	
	public static String RESOURCES_PATH = System.getProperty("user.dir") + "/src/main/resources";

	public static String iOSApp_UiCatalog_Location = RESOURCES_PATH + "/UIKitCatalog-iphonesimulator.app";

}
