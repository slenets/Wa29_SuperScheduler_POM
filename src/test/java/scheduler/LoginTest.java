package scheduler;

import configuration.ConfigScheduler;
import dto.Credentials;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.xml.dom.ParentSetter;
import pages.HomeScreen;
import pages.LoginScreen;
import pages.SplashScreen;

/*
nex@gmail.com
Nex12345$
 */

public class LoginTest extends ConfigScheduler {

    @BeforeMethod
    public void preconditions(){

    }


    @Test(enabled = false)
    public void loginTest(){
        boolean isFabPresent = new SplashScreen(driver)
                .checkVersion("0.0.3")
                .fillEmail("nex@gmail.com")
                .fillPassword("Nex12345$")
                .clickLoginButton()
                .skipWizard()
                .isFabAddButtonPresent();
        Assert.assertTrue(isFabPresent);
    }

    @Test
    public void complexLogin(){
        Credentials c = Credentials.builder().email("nex@gmail.com").password("Nex12345$").build();
        boolean fab = new LoginScreen(driver).login(c).isFabAddButtonPresent();
        Assert.assertTrue(fab);
    }

    @Test
    public void logout(){
        boolean loggedOut = new HomeScreen(driver)
                .logout()
                .loginButtonPresent();
        Assert.assertTrue(loggedOut);
    }


}
