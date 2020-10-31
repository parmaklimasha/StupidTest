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
    private By products = By.cssSelector(".zoog-top-good-item");
    private By reviewsCustomerBlock = By.cssSelector(".ph-main-reviews-slider-1");
    private By reviews = By.cssSelector(".z2-main-reviews-item-wrapper");

    public int getNumberOfProductsFirstBlock() {
        List<WebElement> TotalCount = driver.getDriver().findElements(firstSection).get(0).findElements(products);
        return TotalCount.size();
    }
    public int getNumberOfProductsSecondBlock() {
        List<WebElement> TotalCount = driver.getDriver().findElements(firstSection).get(1).findElements(products);
        return TotalCount.size();
    }
    public int getNumberOfCustomersReviews(){
        List<WebElement> TotalCount = driver.getDriver().findElement(reviewsCustomerBlock).findElements(reviews);
        return TotalCount.size();
    }
}
