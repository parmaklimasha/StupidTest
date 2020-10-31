import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DogPage;

public class DogTest extends BaseTest {
    DogPage dogPage = new DogPage();

    @Test
    public void searchAcanaMeal() {
        dogPage.clickOnDogs();
        dogPage.chooseCheckbox();
        Assert.assertTrue(dogPage.getProductName().contains("Acana"));
    }
}
