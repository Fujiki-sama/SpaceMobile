package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormSubmissionPage {
    private AndroidDriver<WebElement> driver;

    // Locators
    @FindBy(id = "com.google.android:id/form_field") // Replace with the actual ID
    private WebElement formField;

    @FindBy(id = "com.google.android:id/submit_button") // Replace with the actual ID
    private WebElement submitButton;

    // Constructor
    public FormSubmissionPage(AndroidDriver<WebElement> driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Combined action method: enter data and submit form
    public void submitForm(String input) {
        formField.clear();
        formField.sendKeys(input);
        submitButton.click();
    }
}
