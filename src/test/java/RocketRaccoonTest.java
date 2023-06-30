import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BaseTest;
import pages.RocketRaccoonHomePage;

public class RocketRaccoonTest{
   @Test
   public void RocketRaccoonTest () {
      SoftAssert softAssert = new SoftAssert();
      WebDriver driver = BaseTest.setupBrowser();
      RocketRaccoonHomePage page = new RocketRaccoonHomePage(driver);
      // Click add button on the page
      page.addButton.click();
      // Wait until add Title field is visible
      page.waitUntilVisible(page.addTitle);
      // Fill in Details
      page.addTitle.sendKeys("Book Room");
      page.addDescription.sendKeys("1 bedroom or 2 Bedroom");
      // Submit
      page.submitButton.click();
      page.viewButtons();
      softAssert.assertEquals(page.titleText.getText(), "· Book Room");

      // Wait until add Title field is visible
      page.waitUntilVisible(page.close);
      page.close.click();
      page.close.click();
      softAssert.assertAll();
   }
}
