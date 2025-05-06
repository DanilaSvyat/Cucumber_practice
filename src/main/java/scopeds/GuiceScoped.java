package scopeds;


import io.cucumber.guice.ScenarioScoped;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@ScenarioScoped
public class GuiceScoped {


  public final WebDriver driver = new ChromeDriver();


}
