package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages1.RegisterPage.RegisterPage;
import pages1.SignInPage.SignInPage;
import pages1.basePage;

public class baseTest {

    public SignInPage signInPage = SignInPage.getInstance();
    public RegisterPage RegisterPage = pages1.RegisterPage.RegisterPage.getInstance();
    public

    @BeforeSuite
    public void init(){
        basePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        basePage.tearDown();
    }

}
