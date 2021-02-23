package webPage;

import org.openqa.selenium.*;
import testObjects.Factories;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Nicolas Pansardi
 */

public class SendQuotePage {

    protected WebDriver driver;

    private final By emailBy = By.id("email");
    private final By phoneBy = By.id("phone");
    private final By usernameBy = By.id("username");
    private final By passwordBy = By.id("password");
    private final By confirmPasswordBy = By.id("confirmpassword");
    private final By commentBy = By.id("Comments");
    private final By sendButtonBy = By.id("sendemail");

    //dialog
    private final By loadingBy = By.id("LoadingPDF");
    private final By dialogTextBy = By.className("confirm");

    public SendQuotePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterQuoteData(Factories.QuoteDestine quoteDestine){
        driver.findElement(emailBy).sendKeys(quoteDestine.getEmail());
        driver.findElement(phoneBy).sendKeys(quoteDestine.getPhone());
        driver.findElement(usernameBy).sendKeys(quoteDestine.getUsername());
        driver.findElement(passwordBy).sendKeys(quoteDestine.getPassword());
        driver.findElement(confirmPasswordBy).sendKeys(quoteDestine.getPassword());
        driver.findElement(commentBy).sendKeys(quoteDestine.getComments());
        driver.findElement(sendButtonBy).click();
    }

    public String getDialogTextBy() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("LoadingPDF"))));
        WebElement element = driver.findElement(dialogTextBy);

        return element.getText();
    }
}
