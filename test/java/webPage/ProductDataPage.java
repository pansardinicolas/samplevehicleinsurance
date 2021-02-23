package webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testObjects.Factories;

import java.time.format.DateTimeFormatter;

/**
 * @author Nicolas Pansardi
 */

public class ProductDataPage {

    protected WebDriver driver;

    private final By startdateFieldBy = By.id("startdate");
    private final By insurancesumDropdownBy = By.id("insurancesum");
    private final By meritratingDropdownBy = By.id("meritrating");
    private final By damageinsuranceDropdownBy = By.id("damageinsurance");
    private final By optionalEuroprotectionCbBy = By.xpath("//input[@id='EuroProtection']/following-sibling::span");
    private final By optionalLegaldefenseCbBy = By.xpath("//input[@id='LegalDefenseInsurance']/following-sibling::span");
    private final By selectorCourtesycarBy = By.id("courtesycar");
    private final By nextButton = By.id("nextselectpriceoption");

    public ProductDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public PriceOptionPage enterProductData(Factories.Product product) {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        driver.findElement(startdateFieldBy).sendKeys(product.getStartdate().format(myFormatObj));
        driver.findElement(insurancesumDropdownBy).sendKeys(product.getInsurancesum());
        driver.findElement(meritratingDropdownBy).sendKeys(product.getMeritrating());
        driver.findElement(damageinsuranceDropdownBy).sendKeys(product.getDamageinsurance());
        if(product.getOptionalEuroprotection())
            driver.findElement(optionalEuroprotectionCbBy).click();
        if(product.getOptionalLegaldefense())
            driver.findElement(optionalLegaldefenseCbBy).click();
        driver.findElement(selectorCourtesycarBy).sendKeys(product.getSelectorCourtesycar());

        driver.findElement(nextButton).click();
        return new PriceOptionPage(driver);
    }
}
