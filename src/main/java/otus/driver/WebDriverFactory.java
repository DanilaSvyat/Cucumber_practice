package otus.driver;

import otus.data.BrowserData;
import otus.exceptions.BrowserNotSupported;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.Locale;

public class WebDriverFactory implements IFactory {

    private String browserName = "";

    public WebDriverFactory() {
        browserName = System.getProperty("browser", "chrome")
                .toLowerCase(Locale.ROOT);
    }

    public WebDriver newDriver() {
        boolean isSupported = false;
        for (BrowserData browserData : BrowserData.values()) {
            if (browserName.equals(browserData.name().toLowerCase(Locale.ROOT))) {
                isSupported = true;
                break;
            }
        }
        if (!isSupported) {
            try {
                throw new BrowserNotSupported(browserName);
            } catch (BrowserNotSupported ignored) {
            }
        }
        switch (BrowserData.valueOf(browserName.toUpperCase(Locale.ROOT))) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            default:
                try {
                    throw new BrowserNotSupported(browserName);
                } catch (BrowserNotSupported ignored) {
                }
        }
        return null;
    }

}
