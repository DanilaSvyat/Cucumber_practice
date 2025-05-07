package otus.hooks;

import com.google.inject.Inject;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import otus.scopeds.GuiceScoped;

public class Hooks {
  @Inject
  private GuiceScoped guiceScoped;

  @After
  public void close(){
    WebDriver driver = guiceScoped.driver;

    if (driver != null) {
      driver.quit();
    }
  }

}
