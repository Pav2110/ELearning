
package main_TestRunner;
import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src/test/java/features_E_learning", //for all tests which are there in feature
	    glue="mainCode_E_learning")
public class TestRunner_E_learning {

}
