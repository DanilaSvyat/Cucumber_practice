package otus.steps;

import com.google.inject.Inject;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;
import otus.driver.WebDriverFactory;
import otus.pages.MainPage;

public class MainPageStep {

  @Inject
  private MainPage mainPage;

  @Пусть ("Открыта страница курса {string}")
  public void clickLessonTileByTitle(String title){
    mainPage.clickLessonTileByTitle(title);
  }


  @Тогда("На странице отображается заголовок {string}")
  public void headerShouldBeSameAs(String expectedHeader){
    mainPage.pageHeaderShouldBeSameAs(expectedHeader);
  }

}
