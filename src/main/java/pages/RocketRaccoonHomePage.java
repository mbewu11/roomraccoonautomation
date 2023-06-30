package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RocketRaccoonHomePage extends BaseSeleniumPage{
    @FindBy(xpath = "//a[@class='ajaxModalLauncher btn btn-primary' and @data-modal-url='add']" )
    public WebElement addButton;
    @FindBy(css = "[name$='name']")
    public WebElement addTitle;
    @FindBy(css = "#myModal > div > div > div.modal-body > form > div:nth-child(2) > div > textarea")
    public WebElement addDescription;
    @FindBy(css = "#myModal > div > div > div.modal-body > form > div.row.py-3 > div > div > div:nth-child(1) > input")
    public WebElement submitButton;
    @FindBy(xpath = "//div[contains(@class, 'col-12 col-md-4') and contains(text(), 'Book Room')]")
    public WebElement titleText;

    @FindBy(xpath = "//button[contains(@class, 'close btn') and @data-bs-dismiss='modal' and @aria-hidden='true']")
    public WebElement close;
    public RocketRaccoonHomePage (WebDriver driver) {
        super(driver);
    }

    public void viewButtons (){
        // Locate all view buttons
        List<WebElement> viewButtons = driver.findElements(By.xpath("//a[@class='ajaxModalLauncher btn btn-primary btn-block' and @data-modal-url='view?id=189']"));

        // Click on the last view button
        WebElement lastViewButton = viewButtons.get(viewButtons.size() - 1);
        lastViewButton.click();
    }
}
