package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.baseTest;

import static pages1.basePage.driver;
import static pages1.basePage.getBaseUrl;




public class SignUpTest extends baseTest{
    private static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);
    private String newUrl = getBaseUrl()+ "Index.html";


    @Test
    public void signUp() {
        String email = "Eail@example.com";
        String password = "12345";

        LOG.info("Verify UI element");
        LOG.info("Navigate to sign up page");
        driver.get(newUrl);
        Assert.assertTrue(signInPage.isLogoDysplayed(),  "logo is not displayed");
        Assert.assertTrue(signInPage.isFieldEmailDispayed(),  "Email is not displayed");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Sign in is not displayed");
        Assert.assertTrue(signInPage.isskipSignInButtonDisplayed(), "Skip button is not displayed");
        signInPage.clickSkipSignInButton();

        LOG.info("Type an email and pass");
        signInPage.typeInemailFiled(email);
        signInPage.typeInSigninPasswordField(password);

        LOG.info("Click 'Enter' button");
        signInPage.clickNextButton();

        LOG.info("Verifyng if error message is dysplayed");
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error message is not displayed");

        LOG.info("Navigate back");
        signInPage.clickBack();

        LOG.info("Skip sign in button");
        signInPage.clickSkipSignInButton();







    }
}
