package otus.scopeds;


import otus.driver.WebDriverFactory;
import io.cucumber.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

@ScenarioScoped
public class GuiceScoped {


  public WebDriver driver = new WebDriverFactory().newDriver();


}
