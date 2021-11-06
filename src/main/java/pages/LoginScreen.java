package pages;

import dto.Credentials;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
nex@gmail.com
Nex12345$
 */

public class LoginScreen extends BaseScreen {

    public LoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    //@FindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/log_email_input']")

    @FindBy(how = How.XPATH, using = "//*[@resource-id='com.example.svetlana.scheduler:id/log_email_input']")
    MobileElement emailEditText;

    @FindBy(how = How.XPATH, using = "//*[@resource-id='com.example.svetlana.scheduler:id/log_password_input']")
    MobileElement passwordPasswordEditText;

    @FindBy(how = How.XPATH, using = "//*[@resource-id='com.example.svetlana.scheduler:id/login_btn']")
    MobileElement loginBtn;


    public LoginScreen fillEmail(String email){
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(emailEditText));
        type(emailEditText, email);
        return this;
    }

    public LoginScreen fillPassword(String password){
        type(passwordPasswordEditText, password);
        return this;
    }

    public WizardScreen clickLoginButton(){
        hideKeyboard();
        loginBtn.click();
        return new WizardScreen(driver);
    }

    public HomeScreen login(Credentials credentials){
        shouldHave(emailEditText, "EMAIL", 20);
        type(emailEditText, credentials.getEmail());
        type(passwordPasswordEditText, credentials.getPassword());
        hideKeyboard();
        loginBtn.click();
        return new HomeScreen(driver);
    }

    public boolean loginButtonPresent(){
        return loginBtn.isDisplayed();
    }

}



























