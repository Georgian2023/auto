package tests.SwitchToTest;

import org.testng.annotations.Test;
import pages1.SwitchToPage.SwitchToAlertPage;
import tests.baseTest;



public class SwitchToAlertTest extends baseTest {
private String newUrl = getBaseUrl()+ "Alerts.html";
@Test
    public void checkAlerts(){
    driver.get(newUrl);
    String data = "mesaj";

    LOG.info("Trigger alert and tape ok button");
    switchToAlertPage.clickAlertTabWithOk();

    LOG.info("Trigger alert and tape cancel button");
    switchToAlertPage.clickAlertWithCancel();

    LOG.info("Trigger alert and send data");
    switchToAlertPage.clickAlertTabWithTextBox(data);


    }


}
