package webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testObjects.Factories;

import java.time.format.DateTimeFormatter;

/**
 * @author Nicolas Pansardi
 */

public class VehicleDataPage {

    protected WebDriver driver;

    private By makeDropdownBy = By.id("make");
    private By modelDropdownBy = By.id("model");
    private By ccmBy = By.id("cylindercapacity");
    private By enginePerformanceFieldBy = By.id("engineperformance");
    private By dateofmanufactureFieldBy = By.id("dateofmanufacture");
    private By selectorNumberofseatsBy = By.id("numberofseats");
    private By rightHandDriveBy = By.xpath("//input[@id='righthanddriveyes']/following-sibling::span");
    private By leftHandDriveBy = By.xpath("//input[@id='righthanddriveno']/following-sibling::span");
    private By selectorNumberofseatsMotoBy = By.id("numberofseatsmotorcycle");
    private By selectorFuelBy = By.id("fuel");
    private By payloadFieldBy = By.id("payload");
    private By totalweightFieldBy = By.id("totalweight");
    private By listpriceFieldBy = By.id("listprice");
    private By licenseplatenumberFieldBy = By.id("licenseplatenumber");
    private By annualmileageFieldBy = By.id("annualmileage");
    private By nextButtonBy = By.id("nextenterinsurantdata");

    public VehicleDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public InsurantDataPage enterVehicleData(Factories.Vehicle vehicle) {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        driver.findElement(makeDropdownBy).sendKeys(vehicle.getMake());
        driver.findElement(modelDropdownBy).sendKeys(vehicle.getModel());
        driver.findElement(ccmBy).sendKeys(vehicle.getCcm().toString());
        driver.findElement(enginePerformanceFieldBy).sendKeys(vehicle.getEnginePerformance().toString());
        driver.findElement(dateofmanufactureFieldBy).sendKeys(vehicle.getDateofmanufacture().format(myFormatObj));
        driver.findElement(selectorNumberofseatsBy).sendKeys(vehicle.getNumberofseats().toString());
        if(vehicle.getRightHandDrive())
            driver.findElement(rightHandDriveBy).click();
        else
            driver.findElement(leftHandDriveBy).click();
        driver.findElement(selectorNumberofseatsMotoBy).sendKeys(vehicle.getNumberofseatsMoto().toString());
        driver.findElement(selectorFuelBy).sendKeys(vehicle.getFuel());
        driver.findElement(payloadFieldBy).sendKeys(vehicle.getPayload().toString());
        driver.findElement(totalweightFieldBy).sendKeys(vehicle.getTotalWeight().toString());
        driver.findElement(listpriceFieldBy).sendKeys(vehicle.getListprice().toString());
        driver.findElement(licenseplatenumberFieldBy).sendKeys(vehicle.getLicenseplatenumber());
        driver.findElement(annualmileageFieldBy).sendKeys(vehicle.getAnnualmileage().toString());
        driver.findElement(nextButtonBy).click();
        return new InsurantDataPage(driver);
    }
}
