package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;
import utils.ReadProperties;


public class LoginPage {

    protected Driver driver = new Driver();
    WebDriverWait wait = new WebDriverWait(driver.getDriver(), 30);


    ReadProperties readProperties = new ReadProperties();
    private By credentialsInput = By.cssSelector("input.register-new-input-text.clear-chrome");
    private By profileButton = By.xpath("//li[@class='header-profile']");
    private By loginByEmailOrPasswordButton = By.xpath("(//div[@class='register-new-header head-wrapper-mail'])[2]");
    private By personalInformationTab = By.cssSelector(".ph-cab-toggle-inner");
    private By personalNameAndLastname = By.cssSelector(".ph-cab-personal-info-fullname");
    private By loginProfileButton = By.cssSelector(".hidden-tablet");
    private By submitButton = By.cssSelector("#wlpeSaveRegisterButton");
    private By mainPage = By.xpath("//a[@title='PetHouse']");
    private By exitButton = By.cssSelector(".z2-profile-exit");
    private By pageHeader = By.cssSelector(".tpl-page-header");

    public String getPageHeader() {
        return driver.getDriver().findElement(pageHeader).getText();
    }

    public void clickExit() {
        driver.getDriver().findElements(exitButton).get(0).click();
    }

    public void returnMainPage() {
        driver.getDriver().findElement(mainPage).click();
    }

    public void clickSubmitLogin() {
        try {
            WebElement submitLogin = driver.getDriver().findElements(submitButton).get(1);
            submitLogin.click();
        } catch (org.openqa.selenium.StaleElementReferenceException exception) {
            WebElement submitLogin = driver.getDriver().findElements(submitButton).get(1);
            submitLogin.click();
        }

    }

    public void clickOnYourProfile() {
        try {
            WebElement button = driver.getDriver().findElements(loginProfileButton).get(0);
            button.click();
        } catch (org.openqa.selenium.StaleElementReferenceException exception) {
            WebElement button = driver.getDriver().findElements(loginProfileButton).get(0);
            button.click();
        }
    }

    public void enterLoginAndPassword(String userName, String password) {
        driver.getDriver().findElements(credentialsInput).get(3).sendKeys(userName);
        driver.getDriver().findElements(credentialsInput).get(4).sendKeys(password);

    }

    public void openWebsite() {
        driver.getDriver().get(readProperties.getUrl());
    }


    public void clickOnProfile() {
        wait.until(ExpectedConditions.elementToBeClickable(profileButton));
        driver.getDriver().findElement(profileButton).click();
    }

    private void clickOnOptionOfLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginByEmailOrPasswordButton));
        driver.getDriver().findElement(loginByEmailOrPasswordButton).click();
    }

    public void loginAsUser() {
        clickOnProfile();
        clickOnOptionOfLogin();
    }

    public void clickOnPersonalInformationTab() {
        driver.getDriver().findElements(personalInformationTab).get(1).click();
    }

    private String getPersonalNameAndLastname() {
        return driver.getDriver().findElement(personalNameAndLastname).getText();
    }

    public String readNameAndLastName() {
        clickOnPersonalInformationTab();
        return getPersonalNameAndLastname();
    }


}
