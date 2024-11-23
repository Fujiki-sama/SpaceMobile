package tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.FormSubmissionPage;
import utils.BaseTest;

public class FormSubmissionTest extends BaseTest {

    @Test
    public void testFormSubmission() {
        // Initialize the page object
        FormSubmissionPage formPage = new FormSubmissionPage((AndroidDriver<WebElement>) driver);

        // Submit the form with input data
        formPage.submitForm("Sample Input");

        // Add assertions here to verify the form submission was successful
    }
}
