package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BaseScreen{

    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@resource-id='com.example.svetlana.scheduler:id/log_email_input']")
    MobileElement emailField;

    @FindBy(how = How.XPATH, using = "//*[@resource-id='com.example.svetlana.scheduler:id/log_password_input']")
    MobileElement passwordField;

    @FindBy(how = How.XPATH, using = "//*[@resource-id='com.example.svetlana.scheduler:id/login_btn']")
    MobileElement loginBtn;

    public String getEmailText(){
        return emailField.getText();
    }

    public String getPasswordText(){
        return passwordField.getText();
    }

    public String getLoginBtnText(){
        return loginBtn.getText();
    }



}
