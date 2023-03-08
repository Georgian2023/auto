package pages1.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages1.basePage;

public class SignInPage extends basePage {
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

    //    homepage
    private final By logo = By.id("logo");
    private final By SignInButton = By.id("btn1");
    private final By skipSignInButton = By.id("btn2");
    private final By emailField = By.id("email");
    private final By nextButton = By.id("enterimg");

    //    sign in
    private By signInEmailField = By.xpath("// input[@type = 'text'");
    private By signInPasswordField = By.xpath("// input[@type = 'password'");
    private By enterButton = By.id("enterbtn");
    private By errorMsg = By.id("errorMsg");



    public boolean isLogoDysplayed() {
        LOG.info("Verify if Logo is Displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if Sign in Button is Displayed");
        return driver.findElement(SignInButton).isDisplayed();
    }

    public boolean isskipSignInButtonDisplayed() {
        LOG.info("Verify if if skip Sign in Button is Displayed");
        return driver.findElement(skipSignInButton).isDisplayed();
    }

    public boolean isFieldEmailDispayed() {
        LOG.info("Type in email Field");
        return driver.findElement(emailField).isDisplayed();
    }

    public void clickSignInButton() {
        LOG.info("Click sign in button");
        driver.findElement(SignInButton).click();

    }

    public void clickSkipSignInButton() {
        LOG.info("Click Skip sign in button");
        driver.findElement(skipSignInButton).click();
    }

    public void typeInemailFiled(String email) {
        LOG.info("Type in email Field");
        driver.findElement(emailField).sendKeys();
    }

    public void clickNextButton() {
        LOG.info("Click Next Button");
        driver.findElement(nextButton).click();

    }

    public void typeInSihnEmailField(String email) {
        LOG.info("Typing email adress in 'email' field");
        driver.findElement(signInEmailField).sendKeys(email);
    }

    public void typeInSigninPasswordField(String password) {
        LOG.info("Typing email adress in 'password' field");
        driver.findElement(signInPasswordField).sendKeys(password);
    }
    public void clickEnterButton() {
        LOG.info(" Click the 'Enter' button");
        driver.findElement(enterButton).click();
    }

    public boolean isErrorMessageDisplayed(){
        LOG.info("Verify if error message is displayed");
        return driver.findElement(errorMsg).isDisplayed();
    }
    public void clickBack(){
        LOG.info("Clicking back the browser");
        driver.navigate().back();
    }


}




