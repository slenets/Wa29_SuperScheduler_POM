package configuration;

/*
{
  "platformName": "Android",
  "deviceName": "Nex",
  "platformVersion": "8.0",
  "appPackage": "com.example.svetlana.scheduler",
  "appActivity": ".presentation.splashScreen.SplashScreenActivity"
}
 */


import io.appium.java_client.*;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;

public class ConfigScheduler {
    protected AppiumDriver<MobileElement> driver;

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        capabilities.setCapability("deviceName", "Nex");
        capabilities.setCapability("appPackage", "com.example.svetlana.scheduler");
        capabilities.setCapability("appActivity", ".presentation.splashScreen.SplashScreenActivity");
        capabilities.setCapability("automationName", "Appium");

        driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

}
