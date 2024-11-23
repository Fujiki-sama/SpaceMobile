package pages;

import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private AndroidDriver<WebElement> driver;

    // Locators
    @FindBy(id = "com.google.android:id/email_field") // Replace with actual email field ID
    private WebElement emailField;

    @FindBy(id = "com.google.android:id/password_field") // Replace with actual password field ID
    private WebElement passwordField;

    @FindBy(id = "com.google.android:id/login_button") // Replace with actual login button ID
    private WebElement loginButton;

    @FindBy(id = "com.google.android:id/logout_button") // Replace with actual logout button ID
    private WebElement logoutButton;

    // Constructor
    public LoginPage(AndroidDriver<WebElement> driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void enterEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public boolean isLogoutButtonDisplayed() {
        return logoutButton.isDisplayed();
    }
}
