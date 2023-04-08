package tests.SwitchToTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.baseTest;

import static pages1.BasePage.driver;
import static pages1.BasePage.getBaseUrl;

public class SwitchToAlertTest extends baseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToAlertTest.class);
    private String newUrl = getBaseUrl() + "Alerts.html";

    @Test
    public void checkAlerts() {
        driver.get(newUrl);
        String data = "Vine primavara!";

        LOG.info("Trigger Alert and tap Ok button");
        switchToAlertPage.clickAlertTabWithOk();

        LOG.info("Trigger Alert and tap Cancel button");
        switchToAlertPage.clickAlertTabWithCancel();

        LOG.info("Trigger Alert and Send Data");
        switchToAlertPage.clickAlertTabWithTextBox(data);
    }
}
