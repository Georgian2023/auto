package pages1.SwitchToPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages1.BasePage;

public class SwitchToFramesPage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToFramesPage.class);
    public static SwitchToFramesPage instance;

    private By singleFrameButton = By.xpath("//a[@href='#Single']");
    private By multipleFrameButton = By.xpath("//a[@href='#Multiple']");

    private By singleFrame = By.id("singleframe");
    private By multipleFrame = By.xpath("//div[@id='Multiple']/iframe");
    private By inputText = By.xpath("//input[@type='text']");


    private SwitchToFramesPage() {
    }

    public static SwitchToFramesPage getInstance() {
        if (instance == null) {
            instance = new SwitchToFramesPage();
        }
        return instance;
    }

    public void clickSingleFrame(String data) {
        driver.findElement(singleFrameButton).click();
        WebElement iframe = driver.findElement(singleFrame);
        driver.switchTo().frame(iframe);
        driver.findElement(inputText).sendKeys(data);
        sleep(5000);
        driver.switchTo().defaultContent();
    }

    public void clickMultipleFrame(String data) {
        driver.findElement(multipleFrameButton).click();
        WebElement iframe = driver.findElement(multipleFrame);
        driver.switchTo().frame(iframe);
        driver.switchTo().frame(0);
        driver.findElement(inputText).sendKeys(data);
        sleep(5000);
        driver.switchTo().defaultContent();
    }
}