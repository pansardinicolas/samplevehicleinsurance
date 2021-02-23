package webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Nicolas Pansardi
 */

public class PriceOptionPage {

    protected WebDriver driver;

    private final By silverBy = By.xpath("//input[@id='selectsilver']/following-sibling::span");
    private final By goldBy = By.xpath("//input[@id='selectgold']/following-sibling::span");
    private final By platinumBy = By.xpath("//input[@id='selectplatinum']/following-sibling::span");
    private final By ultimateBy = By.xpath("//input[@id='selectultimate']/following-sibling::span");
    private final By nextButtonBy = By.id("nextsendquote");

    public PriceOptionPage(WebDriver driver) {
        this.driver = driver;
    }

    public SendQuotePage enterPriceOption(){
        driver.findElement(platinumBy).click();
        driver.findElement(nextButtonBy).click();
        return new SendQuotePage(driver);
    }

}
