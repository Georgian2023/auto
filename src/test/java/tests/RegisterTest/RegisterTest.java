package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.baseTest;

import static pages1.basePage.driver;
import static pages1.basePage.getBaseUrl;


    public class RegisterPage extends baseTest {
        private String newUrl = getBaseUrl() + "Register.html";
        private final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);

        @Test
        public void register(Object day){
            driver.get(newUrl);
            String year = "1991";
            String month ="May";
            String Day = "01";
            String password = "1234";
            String secondpassword = "1234";

            LOG.info("Check title");
            Assert.assertTrue(RegisterPage.isTitleDisplayed(),"Title is not displayed");

            LOG.info("Check form title");
            Assert.assertTrue(RegisterPage.isformTitle(),"Form title is not displayed");

            LOG.info("Select date of birth");
            RegisterPage.setDateOfBitrh(year,month,Day);

            LOG.info("First paswword");
            RegisterPage.setPassword(password,secondpassword);

            LOG.info("Choose a picture");
            RegisterPage.selectImage();

            LOG.info("Click the submit button");
            RegisterPage.clickSubmitButton();

            LOG.info("Click the refresh button");
            RegisterPage.clickRefreshButton();





        }
    }
