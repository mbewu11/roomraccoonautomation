package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void setupBrowser()
    {
        System.setProperty("webdriver.chrome.driver","/Users/okuhlem/IdeaProjects/roomraccoonautomation/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://beta.warrenroman.com/project-rocket-raccoon/home");
    }
}
