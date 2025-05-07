package otus.pages;


import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import otus.scopeds.GuiceScoped;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public abstract class AbsBasePage {

  protected WebDriver driver;

  @Inject
  public AbsBasePage(GuiceScoped guiceScoped) {
    this.driver = guiceScoped.driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(tagName = "h1")
  private WebElement header;

  public void open() {
    driver.manage().window().maximize();
    driver.get(System.getProperty("base.url"));
  }

  public void pageHeaderShouldBeSameAs(String expectedHeader) {
    assertThat(header.getText())
        .as("Header of page should be {}", expectedHeader)
        .isEqualTo(expectedHeader);
  }

  protected WebElement $(By locator) {
    return driver.findElement(locator);
  }

}
