package runleaftabs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions (features= "src/test/java/leaffeatures", glue="leafsteps") 
public class RunLeatabs extends AbstractTestNGCucumberTests {

}
