import helper.WebPagesHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import testObjects.Factories;
import webPage.*;

/**
 * @author Nicolas Pansardi
 */

public class MyStepdefs {

    WebDriver driver;
    InsurantDataPage insurantDataPage;
    ProductDataPage productDataPage;
    PriceOptionPage priceOptionPage;
    SendQuotePage sendQuotePage;
    String expectedSuccessText = "Sending e-mail success!";

    @Given("Open the Firefox and launch the application")
    public void openTheFirefoxAndLaunchTheApplication() {
        System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\bin\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://sampleapp.tricentis.com/101/app.php");
    }

    @When("I fill out Vehicle Insurance")
    public void iFillOutVehicleInsurance() {

        Factories.Vehicle vehicle = new Factories.Vehicle();

        VehicleDataPage vehicleDataPage = new VehicleDataPage(driver);
        insurantDataPage = vehicleDataPage.enterVehicleData(vehicle);
    }

    @And("I fill out Insurant")
    public void iFillOutInsurant() {
        Factories.Insurant insurant = new Factories.Insurant();
        productDataPage = insurantDataPage.enterInsurantData(insurant);

    }

    @And("I fill out Product")
    public void iFillOutProduct() {
        Factories.Product product = new Factories.Product();
        priceOptionPage = productDataPage.enterProductData(product);
    }

    @And("I choose platinum")
    public void iChoosePlatinum() {
        sendQuotePage = priceOptionPage.enterPriceOption();
    }

    @And("I send quote")
    public void iSendQuote() {
        Factories.QuoteDestine quoteDestine = new Factories.QuoteDestine();
        sendQuotePage.enterQuoteData(quoteDestine);
    }

    @Then("Email sent successfully")
    public void emailSentSuccessfully() {
        WebPagesHelper helper = new WebPagesHelper();
        sendQuotePage.waitLoading();
        sendQuotePage.waitWindowLoad();
        helper.switchToWindow(driver, this.expectedSuccessText);
        Assert.assertEquals(expectedSuccessText, sendQuotePage.getDialogTextBy());
    }
}
