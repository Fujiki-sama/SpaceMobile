package tests;

import org.testng.annotations.Test;
import pages.NavigationPage;
import utils.BaseTest;

public class NavigationTest extends BaseTest {

    @Test
    public void testNavigation() {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.navigateToHome();
        navigationPage.navigateToSettings();
    }
}
