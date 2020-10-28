import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utils.Driver;
import utils.ReadProperties;

import java.util.concurrent.TimeUnit;


public class BaseTest {
    WebDriver webDriver;
    Driver driver = new Driver();
    ReadProperties readProperties = new ReadProperties();
    LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void beforeMethod() {
        webDriver = driver.getDriver();
        driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginPage.openWebsite();
        loginPage.loginAsUser();
        loginPage.enterLoginAndPassword(readProperties.getLogin(), readProperties.getPassword());
        loginPage.clickSubmitLogin();
        loginPage.clickOnYourProfile();
        loginPage.clickOnPersonalInformationTab();
        Assert.assertTrue(loginPage.readNameAndLastName().contains("Пармакли Мария Петровна"));
        loginPage.returnMainPage();
    }


    @AfterMethod
    public void tearDown() {
        webDriver.quit();
    }

}
