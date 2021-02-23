package webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testObjects.Factories;

import java.time.format.DateTimeFormatter;

/**
 * @author Nicolas Pansardi
 */

public class InsurantDataPage {
    protected WebDriver driver;


    private By firstnameField = By.id("firstname");
    private By lastnameField = By.id("lastname");
    private By dateofbirthField = By.id("birthdate");
    private By gendermaleCb = By.xpath("//input[@id='gendermale']/following-sibling::span");
    private By genderfemaleCb = By.id("//input[@id='genderfemale']/following-sibling::span");
    private By streetaddressField = By.id("streetaddress");
    private By countrySelector = By.id("country");
    private By zipcodeField = By.id("zipcode");
    private By cityField = By.id("city");
    private By occupationDropdown = By.id("occupation");
    private By hobbiesSpeedingCb = By.xpath("//input[@id='speeding']/following-sibling::span");
    private By hobbiesBungeejumpingCb = By.xpath("//input[@id='bungeejumping']/following-sibling::span");
    private By hobbiesCliffdivingCb = By.xpath("//input[@id='cliffdiving']/following-sibling::span");
    private By hobbiesSkydivingCb = By.xpath("//input[@id='skydiving']/following-sibling::span");
    private By websiteField = By.id("website");
    private By fieldPicture = By.id("picture");
    private By nextButton = By.id("nextenterproductdata");

    public InsurantDataPage(WebDriver driver){
        this.driver = driver;
    }

    public ProductDataPage enterInsurantData(Factories.Insurant insurant) {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        driver.findElement(firstnameField).sendKeys(insurant.getFirstname());
        driver.findElement(lastnameField).sendKeys(insurant.getLastname());
        driver.findElement(dateofbirthField).sendKeys(insurant.getDateofbirth().format(myFormatObj));
        if(insurant.getGenderMale())
            driver.findElement(gendermaleCb).click();
        else
            driver.findElement(genderfemaleCb).click();
        driver.findElement(streetaddressField).sendKeys(insurant.getStreetaddress());
        driver.findElement(countrySelector).sendKeys(insurant.getCountry());
        driver.findElement(zipcodeField).sendKeys(insurant.getZipcode());
        driver.findElement(cityField).sendKeys(insurant.getCity());
        driver.findElement(occupationDropdown).sendKeys(insurant.getOccupation());
        if(insurant.getHobbiesSpeeding())
            driver.findElement(hobbiesSpeedingCb).click();
        if(insurant.getHobbiesBungeejumping())
            driver.findElement(hobbiesBungeejumpingCb).click();
        if(insurant.getHobbiesCliffdiving())
            driver.findElement(hobbiesCliffdivingCb).click();
        if(insurant.getHobbiesSkydiving())
            driver.findElement(hobbiesSkydivingCb).click();
        driver.findElement(websiteField).sendKeys(insurant.getWebsite());
        driver.findElement(fieldPicture).sendKeys(insurant.getPicturePath());
        driver.findElement(nextButton).click();
        return new ProductDataPage(driver);
    }
}
