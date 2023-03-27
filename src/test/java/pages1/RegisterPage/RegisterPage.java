package pages1.RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages1.basePage;


public class RegisterPage extends basePage {
    private static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private By title = By.xpath("// div[h1='Automation Demo Site ']");
    private By formTitle = By.xpath("//div[h2='Register' ]");
    private By selectYear = By.id("yearbox");
    private By selectMonth = By.xpath("//select[@placeholder='Month' ]");
    private By selectDay = By.id("daybox");
    private By firstPassword = By.id("firstpassword");
    private By secondPassword = By.id("secondpassword");
    private By file = By.id("imagesrc");
    private By submitButton = By.id("submitbtn");
    private By refreshButton = By.id("Button1");








    private RegisterPage(){

}
    public static RegisterPage getInstance(){
        if (instance== null){
            instance = new RegisterPage();
        }
        return instance;
    }
    public boolean isTitleDisplayed (){
        LOG.info("Verify if title is displayed");
        driver.findElement(title).isDisplayed();
    }

    public boolean isformTitle (){
        LOG.info("Verify if form title is displayed");
        driver.findElement(formTitle).isDisplayed();

}
    public void setDateOfBitrh(String year,String Month, String Day){
        LOG.info("Select the date of birth");
        Select newYear = new Select(driver.findElement(selectYear));
        newYear.selectByValue(year);
        Select newMonth = new Select(driver.findElement(selectMonth));
        newMonth.selectByValue(Month);
        Select newDay = new Select(driver.findElement(selectDay));
        newDay.selectByValue(Day);

    }

    public void setPassword (String password, String confirmPassword){
        LOG.info("Set password");
        driver.findElement(firstPassword).sendKeys(password);
        driver.findElement(secondPassword).sendKeys(confirmPassword);

    }
    public void selectImage (){
        LOG.info("Choose image to upload");
        WebElement filechoose = driver.findElement(file);
        filechoose.sendKeys("C:\\Users\\40727\\Desktop\\poze de trimis pe tel");

    }
     public void clickSubmitButton (){
        LOG.info("Click the submit button");
        driver.findElement(submitButton).click();
     }
     public void clickRefreshButton (){
        LOG.info("Click the refresh button");
        driver.findElement(refreshButton).click();
     }





}
