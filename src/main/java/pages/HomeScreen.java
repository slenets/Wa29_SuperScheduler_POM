package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.functions.ExpectedCondition;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeScreen extends BaseScreen{

    public HomeScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/fab_main']")
    MobileElement fabAdd;

    @FindBy(xpath = "//*[@content-desc='Open']")
    MobileElement burgerMenu;

    @FindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/nav_fr_logout']")
    MobileElement logoutBtn;

    public boolean isFabAddButtonPresent(){
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(fabAdd));
        return fabAdd.isDisplayed();
    }

    public LoginScreen logout(){
        burgerMenu.click();
        logoutBtn.click();
        return new LoginScreen(driver);
    }
}
