package pages1.SwitchToPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages1.BasePage;

public class SwitchToAlertPage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToAlertPage.class);
    public static SwitchToAlertPage instance;

    private By alertTabWithOk = By.xpath("//a[@href='#OKTab']");
    private By alertTabWithCancel = By.xpath("//a[@href='#CancelTab']");
    private By alertTabWithTextBox = By.xpath("//a[@href='#Textbox']");

    private By triggerOkAlert = By.xpath("//button[@onclick='alertbox()']");
    private By triggerCancelAlert = By.xpath("//button[@onclick='confirmbox()']");
    private By triggerTextBoxAlert = By.xpath("//button[@onclick='promptbox()']");

    private SwitchToAlertPage() {
    }

    public static SwitchToAlertPage getInstance() {
        if (instance == null) {
            instance = new SwitchToAlertPage();
        }
        return instance;
    }

    public void clickAlertTabWithOk() {
        driver.findElement(alertTabWithOk).click();
        driver.findElement(triggerOkAlert).click();
        driver.switchTo().alert().accept();
    }

    public void clickAlertTabWithCancel() {
        driver.findElement(alertTabWithCancel).click();
        driver.findElement(triggerCancelAlert).click();
        driver.switchTo().alert().dismiss();
    }

    public void clickAlertTabWithTextBox(String data) {
        driver.findElement(alertTabWithTextBox).click();
        driver.findElement(triggerTextBoxAlert).click();
        driver.switchTo().alert().sendKeys(data);
        driver.switchTo().alert().accept();
    }

}