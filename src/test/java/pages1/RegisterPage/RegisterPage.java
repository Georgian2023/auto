package pages1.RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages1.BasePage;


public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private By title = By.xpath("//div[h1='Automation Demo Site ']");
    private By inputFirstName = By.xpath("//input[@ng-model='FirstName']");
    private By inputLastName = By.xpath("//input[@ng-model='LastName']");
    private By inputAddress = By.xpath("//textarea[@ng-model='Adress']");
    private By inputEmailAddress = By.xpath("//input[@type = 'email']");
    private By inputPhoneNumber = By.xpath("//input[@type = 'tel']");
    private By maleGender = By.xpath("//input[@value='Male']");
    private By femaleGender = By.xpath("//input[@value='FeMale']");
    private By cricketCheckmark = By.id("checkbox1");
    private By moviesCheckmark = By.id("checkbox2");
    private By hockeyCheckmark = By.id("checkbox3");
    private By languageFiled = By.id("msdd");
    String selectLanguage = "//a[contains(text(), '%s')]";
    String selectSkills = "Skills";
    private By selectCountry = By.xpath("//span[@role='combobox']");
    private By enterCountry = By.xpath("//input[@role='textbox']");
    private By selectYear = By.id("yearbox");
    private By selectMonth = By.xpath("//select[@placeholder='Month']");
    private By selectDay = By.id("daybox");
    private By password = By.id("firstpassword");
    private By confirmPassword = By.id("secondpassword");
    private By chooseFileBtn = By.id("imagesrc");
    private By submitButton = By.id("submitbtn");

    private RegisterPage() {
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    public boolean isTitleDisplayed() {
        LOG.info("Verify if title is displayed");
        return driver.findElement(title).isDisplayed();
    }

    public void typeInFirstName(String fName) {
        LOG.info("Type in FirstName");
        driver.findElement(inputFirstName).sendKeys(fName);
    }

    public void typeInLastName(String lName) {
        LOG.info("Type in LastName");
        driver.findElement(inputLastName).sendKeys(lName);
    }

    public void typeInAdress(String address) {
        LOG.info("Type in Address");
        driver.findElement(inputAddress).sendKeys(address);
    }

    public void selectLanguage(String language) {
        LOG.info("Select language");
        driver.findElement(languageFiled).click();
        driver.findElement(By.xpath(String.format(selectLanguage, language))).click();
    }

    public void typeInEmailAddress(String emailAddress) {
        LOG.info("Type in Email Address");
        driver.findElement(inputEmailAddress).sendKeys(emailAddress);
    }

    public void typeInPhoneUmber(String phoneNumber) {
        LOG.info("Type in Phone NUmber");
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
    }

    public void setMaleGender() {
        LOG.info("Click the Male radio button");
        driver.findElement(maleGender).click();
    }

    public void setFemaleGender() {
        LOG.info("Click the Female  radio button");
        driver.findElement(femaleGender).click();
    }

    public void setCricket() {
        LOG.info("Set Cricket");
        driver.findElement(cricketCheckmark).click();
    }

    public void seMovies() {
        LOG.info("Set Movies");
        driver.findElement(moviesCheckmark).click();
    }

    public void setHockey() {
        LOG.info("Set Hockey");
        driver.findElement(hockeyCheckmark).click();
    }

    public void setSkills(String skill) {
        LOG.info("Select a Skill");
        Select newSkill = new Select(driver.findElement(By.id(selectSkills)));
        newSkill.selectByValue(skill);
    }

    public void selectCountry(String country) {
        LOG.info("Set Country");
        driver.findElement(selectCountry).click();
        driver.findElement(enterCountry).sendKeys(country);
        driver.findElement(selectCountry).sendKeys(Keys.ENTER);
    }

    public void setDateOfBirth(String year, String month, String day) {
        LOG.info("Select Date Of Birth");
        Select newYear = new Select(driver.findElement(selectYear));
        newYear.selectByValue(year);
        Select newMonth = new Select(driver.findElement(selectMonth));
        newMonth.selectByValue(month);
        Select newDay = new Select(driver.findElement(selectDay));
        newDay.selectByValue(day);
    }

    public void setPassword(String pass, String confirmPass) {
        LOG.info("Set Password");
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirmPassword).sendKeys(confirmPass);
    }

    public void setChooseFile() {
        LOG.info("Upload a File");
        WebElement fileChoose = driver.findElement(chooseFileBtn);
        fileChoose.sendKeys("C://Img//download.png");
    }

    public void clickSubmitButton() {
        LOG.info("CLick the Submit button");
        driver.findElement(submitButton).click();
    }


}
