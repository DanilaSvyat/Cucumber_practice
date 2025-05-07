package otus.pages;


import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import otus.annotations.Path;
import otus.scopeds.GuiceScoped;

import java.util.List;


@Path("/")
public class MainPage extends AbsBasePage {

  @Inject
  public MainPage(GuiceScoped guiceScoped) {
    super(guiceScoped);
  }



  @FindBy(xpath = "//a[contains(@href, 'lessons') and contains(@class, 'sc-zzdkm7-0')]")
  private List<WebElement> lessonItems;

  public void clickLessonTileByTitle(String title) {
    String lessonCardLocatorTemplate = String.format("//a[contains(@href, '/lessons')][.//*[text()='%s']]", title);

    ((JavascriptExecutor) driver).executeScript(
        "arguments[0].style.border='3px solid red';",
        $(By.xpath(lessonCardLocatorTemplate))
    );

    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", $(By.xpath(lessonCardLocatorTemplate)));

    $(By.xpath(lessonCardLocatorTemplate)).click();
  }
}


