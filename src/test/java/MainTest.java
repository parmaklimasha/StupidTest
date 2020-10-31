import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class MainTest extends BaseTest {
    MainPage mainPage = new MainPage();

    @Test
    public void countPromotionsAndDiscounts() {
        Assert.assertEquals(mainPage.getNumberOfProductsFirstBlock(), 12);
    }

    @Test
    public void countNewItems() {
        Assert.assertEquals(mainPage.getNumberOfProductsSecondBlock(), 6);

    }

    @Test
    public void countNewReviews() {
        Assert.assertEquals(mainPage.getNumberOfCustomersReviews(), 4);
    }
}
