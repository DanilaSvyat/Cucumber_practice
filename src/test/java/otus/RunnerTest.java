package otus;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.ConfigurationParameter;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;


@Suite
@IncludeEngines("cucumber")
@SelectPackages("otus")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "otus")
public class RunnerTest {


}


