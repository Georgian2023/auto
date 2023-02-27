package tests;

import jdk.internal.org.jline.utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages1.basePage;

public class baseTest {
    @BeforeSuite
    public void init() {
        basePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        basePage.tearDown();
    }

}
