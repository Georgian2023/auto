package pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class basePage {
    private static final Logger LOG = LoggerFactory.getLogger(basePage.class);
    public static WebDriver driver ;
    public static void setUp(){
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver","C://webdrivers/chromedriver111.exe");
        driver = new ChromeDriver();
        String url = "https://demo.automationtesting.in/Index.html";
        driver.get(url);

        LOG.info("Open browser maximaze");
        driver.manage().window().maximize();

    }
    public static void tearDown(){
        LOG.info("Close the browser");
        driver.quit();
    }

    public static String returnBaseUrl(){
        return "https://demo.automationtesting.in/Index.html";
    }

    public static String getBaseUrl (){
        String baseUrl = returnBaseUrl();
        if (baseUrl != null){
            return baseUrl.replace("Index.html", "");

    }
        return baseUrl;

}
}