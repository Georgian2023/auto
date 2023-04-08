package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages1.BasePage;
import pages1.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    //Homepage
    private By logo = By.id("logo");
    private By signInButton = By.id("btn1");
    private By skipSignInButton = By.id("btn2");
    private By emailField = By.id("email");
    private By nextButton = By.id("enterimg");

    //SignIn
    private By signInEmailField = By.xpath("//input[@type='text']");
    private By signInPasswordField = By.xpath("//input[@type='password']");
    private By enterButton = By.id("enterbtn");
    private By errorMsg = By.id("errormsg");

    public boolean isLogoDisplayed() {
        LOG.info("Verify if Logo is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if 'Sign in' is displayed");
        return driver.findElement(signInButton).isDisplayed();
    }

    public void clickSignInButton() {
        LOG.info("Click 'Sign in' button");
        driver.findElement(signInButton).click();
    }

    public boolean isSkipSignInButtonDisplayed() {
        LOG.info("Verify if 'Skip Sign in' is displayed");
        return driver.findElement(skipSignInButton).isDisplayed();
    }

    public void clickSkipSignInButton() {
        LOG.info("Click 'Sign in' button");
        driver.findElement(skipSignInButton).click();
    }

    public boolean isEmailFieldDisplayed() {
        LOG.info("Verify if Email field is displayed");
        return driver.findElement(emailField).isDisplayed();
    }

    public void typeInEmailField(String email) {
        LOG.info("Check email field");
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickNextButton() {
        LOG.info("Click Next button");
        driver.findElement(nextButton).click();
    }

    public void typeInSignInEmailField(String email) {
        LOG.info("Typing email address in 'Email' field");
        driver.findElement(signInEmailField).sendKeys(email);
    }

    public void typeInSignInPasswordField(String password) {
        LOG.info("Typing email address in 'Email' field");
        driver.findElement(signInPasswordField).sendKeys(password);
    }

    public void clickEnterButton() {
        LOG.info("Click the 'Enter' button");
        driver.findElement(enterButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        LOG.info("Verifying if error message is displayed");
        return driver.findElement(errorMsg).isDisplayed();
    }

    public void clickBack(){
        LOG.info("Clicking back in browser");
        driver.navigate().back();
    }
}
