package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages1.SignInPage.SignInPage;
import pages1.basePage;

public class baseTest {

    public SignInPage signInPage = SignInPage.getInstance();

    @BeforeSuite
    public void init(){
        basePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        basePage.tearDown();
    }

}
