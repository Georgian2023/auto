package pages1.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages1.basePage;


public class RegisterPage extends basePage {
    private static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private By title = By.xpath("// div[h1= 'Automation Demo Site']");
    private By formTitle = By.xpath("//div[h2='Register' ]");




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
        return.driver.findElement(title).isDisplayed();
    }

    public boolean isformTitle (){
        LOG.info("Verify if form title is displayed");
        return.driver.findElement(formTitle).isDisplayed();

}
