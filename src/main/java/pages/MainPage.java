package pages;


import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import scopeds.GuiceScoped;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainPage extends AbsBasePage {

  @Inject
  public MainPage(GuiceScoped guiceScoped) {
    super(guiceScoped);
  }

  @FindBy(tagName = "h1")
  private WebElement header;

  public  void pageHeaderShouldBeSameAs(String expectedHeader){
    assertThat(header.getText())
        .as("Header of page should be {}", expectedHeader)
        .isEqualTo(expectedHeader);
  }
}
