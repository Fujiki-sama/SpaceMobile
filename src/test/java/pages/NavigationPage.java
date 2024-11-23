package pages;

import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage {
    private AndroidDriver<WebElement> driver;

    // Locators
    @FindBy(id = "com.google.android:id/home_tab")
    private WebElement homeTab;

    @FindBy(id = "com.google.android:id/settings_tab")
    private WebElement settingsTab;

    // Constructor
    public NavigationPage(AndroidDriver<WebElement> driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void navigateToHome() {
        homeTab.click();
    }

    public void navigateToSettings() {
        settingsTab.click();
    }
}
