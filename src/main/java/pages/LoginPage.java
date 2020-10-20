package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ReadProperties;

public class LoginPage {
    protected static WebDriver driver;
    private By loginInput = By.cssSelector("input.register-new-input-text.clear-chrome");
    private By passwordInput = By.cssSelector("input.register-new-input-text.clear-chrome");
    private By profileButton = By.xpath("//li[@class='header-profile']");
    private By loginByEmailOrPasswordButton = By.xpath("(//div[@class='register-new-header head-wrapper-mail'])[2]");
    private By submitButton = By.xpath("(//button[@type='submit'])[2]");
    private By personalInformationTab = By.xpath("(//button[@type='submit'])[2]");
    private By personalNameAndLastname = By.xpath("//span[@class='ph-cab-personal-info-col-text-issue']");

    public void enterLoginAndPassword(String userName, String password) {
        driver.findElements(loginInput).get(1).sendKeys(userName);
        driver.findElements(passwordInput).get(2).sendKeys(password);

    }
public void submitLogin(){
        driver.findElement(submitButton).click();
}
    private void clickOnProfile() {
        driver.findElement(profileButton).click();
    }

    private void clickOnOptionOfLogin() {
        driver.findElement(loginByEmailOrPasswordButton).click();
    }

    public void loginAsUser() {
        clickOnOptionOfLogin();
        clickOnProfile();
    }

    private void clickOnPersonalInformationTab(){
        driver.findElement(personalInformationTab).click();
    }
    private String getPersonalNameAndLastname(){
        return driver.findElements(personalNameAndLastname).get(1).getText();
    }

    public String readNameAndLastName(){
        clickOnPersonalInformationTab();
       return getPersonalNameAndLastname();
    }


}
