package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.baseTest;
import static pages1.basePage.driver;
import static pages1.basePage.getBaseUrl;



public class RegisterTest extends baseTest {

    public class RegisterPage extends baseTest {
        private String newUrl = getBaseUrl() + "Register.html";
        private final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);

        @Test
        public void register (){

            driver.get(newUrl);
            LOG.info("Check title");
            Assert.assertTrue(RegisterPage.isTitleDisplayed() "Title is not displayed");

            LOG.info("Check form title");
            Assert.assertTrue(RegisterPage.isformTitle()"Form title is not displayed");
        }
}
