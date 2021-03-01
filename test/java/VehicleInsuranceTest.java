import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Nicolas Pansardi
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources"
)
public class VehicleInsuranceTest {
}
