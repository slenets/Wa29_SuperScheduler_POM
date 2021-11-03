package scheduler;

import configuration.ConfigScheduler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SplashScreen;

public class LaunchAppTest extends ConfigScheduler {

    @Test(priority = 1)
    public void launchTest(){
        String version = new SplashScreen(driver).getCurrentVersion();
        Assert.assertEquals(version, "0.0.3");
    }
    
}
