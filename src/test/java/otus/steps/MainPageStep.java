package otus.steps;

import com.google.inject.Inject;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;
import pages.MainPage;

public class MainPageStep {

  @Inject
  private MainPage mainPage;

  @Пусть("Открыта главноя страница")
  public void openMainPage() {
    mainPage.open();
  }

  @Тогда("На страницу отображается заголовок {string}")
  public void headerShouldBeSameAs(String expectedHeader){
    mainPage.pageHeaderShouldBeSameAs(expectedHeader);
  }

}
