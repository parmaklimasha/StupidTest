import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ReadProperties;

public class LoginTest extends BaseTest {
    ReadProperties readProperties = new ReadProperties();
    LoginPage loginPage = new LoginPage();

    @Test(description = "Login with valid credentials")
    public void login() {
        loginPage.loginAsUser();
        loginPage.enterLoginAndPassword(readProperties.getLogin(), readProperties.getPassword());
        loginPage.submitLogin();
        Assert.assertTrue(loginPage.readNameAndLastName().contains("Пармакли Мария Петровна"));
    }


}
