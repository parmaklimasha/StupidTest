package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

public class DogPage {
    protected Driver driver = new Driver();
    WebDriverWait wait = new WebDriverWait(driver.getDriver(), 30);
    private By dogsTab = By.cssSelector("a.first-level-a");
    private By mealTab = By.cssSelector("a[href*=\"shop/sobakam/suhoi-korm\"");
    private By acanaChoice = By.cssSelector(".ph-new-cat-brand-title");
    private By acanaProduct = By.cssSelector("div.ph-new-catalog-tovar-title");

    public void clickOnDogs() {
        driver.getDriver().findElements(dogsTab).get(0).click();
        driver.getDriver().findElement(mealTab).click();
    }

    public void chooseCheckbox() {
        wait.until(ExpectedConditions.elementToBeClickable(acanaChoice));
        driver.getDriver().findElements(acanaChoice).get(3).click();
    }

    public String getProductName(){
        return driver.getDriver().findElement(acanaProduct).getText();
    }
}
