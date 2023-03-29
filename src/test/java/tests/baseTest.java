package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages1.RegisterPage.RegisterPage;
import pages1.SignInPage.SignInPage;
import pages1.SwitchToPage.SwitchToAlertPage;
import pages1.basePage;
import tests.SwitchToTest.SwitchToAlertTest;

public class baseTest {

    public SignInPage signInPage = SignInPage.getInstance();
    public RegisterPage RegisterPage = pages1.RegisterPage.RegisterPage.getInstance();
    public SwitchToAlertPage switchToAlertPage = SwitchToAlertPage.getInstance();
    public SwitchToAlertTest switchToAlertTest = SwitchToAlertTest.getInstance();


    @BeforeSuite
    public void init(){
        basePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        basePage.tearDown();
    }

}
