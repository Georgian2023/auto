package pages1.SwitchToPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages1.BasePage;

public class SwitchToWindowPage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToWindowPage.class);
    public static SwitchToWindowPage instance;

    private By windowTabbed = By.xpath("//a[@href='#Tabbed']");
    private By windowSeperate = By.xpath("//a[@href='#Seperate']");
    private By windowMultiple = By.xpath("//a[@href='#Multiple']");

    private By triggerTabbedWindow = By.xpath("//div[@id='Tabbed']/a/button");
    private By triggerSeperateWindow = By.xpath("//button[@onclick='newwindow()']");
    private By triggerMultiWindow = By.xpath("//button[@onclick='multiwindow()']");

    private SwitchToWindowPage() {
    }

    public static SwitchToWindowPage getInstance() {
        if (instance == null) {
            instance = new SwitchToWindowPage();
        }
        return instance;
    }

    public void clickWindowTabbed() {
        LOG.info("Trigger Tabbed Window and tap Click Button");
        driver.findElement(windowTabbed).click();
        driver.findElement(triggerTabbedWindow).click();
    }

    public void clickWindowSeperate() {
        LOG.info("Trigger Seperate Window and tap Click Button");
        driver.findElement(windowSeperate).click();
        driver.findElement(triggerSeperateWindow).click();
    }

    public void clickWindowMultiple() {
        LOG.info("Trigger Multiple Window and tap Click Button");
        driver.findElement(windowMultiple).click();
        driver.findElement(triggerMultiWindow).click();
    }

    public void switchToNewTabWindow() {
        LOG.info("Switch to new tab window");
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.switchTo().window(originalWindow);
    }
}
