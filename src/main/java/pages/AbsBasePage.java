package pages;


import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import scopeds.GuiceScoped;


public abstract class AbsBasePage {

  protected WebDriver driver;

  @Inject
  public AbsBasePage(GuiceScoped guiceScoped) {
    this.driver = guiceScoped.getDriver();
    PageFactory.initElements(driver, this);
  }

  public void open() {
    driver.manage().window().maximize();
    driver.get(System.getProperty("base.url"));
  }
}
