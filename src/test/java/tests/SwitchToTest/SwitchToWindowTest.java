package tests.SwitchToTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages1.SwitchToPage.SwitchToWindowPage;
import tests.baseTest;

import static pages1.BasePage.driver;
import static pages1.BasePage.getBaseUrl;

public class SwitchToWindowTest extends baseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToWindowTest.class);
    private String newUrl = getBaseUrl() + "Windows.html";

    @Test
    public void checkWindows() {
        driver.get(newUrl);

        LOG.info("Trigger Tabbed window");
        SwitchToWindowPage.clickWindowTabbed();
        SwitchToWindowPage.switchToNewTabWindow();

        LOG.info("Trigger Seperate window");
        SwitchToWindowPage.clickWindowSeperate();
        SwitchToWindowPage.switchToNewTabWindow();

        LOG.info("Trigger Tabbed window");
        SwitchToWindowPage.clickWindowMultiple();
        SwitchToWindowPage.switchToNewTabWindow();
    }
}
