package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.baseTest;

import static pages1.BasePage.driver;
import static pages1.BasePage.getBaseUrl;

public class RegisterTest extends baseTest {
    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";

    @Test
    public void register() {
        driver.get(newUrl);

        String firstName = "Darius";
        String lAstName = "Fratutiu";
        String language = "Romanian";
        String adress = "Cluj, Strada Primaverii, Nt 407 J";
        String email = "Automation7@domain.com";
        String phone = "0748955748";
        String skill = "Java";
        String country = "India";
        String year = "1991";
        String month = "February";
        String day = "7";
        String pas = "parola";
        String confirmPass = "parola";

        LOG.info("Check title");
        Assert.assertTrue(| RegisterPage.isTitleDisplayed(), "Title is not displayed");

        LOG.info("Type in FullName");
        RegisterPage.typeInFirstName(firstName);
        RegisterPage.typeInLastName(lAstName);

        LOG.info("Type in Address");
        RegisterPage.typeInAdress(adress);

        LOG.info("Type Email address");
        RegisterPage.typeInEmailAddress(email);

        LOG.info("Type Phone NUmber");
        RegisterPage.typeInPhoneUmber(phone);

        LOG.info("Select Gender");
        RegisterPage.setMaleGender();
        RegisterPage.setFemaleGender();

        LOG.info("Select Hobbies");
        RegisterPage.setCricket();
        RegisterPage.seMovies();
        RegisterPage.setHockey();

        LOG.info("Select a Language");
        RegisterPage.selectLanguage(language);

        LOG.info("Select a Skill");
        RegisterPage.setSkills(skill);

        LOG.info("Select a Country");
        RegisterPage.selectCountry(country);

        LOG.info("Select Date of Birth");
        RegisterPage.setDateOfBirth(year, month, day);

        LOG.info("Set Password");
        RegisterPage.setPassword(pas, confirmPass);

        LOG.info("Choose a file");
        RegisterPage.setChooseFile();

        LOG.info("Click submit button");
        RegisterPage.clickSubmitButton();
    }
}

