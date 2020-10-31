import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;
import utils.Driver;
import utils.ReadProperties;

import java.util.concurrent.TimeUnit;


public class BaseTest {
    WebDriver webDriver;
    Driver driver = new Driver();
    ReadProperties readProperties = new ReadProperties();
    LoginPage loginPage = new LoginPage();

    @BeforeTest
    public void beforeMethod() {
        webDriver = driver.getDriver();
        driver.getDriver().manage().window().maximize();
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


    @AfterTest
    public void tearDown() {
        loginPage.clickOnYourProfile();
        loginPage.clickExit();
        Assert.assertEquals(loginPage.getPageHeader(),"Вход в личный кабинет");
        webDriver.quit();
    }

}
