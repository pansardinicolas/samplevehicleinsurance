import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import webPage.InsurantDataPage;
import webPage.ProductDataPage;
import webPage.SendQuotePage;
import webPage.VehicleDataPage;

/**
 * Tests Vehicle insurance feature
 *
 * @author Nicolas Pansardi
 */

public class VehicleInsuranceTest {

    static WebDriver driver = new FirefoxDriver();

    public static void main(String[] args) {
        driver.get("http://sampleapp.tricentis.com/101/app.php");
    }
}
