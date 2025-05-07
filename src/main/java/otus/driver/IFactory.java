package otus.driver;

import otus.exceptions.BrowserNotSupported;
import org.openqa.selenium.WebDriver;

public interface IFactory {

    WebDriver newDriver() throws BrowserNotSupported;

}
