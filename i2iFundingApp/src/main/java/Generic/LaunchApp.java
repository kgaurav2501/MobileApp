package Generic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileCapabilityType;


public class LaunchApp {

	//public static WebDriver driver = null;
	@Test
	public void launchInvestorApp() throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		// capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		capabilities.setCapability("deviceName", "c6a262169806");
		capabilities.setCapability("platformVersion", "10");
		capabilities.setCapability("platformName", "Android");
		// capabilities.setCapability("app", app.getAbsolutePath());
//		capabilities.setCapability("appPackage", "com.i2ifunding_investorapp");
		capabilities.setCapability("appPackage", "com.i2iborrower");
		capabilities.setCapability("appActivity", "com.i2iborrower.activities.SplashActivity");
		capabilities.setCapability("noReset", "true");
		WebDriver driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		Thread.sleep(20000);
	//	System.out.println(driver.manage().window().getSize());
		
	}
}

//	public void scrollUp() {
//		System.out.println(driver.manage().window().getSize());
//		Dimension dimention = driver.manage().window().getSize();
//		int width = (int) (dimention.width / 2);
//		int hightA = (int) (dimention.height * 0.8);
//		int hightB = (int) (dimention.height * 0.2);
//		// Swipe from Bottom to Top.
////		driver.swipe(hightA, width, hightB, width, 3000);
////		Thread.sleep(2000);
//		TouchAction actions = new TouchAction(driver);
//		actions.press(hightA, width).waitAction(Duration.ofSeconds(2)).moveTo(hightB, width).release().perform();
//
//	}
//}
