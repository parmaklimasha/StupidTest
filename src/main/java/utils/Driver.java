package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    WebDriver driver;


    public WebDriver initDriver() {
        String browserName = ReadProperties.browser;
        switch (browserName) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                return new ChromeDriver();
            case "safari":
                System.out.println("Safari has opened");
                return null;
            default:
                System.out.println("unsupported browser");
                return null;
        }

    }
}
