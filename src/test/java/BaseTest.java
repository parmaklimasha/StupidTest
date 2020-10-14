import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Driver;


public class BaseTest {
    WebDriver webDriver;
    Driver driver = new Driver();

    @BeforeMethod
    public void beforeMethod() {
        webDriver = driver.initDriver();
    }

    @AfterMethod
    public void tearDown() {
        webDriver.quit();
    }

}
