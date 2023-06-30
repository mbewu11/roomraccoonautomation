package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    static WebDriver driver;

    public static WebDriver setupBrowser()
    {
        System.setProperty("webdriver.chrome.driver","/Users/okuhlem/IdeaProjects/roomraccoonautomation/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://beta.warrenroman.com/project-rocket-raccoon/home");
        return driver;
    }
}
