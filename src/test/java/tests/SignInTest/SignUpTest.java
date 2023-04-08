package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.baseTest;

import static pages1.BasePage.driver;
import static pages1.BasePage.getBaseUrl;

public class SignUpTest extends baseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);
    private String newUrl = getBaseUrl() + "Index.html";

    @Test
    public void signUp() {
        String email = "Eail@example.com";
        String password = "12345";
        driver.get(newUrl);

        LOG.info("Verify UI elements");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");
        Assert.assertTrue(signInPage.isEmailFieldDisplayed(), "Email is not displayed");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Sign in is not displayed");
        Assert.assertTrue(signInPage.isSkipSignInButtonDisplayed(), "Skip Sign in is not displayed");

        LOG.info("Navigate to Sign Up Page");
        signInPage.clickSignInButton();

        LOG.info("Type in email and pass");
        signInPage.typeInSignInEmailField(email);
        signInPage.typeInSignInPasswordField(password);

        LOG.info("Click 'Enter' button");
        signInPage.clickEnterButton();

        LOG.info("Verifying if error message is displayed");
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error message is not displayed");

        LOG.info("Navigate back");
        signInPage.clickBack();

        LOG.info("Click Skip SingIn button");
        signInPage.clickSkipSignInButton();
    }
}
