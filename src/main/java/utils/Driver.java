package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    static WebDriver driver;
    ReadProperties readProperties = new ReadProperties();


    public WebDriver initDriver() {

        String browserName = readProperties.getBrowser();
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

    public WebDriver getDriver() {
        if (driver == null) {
            driver = initDriver();
        }
        return driver;

    }
}
