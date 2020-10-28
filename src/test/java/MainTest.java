import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class MainTest extends BaseTest {
    MainPage mainPage = new MainPage();

    @Test
    public void countPromotionsAndDiscounts() {
        Assert.assertEquals(mainPage.getNumberOfProducts(), 12);
    }


}
