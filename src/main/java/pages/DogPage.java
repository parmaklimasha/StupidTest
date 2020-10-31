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
    private By typeChoice = By.cssSelector(".ph-new-cat-brand-title");
    private By acanaProduct = By.cssSelector("div.ph-new-catalog-tovar-title");
    private By toyTab = By.cssSelector("a[href*=\"shop/sobakam/igrushki/\"");
    private By specificToy = By.cssSelector("a[href*=\"/shop/sobakam/igrushki/harleyandcho/harley-and-cho-igrushka-gus-hose-karlos-dlya-sobak\"");
    private By amountOfToy = By.cssSelector(".ph-new-catalog-price-block-uah");
    private By buyButton = By.cssSelector("a.ph-new-catalog-unit-buy");
    private By trashButton = By.cssSelector("a[href*=\"basket/\"");
    private By currentAmount = By.cssSelector(".tpl-unit-cost-big");

    public double getCurrentAmount() {
        return Double.parseDouble(driver.getDriver().findElement(currentAmount).getText().replace(",","."));

    }

    public void clickOnTrash() {
        driver.getDriver().findElement(trashButton).click();
    }

    public void addToyToTrash() {
        driver.getDriver().findElement(buyButton).click();
    }

    public double getAmountOfToy() {
        return Double.parseDouble(driver.getDriver().findElement(amountOfToy).getText());
    }

    public void clickSpecificToy() {
        driver.getDriver().findElement(specificToy).click();
        getAmountOfToy();
    }

    public void clickOnToy() {
        driver.getDriver().findElement(toyTab).click();
    }

    public void chooseHarleyCheckbox() {
        driver.getDriver().findElements(typeChoice).get(6).click();
    }

    public void clickOnDogs() {
        driver.getDriver().findElements(dogsTab).get(0).click();
    }

    public void clickOnMeal() {
        driver.getDriver().findElement(mealTab).click();
    }

    public void chooseAcanaCheckbox() {
        driver.getDriver().findElements(typeChoice).get(3).click();
    }

    public String getProductName() {
        return driver.getDriver().findElement(acanaProduct).getText();
    }
}
