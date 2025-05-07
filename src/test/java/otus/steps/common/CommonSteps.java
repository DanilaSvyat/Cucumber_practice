package otus.steps.common;

import com.google.inject.Inject;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Пусть;
import otus.pages.MainPage;


public class CommonSteps {

  @Inject
  private MainPage mainPage;

  @Пусть("Я открываю браузер {string}")
  public void openMainPage(String browserName) {
    System.setProperty("browser", browserName.toLowerCase());
    mainPage.open();
  }


}
