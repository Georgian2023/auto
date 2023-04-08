package tests.SwitchToTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.baseTest;

import static pages1.BasePage.driver;
import static pages1.BasePage.getBaseUrl;

public class SwitchToFramesTest extends baseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToFramesTest.class);
    private String newUrl = getBaseUrl() + "Frames.html";

    @Test
    public void checkFrames() {
        driver.get(newUrl);
        String data = "Vine Primavara!";
        String data2 = "Vine Vara!";

        LOG.info("Send Key in Iframe single");
        SwitchToFramesPage.clickSingleFrame(data);

        LOG.info("Send Key in Iframe Multiple");
        SwitchToFramesPage.clickMultipleFrame(data2);

    }
}