package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.util.List;

public class MainPage {
    protected Driver driver = new Driver();
    WebDriverWait wait = new WebDriverWait(driver.getDriver(), 30);
    private By firstSection = By.cssSelector("section.zoog-top-goods.__dogs");

    public int getNumberOfProducts() {
        List<WebElement> TotalCount = driver.getDriver().findElements(firstSection).get(0).findElements(By.cssSelector(".zoog-top-good-item"));
        return TotalCount.size();
    }
}
