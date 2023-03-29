package pages1.SwitchToPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages1.basePage;


public class SwitchToAlertPage extends basePage {
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToAlertPage.class);
    public static SwitchToAlertPage instance;
    private By alertTabWithOk = By.xpath("//a[@href ='#OKTab']");
    private By triggerOkAlert = By.xpath("//button[@class ='btn btn-danger']");
    private By alertTabWithCancel = By.xpath("//a[@href ='CancelTab']");
    private By triggerCancelAlert = By.xpath("//button[@class ='btn btn-primary']");
    private By alerTabWithTextBox = By.xpath("//a[@href ='Textbox']");
    private By triggerTextBoxAlert = By.xpath ("//button[@class ='btn btn-info']");




    private SwitchToAlertPage(){

    }

    public static SwitchToAlertPage getInstance() {
        if (instance == null){
            instance = new SwitchToAlertPage();

        }
        return instance;
    }
    public void clickAlertTabWithOk(){
        LOG.info("Click alert with ok");
        driver.findElement(alertTabWithOk).click();
        driver.findElement(triggerOkAlert).click();
        driver.switchTo().alert().accept();
    }
    public void clickAlertWithCancel(){
        LOG.info("Click alert with cancel");
        driver.findElement(alertTabWithCancel).click();
        driver.findElement(triggerCancelAlert).click();
        driver.switchTo().alert().dismiss();

    }

    public void clickAlertTabWithTextBox(String data){
        LOG.info("Click alert tab with text box");
        driver.findElement(alerTabWithTextBox);
        driver.findElement(triggerTextBoxAlert);
        driver.switchTo().alert().sendKeys(data);
        driver.switchTo().alert().accept();

    }

    public void

}
