package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages1.SignInPage.SignInPage;
import tests.baseTest;

public class SignInTest extends baseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);

    @Test
    public void checkIfLogoIsDisplayed() {
        String email = "grupa3@automation.com";

        LOG.info("Verify if Logo is displayed");
        Assert.assertTrue(signInPage.isLogoDysplayed(), "logo is not displayed");

        LOG.info("Complete the email field");
        Assert.assertTrue(signInPage.isFieldEmailDispayed(), "Email field is not displayed");
        signInPage.typeInemailFiled(email);
        signInPage.clickNextButton();


    }

}
