import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DogPage;

public class DogTest extends BaseTest {
    DogPage dogPage = new DogPage();

    @Test
    public void searchAcanaMeal() {
        dogPage.clickOnDogs();
        dogPage.clickOnMeal();
        dogPage.chooseAcanaCheckbox();
        Assert.assertTrue(dogPage.getProductName().contains("Acana"));
    }

    @Test
    public void verifyProductInTrash() {
        dogPage.clickOnDogs();
        dogPage.clickOnToy();
        dogPage.chooseHarleyCheckbox();
        dogPage.clickSpecificToy();
       double price =  dogPage.getAmountOfToy()*0.9;
        dogPage.addToyToTrash();
        dogPage.clickOnTrash();
        Assert.assertEquals(price,(dogPage.getCurrentAmount()));


    }
}
