package otus.hooks;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import scopeds.GuiceScoped;

public class Hooks {
  @Inject
  private GuiceScoped guiceScoped;

  @After
  public void close(){
    WebDriver driver = guiceScoped.getDriver();

    if (driver != null) {
      driver.quit();
    }
  }

}
