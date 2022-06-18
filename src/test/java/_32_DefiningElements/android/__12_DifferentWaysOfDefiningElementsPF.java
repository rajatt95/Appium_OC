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

package _32_DefiningElements.android;

import org.openqa.selenium.support.PageFactory;

import _01_com.learning.utils.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class __12_DifferentWaysOfDefiningElementsPF {

	@AndroidFindBy(xpath = "//*[@text=\"Accessibility\"]")
	@iOSXCUITFindBy(accessibility = "Accessibility")
	private static MobileElement myElement;

	public __12_DifferentWaysOfDefiningElementsPF(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static void main(String[] args) throws Exception {
		AppiumDriver driver = CreateDriverSession.initializeDriverForAndroid();
		__12_DifferentWaysOfDefiningElementsPF obj = new __12_DifferentWaysOfDefiningElementsPF(driver);
		System.out.println(myElement.getText());

	}
} 

// MobileElement, WebElement, By, MobileBy, @FindBy, @AndroidFindBy, @iOSXCUITFindBy
