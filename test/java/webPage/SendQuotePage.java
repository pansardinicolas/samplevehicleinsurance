package webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testObjects.Factories;

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
    private final By dialogTextBy = By.xpath("//div[@class='sweet-alert showSweetAlert']/h2");

    public SendQuotePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterQuoteData(Factories.QuoteDestine quoteDestine) {
        driver.findElement(emailBy).sendKeys(quoteDestine.getEmail());
        driver.findElement(phoneBy).sendKeys(quoteDestine.getPhone());
        driver.findElement(usernameBy).sendKeys(quoteDestine.getUsername());
        driver.findElement(passwordBy).sendKeys(quoteDestine.getPassword());
        driver.findElement(confirmPasswordBy).sendKeys(quoteDestine.getPassword());
        driver.findElement(commentBy).sendKeys(quoteDestine.getComments());
        driver.findElement(sendButtonBy).click();
    }

    public void waitLoading() {
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("LoadingPDF"))));
    }

    public void waitWindowLoad() {
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, 'sweet-alert showSweetAlert')]")));
    }

    public String getDialogTextBy() {
        WebElement element = driver.findElement(dialogTextBy);

        return element.getText();
    }
}
